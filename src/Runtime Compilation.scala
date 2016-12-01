import scala.util._
import scala.language.experimental.macros
import scala.reflect.macros._
import scala.reflect.runtime._
import scala.reflect.runtime.currentMirror
import scala.tools.reflect.ToolBox
import java.util.ArrayList
import macros1._
//import com.twitter.util.Eval
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
 
  def runBF(s:String):Unit={
    println("Performing Optimizations")
    var prog = optim(s)
    prog = replacements(prog)
    var z = new Base64
    var temp = ""
    for(x<- 0 to 61){
      temp = temp+"var fun"+z.intToString(x) + " = (x:Any) => { }\n"
    }
    
    //println(temp)
    prog = "println(\"Begining BF Program\");var me:Array[Int] = Array.ofDim[Int](30000);var po=0;" +temp+prog+"println(me.mkString(\"<\", \",\", \">\")+\" \"+po)"
    //println(" " + prog)
    val cm = universe.runtimeMirror(getClass.getClassLoader)
    val tb = cm.mkToolBox()
    //println("Starting BF Program Parsing")
    //com.twitter.util.Eval(prog)
    
    //println(tb.parse(prog))
    tb.eval(tb.parse(prog))
    println("Finished Executing Returning Control")
  }
  def optim(s:String):String={
    var t=s.replaceAll(java.util.regex.Pattern.quote("[-]"),"|")
    t=s.replaceAll(java.util.regex.Pattern.quote("[->+>+<<]"),"'")
    return t
  }
  def replacements(s:String):String = {
    var functions = new ArrayList[String]
     def fixhex(c:Char):String={
      val base = new Base64
      var out=""
      out = base.stringToInt(c+"")+""
      //println(out)
      return out
    }
    var i = 0
    var v = reduce(s)
    var l = ""
    //println(v)
    var carry = v.toCharArray()
    while(i<carry.length){
      //println(l)
      carry(i) match{        
        case '+' => {
          if(i+1<carry.length&&carry(i+1)=='!'){
            l=l+"me(po)+="+fixhex(carry(i+2))+";\n"
            i+=2}
          else
            l=l+"me(po)+=1;\n"
        }
        case '-' =>  {
          if(i+1<carry.length&&carry(i+1)=='!'){
            l=l+"me(po)-="+fixhex(carry(i+2))+";\n"
            i+=2}
          else
            l=l+"me(po)-=1;\n"
        }
        case '<' =>{
          if(i+1<carry.length&&carry(i+1)=='!'){
            l=l+"po-=X;\n".replaceAll("X",fixhex(carry(i+2))+"")
            i+=2}
          else
            l=l+"po-=1;\n"
        }
        case '>' =>{
          if(i+1<carry.length&&carry(i+1)=='!'){
            l=l+"po+=X\n;".replaceAll("X", fixhex(carry(i+2))+"")
            i+=2}
          else
            l=l+"po+=1;\n"
        }
        case '[' => l=l+"while(me(po)!=0){\n	 "
        case ']' => l=l+"};\n "
        case ';' => l=l+"};\n"
        case '.' => l=l+"print(me(po).asInstanceOf[Char]);\n "
        case ',' => l=l+"me(po)= readChar().asInstanceOf[Int];\n "
        case '|' => l=l+"me(po)=0;\n"
        case ''' => l=l+"me(po+1)+=me(po);me(po+2)+=me(po);me(po)=0;\n"
        case ':' =>{
           functions.add(carry(i+1)+"")
           l=l+ "fun"+carry(i+1)+" = (x:Any)=> {"
           i+=1
        }
        case '$'=> l=l+"return;\n"
        case _ =>{
          if(carry(i).isLetterOrDigit)
            l=l+" fun"+carry(i)+"(); \n"   
        }
      }
      i+=1
    }   
    return l 
  }
  def reduce(s:String):String={
    var i=0
    var l = s
    def targetReduce(key:String):Unit={
      val base = new Base64
      def buildreplacer:String={
        var out = ""
        for(x <- 1 to 61){
          out+=key
        }
        return out
      }
      var rep =buildreplacer;
      i=61
      while(i>1){
        l=l.replaceAll(rep,key+"!"+base.intToString(i))
        rep=rep.substring(key.length)
        i-=1
      }
    }
    targetReduce("\\+")
    targetReduce("-")
    targetReduce(">")
    targetReduce("<")
    return l
  }
  def main(args: Array[String]):Unit={
    var t = """
:z[<10>-];  :y[510>-];  :x[<20>-];  :w[52>-];
:v[<2>-];  :u[520>-];  :t[<1>-];  :s[51>-];

:0++;  :100;  :211;  :3>2;  :4>3;  :5<+;  :654;  :70+;  :8x6;  :931;
:A<-;  :B+w;  :CA4;  :D08;  :E1B;  :F37;  :Gt9;  :H04;  :IC1;  :J<H;
:Ky9;  :LF8;  :M>4;  :N3D;  :O0x;  :P7x;  :Q0v;  :R0y;  :SQJ;  :T+v;
:UEC;  :V7K;  :W9B;  :XGR;  :YDP;  :Z-4;  :atL;  :b3O;  :c1S;  :dAZ;
:e+s;  :f41;  :gv6;  :h5M;  :iIT;  :j78;  :kCD;  :lt2;  :mGB;  :nwN;
:oEd;  :pIn;  :q7u;  :r1w;

>M1+z97yFxNUq4RIVTiWCqfykE6YWCqfyIVxWCq40K7ybJUq4RLE9SUqfKT9VSUqfKxC
YWCqMeFx97yFxbheN1VTiWAMeWdDE6Y4eWd1Vx4ebJ1VB6OhebJjE9Q<0MeWi9SDOheW
IxCPheLPb5>MXLUEpoaOJXNDcaP3miNGxIgr9wFl0MXLUEpoaOJXNDc7lH1KgrkaPNtb
L1xCPFt3GQ9gooGVBCGgcjEFxbFl0MXLUEpoaOJXNDcaP3miNGxIgr9w3e53030>M1+z
97yFxNUDY4RIVTiWkYfykE6YWkYfyIVxWkY40K7ybJUDY4RLE9SUDYfKT9VSUDYfKxkr
W6OhRpE6YM1yNPf+z97yFxbhRIVTiWAM1ykE6YfyIVx40KVB6OhRLE9Q<0M1KT9SDOh1
KxCPhQCPbh1+zLGw6jcO5>MXLUEpaOJXNDcaP3miNGxIgr9wFl0MXLUEpaOJXNDc7lH1
KgrkGVBCtbL1xCPFt3GQ9gooGVBCGgcjEFxbFl0MXLUEpaOJXNDcaP3miNGxIgr9w3e5
3030MXLUEpoaOJXNDc7lHR6jmCjmiNmdUjcD7t3G0KBFu3mdjr6DGw6jcD7l0>


:u<<[[[<]<]<]>>;  :v<<[[<]<]>;  :w>[[>]>];  :x>[>];  :y>[.>];  :z<<[<];

:0yw;  :1xx;  :2zz;  :3yv;  :43v;  :501;  :60w;  :7yu;  :842;  :90x;
:Ay>;  :B62;  :C71;  :DzA;  :Ex5;  :F82;  :G4D;  :H8z;  :I4v;  :Jx6;
:KBz;  :LB2;  :M1A;  :Nw2;  :O51;  :Px0;  :Q97;  :R9C;  :S6D;  :T11;
:U07;  :V0C;  :W5C;  :X57;  :Yx9;  :ZMw;  :aI6;  :bIZ;  :cIJ;  :dGN;
:eE1;  :f4M;  :g08;  :h58;  :i98;  :jxB;  :k0F;  :l5F;  :m9F;  :n0H;
:o5H;  :p9H;  :qxK;  :rG1;  :sJD;  :txL;

u0U0Q9X9U9Q5X5U5Q5E75P75xQOXOUOQLXLULQKXKUKQBXBUBQS17S7Sx7617676x7PX
PUPQYXYUYQEXEUEQEE7EP7ExQeXeUeQtXtUtQqXqUqQjXjUjQs17s7sx7J17J7JxC0W0
V0R9W9V9R5W5V5R5EC5PC5xROWOVORLWLVLRKWKVKRBWBVBRS1CSCSxC61C6C6xCPWPV
PRYWYVYREWEVEREECEPCExReWeVeRtWtVtRqWqVqRjWjVjRs1CsCsxCJ1CJCJxF0l0k0
m9l9k9m5l5k5m5EF5PF5YFOlOkOmLlLkLmKlKkKmBlBkBmS1FSFSxF61F6F6xH0o0n0
p9o9n9p5o5n5p5EH5PH5YHOoOnOpLoLnLpKoKnKpBoBnBpS1HSHSxH61H6H6x80h0g0i
9h9g9i5h5g5i5E85P85Y8OhOgOiLhLgLiKhKgKiBhBgBiS18S8Sx8618686xG5G0G9GE
GPGYr5r0r9rErPrYGT5GT0GT9d25d20d29dz5dz0dz9d5d0d9GwD1GwDGwDxGw1GwGwP
f404Yfx494Ef1454Exf1x45x4efT4O4exfTx4Ox4qfNz4K4jfN4B4Jz4Zz46z4Jbacxb
xaxc1b1a1c1xb1xa1xcTbTaTcTxbTxaTxcT1bT1aT1cN2bN2aN2cNzbNzaNzcN532032
93zbwzawD1x705y
""".replaceAll("\n","").replaceAllLiterally(" ", "")
    println(mem.mkString("<", ",", ">"))
    //var x = io.Source.fromURL(io.Source.getClass().getResource("/mbrot.txt")).mkString.replaceAll("[\n\r]","")
    runBF(t)
    //var BFM = new Bfinterpreter
    //println("Running Same Program in interpreter")
    //BFM.inter(x.toCharArray())
  }
}
