package bfdsl

class bftake2 {
  import scala.collection.mutable
  abstract sealed class Instruction
  case class loop(ins:Array[Instruction]) extends Instruction
  case class addins() extends Instruction
  case class min() extends Instruction
  case class sr() extends Instruction
  case class sl() extends Instruction
  case class e() extends Instruction
  /*abstract sealed class word
    object end extends word
    object add extends word*/
  case object | extends Instruction
  case class programBuilder(start:Int){

    //object end extends word{
     // def apply() = ops(ipoint)=e()
    //}
    /*object add{ 
      /*def apply()= {
        ops(ipoint)=addins()
        ipoint+=1
        programBuilder(10)
        Unit
      }*/
      def apply():programBuilder ={
        ops(ipoint)= addins()
        ipoint+=1
        this
      }
      
    }*/
    def add(x:Instruction):programBuilder={
      ops(ipoint)= addins()
        ipoint+=1
        this
    }

    
  }
  case class programBuilder2(start:programBuilder){
    abstract sealed class word
    object end extends word{
      def apply() = ops(ipoint)=e()
    }
    def min ={
      this
    }
    
  }
  /*case class wordclass(w:word){
    def apply() ={
      
    }
  }*/
  var ops:Array[Instruction] =  Array.ofDim(200)
  var ipoint = 0
  
  implicit def startToProgram(s: Int) = {
      programBuilder(s)
  }
  implicit def test (x:programBuilder) ={
    programBuilder2(x)
  }
  /*implicit def wordtoclass (w:word) ={
    
  }*/
}