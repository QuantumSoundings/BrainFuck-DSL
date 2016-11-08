import scala.util._
import scala.language.experimental.macros
import scala.reflect.macros._
import scala.reflect.runtime._
import scala.reflect.runtime.currentMirror
import scala.tools.reflect.ToolBox


object Bfmachine{
 var mem:Array[Int] = Array.ofDim[Int](30000)
  var pointer=0
  def inter(s:Array[Char]):Unit ={
    var i=0
    def jump(dir:Int)={
        var loop = 1
        while(loop>0){
           i+= dir
           loop+=(s(i) match{
             case '[' => dir
             case ']' => -dir
             case _ => 0
           })
        }
    }
    while( i < s.length){
      var com = s(i)
      com match{
        case '+' =>mem(pointer)+=1
        case '-' =>mem(pointer)-=1
        case '<' =>if(pointer-1<0)pointer=0 else pointer=pointer-1
        case '>' =>if(pointer+1>30000)pointer=30000 else pointer=pointer+1
        case '.' =>print(mem(pointer).asInstanceOf[Char])
        case ',' =>mem(pointer)= readChar().asInstanceOf[Int]
        case '[' =>if(mem(pointer)==0)jump(1)
        case ']' =>if(mem(pointer)!=0)jump(-1)
        case _ => ;
      }
      i+=1
    }
    println(i)
  }  
}

object test {
  var mem:Array[Int] = Array.ofDim[Int](30000)
  var pointer=0
  def a ={ mem(pointer)=mem(pointer)+1;}
  def m ={ mem(pointer)=mem(pointer)-1}
  def l = {pointer-=1}
  def r = {pointer+=1}
  def p ={ print(mem(pointer).asInstanceOf[Char])}
  def i ={ mem(pointer)= readChar().asInstanceOf[Int]}
  def s = "while(mem(pointer)!=0){"
  def loopImpl[A: c.WeakTypeTag](c: Context)(f:c.Expr[A]):c.Expr[Option[A]] ={
    import c.universe._
    c.Expr[Option[A]](q"""while(mem(pointer)!=0){$f}""");
  }
  def replacements(s:String):String = {
    def fixhex(c:Char):String={
      var out=""
      out = java.lang.Integer.parseInt(c+"", 36)+""
      return out
    }
    var i = 0
    var v = reduce(s)
    var l = ""
    //println(v)
    var carry = v.toCharArray()
    while(i<carry.length){
      carry(i) match{
        
        case '+' => {
          //println(i+" "+carry.length)
          if(i+1<carry.length&&(carry(i+1).isDigit||carry(i+1).isLetter)){
            l=l+"m(p)+="+fixhex(carry(i+1))+";"
            i+=1}
          else
            l=l+"m(p)+=1;"
        }
        case '-' =>  {
          if(i+1<carry.length&&(carry(i+1).isDigit||carry(i+1).isLetter)){
            l=l+"m(p)-="+fixhex(carry(i+1))+";"
            i+=1}
          else
            l=l+"m(p)-=1;"
        }
        case '<' =>{
          if(i+1<carry.length&&(carry(i+1).isDigit||carry(i+1).isLetter)){
            //l=l+"if(pointer > X){ pointer-=X; } else 0;".replaceAll("X", carry(i+1)+"")
            l=l+"p-=X;".replaceAll("X",fixhex(carry(i+1))+"")
            i+=1}
          else
            l=l+"p-=1;"
        }
        case '>' =>{
          if(i+1<carry.length&&(carry(i+1).isDigit||carry(i+1).isLetter)){
            l=l+"p+=X;".replaceAll("X", fixhex(carry(i+1))+"")
            i+=1}
          else
            l=l+"p+=1;"
        }
        case '[' => l=l+"while(m(p)!=0){ "
        case ']' => l=l+"}; "
        case '.' => l=l+"print(m(p).asInstanceOf[Char]); "
        case ',' => l=l+"m(p)= readChar().asInstanceOf[Int]; " 
        case _ => l=l+carry(i);
      }
      i+=1
    }
    
    return l
      
  }
  def reduce(s:String):String={
    var i=2
    var l = s
    def targetReduce(key:String):Unit={
      i=36
      while(i>1){
      //println("in the loop")
      if(i>10)
        l=l.replaceAll("(["+key+s"])\\1{$i}",key+java.lang.Integer.toString(i,36))
      else
        l=l.replaceAll("(["+key+s"])\\1{$i}",key+s"$i")
      i-=1
      }
    }
    targetReduce("\\+")
    targetReduce("-")
    targetReduce(">")
    targetReduce("<")
    //println(l)
    return l
  }
  
  def main(args: Array[String]):Unit={
    var t = "+>++>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<------------------------++++>++++++>+++++++++++++>++++++++++++++++++++++++++++++++++."
    //println(t.replaceAll("([\\+])\\1{2}","+2"))
    
    var v=replacements(t)
    v= "var m:Array[Int] = Array.ofDim[Int](3000);var p=0;"+v+"println(m.mkString(\"<\", \",\", \">\"))"
    val cm = universe.runtimeMirror(getClass.getClassLoader)
    val tb = cm.mkToolBox()
    println(v.length +" "+v)
    tb.eval(tb.parse(v))
   //println(t.toCharArray().length)
    //Bfmachine.inter(t.toCharArray())
  }
}
