package macros1

import java.util.ArrayList
object OptimizeBF {

  def optim(s:String):String={
    var t=s.replaceAll(java.util.regex.Pattern.quote("[-]"),"*")
    t=s.replaceAll(java.util.regex.Pattern.quote("[->+>+<<]"),"'")
    return t
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
            l=l+"po+=X;\n".replaceAll("X", fixhex(carry(i+2))+"")
            i+=2}
          else
            l=l+"po+=1;\n"
        }
        case '[' => l=l+"while(me(po)!=0){ \n"
        case ']' => l=l+"}; \n"
        case '{' => l=l+"while(me(po)==0){ \n"
        case '}' => l=l+"}; "
        case ';' => l=l+"};\n"
        case '(' => l=l+"if(me(po)!= 0 ) {"
        case '|' => l=l+" }else { "
        case ')' => l=l+"} \n"
        case '.' => l=l+"print(me(po).asInstanceOf[Char]); \n"
        case ',' => l=l+"me(po)= readChar().asInstanceOf[Int]; \n"
        case '*' => l=l+"me(po)=0;\n"
        case ''' => l=l+"me(po+1)+=me(po);me(po+2)+=me(po);me(po)=0;\n"
        case '=' => ""
        
        case ':' =>{
           functions.add(carry(i+1)+"")
           l=l+ "fun"+carry(i+1)+" = (x:Any)=> {\n"
           i+=1
        }
        case '$'=> l=l+"return;"
        case _ =>{
          if(carry(i).isLetterOrDigit)
            l=l+" fun"+carry(i)+"(); \n"
          else if(carry(i)=='\\')
              i+=1
        }
      }
      i+=1
      
    }   
    return l 
  }
}