package bfdsl
import java.util.ArrayList
class BF {
  
  
  object START {
    var words = new ArrayList[StateWord]
    var mem:Array[Int] = Array.ofDim[Int](40)
    var pointer =0
    def A(word:StateWord) ={
      words.add(bfdsl.A)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def A = {
      words.add(bfdsl.A)
      this
    }
    def M(word:StateWord) = {
      words.add(bfdsl.M)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def M ={
     words.add(bfdsl.M)
      this
    }
    def P(word:StateWord) = {
      words.add(bfdsl.P)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def P = {
      words.add(bfdsl.P)
      this
    }
    def L(word:StateWord) = {
      words.add(bfdsl.L)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def L ={
      words.add(bfdsl.L)
      this
    }
    def R(word:StateWord) ={
      words.add(bfdsl.R)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def R={
      words.add(bfdsl.R)
      this
    }
    def X(word:StateWord) = {
      words.add(bfdsl.LS)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def X = {
      words.add(bfdsl.LS)
      this
    }
    def C(word:StateWord) ={
      words.add(bfdsl.LE)
      words.add(word)
      word match{
        case bfdsl.END => eval
        case _ =>;
      }
      this
    }
    def C ={
      words.add(bfdsl.LE)
    }
    def eval ={
      for(arg<-words.toArray()){
        arg match {
          case bfdsl.A => print("+")
          case bfdsl.M => print("-")
          case bfdsl.P => print(".")
          case bfdsl.I => print(",")
          case bfdsl.L => print("<")
          case bfdsl.R => print(">")
          case bfdsl.LS => print("[")
          case bfdsl.LE => print("]")
          case bfdsl.X => print("[")
          case bfdsl.C => print("]")
        }
      }
        
    }
    
    
    
    
    def LS(words:StateWord*) = {
      var i = 0
      while(i<words.size){
        words(i) match {
          case bfdsl.A => mem(pointer)+=1
          case bfdsl.M => {
            if( mem(pointer)>0)
              mem(pointer)-=1
            else
              mem(pointer)=0
          }
          case bfdsl.R => pointer +=1
          case bfdsl.L => pointer -=1
          case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.LS => {
            i = i+ LSR(words.toArray.drop(i))
          }
          case bfdsl.LE => {
            if (mem(pointer)==0) 
              i= words.size+1
            else
              i = -1
          }
        }
        i+=1
      }
      this
    }
    def E(word:StateWord) = {
      this
    }
    def END ={
      eval
      this
    }
    def Lx(words:StateWord*):StateWord ={
       var i = 0
      // println("IN A LOOP")
     if(mem(pointer)!=0)
      while(i<words.size){
        
        words(i) match {
          case bfdsl.A => mem(pointer)+=1
          case bfdsl.M => {
            //if( mem(pointer)>0)
              mem(pointer)-=1
            //else
            //  mem(pointer)=0
          }
          case bfdsl.R => pointer +=1
          case bfdsl.L => pointer -=1
          case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.LS => {
           // println("Found the next nested Loop")
            var x =findmatch(words.toArray,i)
            if(mem(pointer)==0)
              i=x
            else
              i = i+LSR(words.toArray.slice(i+1,x+1))+1
          }
          case bfdsl.LE => {
            //println("Mem at Pointer= "+mem(pointer))
            if(mem(pointer)>100)i/0
            if (mem(pointer)==0)
              i= words.size+1
            else 
              i= -1
          }
        }
        i+=1
      }
       
      return bfdsl.NULL
    }
    
    def LSR(words:Array[StateWord]):Int = {
     // println("Another Loop Deep "+ words(0))
    
      var i = 0
      while(true) {
       // println(mem.mkString("<", ",", ">"))
        words(i) match {
          case bfdsl.A => mem(pointer)+=1
          case bfdsl.M => {
            if( mem(pointer)>0)
              mem(pointer)-=1
            else
              mem(pointer)=0
          }
          case bfdsl.R => pointer +=1
          case bfdsl.L => pointer -=1
          case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.LS => {
            var x = findmatch(words.toArray,i)
            if(mem(pointer)==0)
              i=x
            else{
              //println(mem(pointer))
             i = i+LSR(words.toArray.slice(i+1,x+1))+1
            }
          }
          case bfdsl.LE => {
            if (mem(pointer)==0){
             //0/0
              return i
            }
            else
              i= -1
          }
        }
        i+=1
      }
      return 0
    }
    def matchCase(word:StateWord) ={
      word match{
        case bfdsl.A => mem(pointer)+=1
        case bfdsl.M => mem(pointer)-=1
        case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
        case bfdsl.R => pointer +=1
        case bfdsl.L => pointer -=1
        case bfdsl.| =>;
      }
    }
    def findmatch(words:Array[StateWord],start:Int):Int={
      var i =start+1
      var count =1
      while(count!=0){
        words(i) match{
          case bfdsl.LS => count+=1
          case bfdsl.LE => count-=1
          case _ => 0
        }
        i+=1
      }
       return i-1
    
    }
    
  }

  
  
}
