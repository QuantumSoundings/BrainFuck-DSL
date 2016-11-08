package bfdsl

class BF {
  object START {
    var mem:Array[Int] = Array.ofDim[Int](3000)
    var pointer =0
    def A(word:StateWord) ={
      mem(pointer)+=1
      matchCase(word)
      this
    }
    def | ={
      this
    }
    def A = {
      mem(pointer)+=1
      this
    }
    def M(word:StateWord) = {
      //if(mem(pointer)>0)
        mem(pointer)-=1
        //println(mem(pointer))
     // else
      //  mem(pointer)=0
      matchCase(word)
      this
    }
    def M ={
     // if(mem(pointer)>0)
        mem(pointer)-=1
     // else
     //   mem(pointer)=0
      this
    }
    def P(word:StateWord) = {
      print(mem(pointer).asInstanceOf[Char])
      matchCase(word)
      this
    }
    def P = {
      print(mem(pointer).asInstanceOf[Char])
      this
    }
    def L(word:StateWord) = {
      pointer -=1
      matchCase(word)
      this
      
    }
    def L ={
      pointer -=1
      this
    }
    def R(word:StateWord) ={
      pointer +=1
      matchCase(word)
      this
    }
    def R={
      pointer+=1
      this
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
    def E ={
      this
    }
    def Lx(words:StateWord*) ={
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
       
      this
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