package bfdsl
import java.util.ArrayList
class node(word:StateWord){
  var value=word
  var nextNode: node = _;
  var jumpPtr : node = _;
  var funchar:Char = _;
  var count:Int = _;
}

class BF { 
  var firstNode:node = {
    var t = new node(N)
    t.nextNode=new node(N)
    t
  }
  var currentNode:node = firstNode.nextNode   
  var parenstack = new scala.collection.mutable.Stack[node]
  var words = new ArrayList[StateWord]
  var mem:Array[Int] = Array.ofDim[Int](3000)
  var pointer =0
  var funChar = '-' 
  object START {         
    def nodeupdate(word:StateWord)={
      if(currentNode.value.eq(word) && ((currentNode.value.eq(bfdsl.A)) || (currentNode.value.eq(bfdsl.M)) || (currentNode.value.eq(bfdsl.L)) || (currentNode.value.eq(bfdsl.R)) )   )             
      {
        currentNode.count += 1
      }
      else
      {
        currentNode.nextNode=new node(word)
        currentNode = currentNode.nextNode
        currentNode.count = 1
        if(currentNode.value.eq(bfdsl.X))
          parenstack.push(currentNode)
        else if (currentNode.value.eq(bfdsl.C)){
          currentNode.jumpPtr=parenstack.pop()
          currentNode.jumpPtr.jumpPtr=currentNode
        }
        if(word.eq(bfdsl.END))
          eval
        this
      }
      this
    }   
    def eval ={
      currentNode=firstNode
      //println(currentNode)
      while(!currentNode.value.eq(bfdsl.END)){
        //println(currentNode.value)
        currentNode.value match {
          case bfdsl.A => mem(pointer)+=1*currentNode.count
          case bfdsl.M => mem(pointer)-=1*currentNode.count
          case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.I => print(",")
          case bfdsl.L => pointer-=1*currentNode.count
          case bfdsl.R => pointer+=1*currentNode.count
          case bfdsl.V => {
            if(mem(pointer)!=0){
              currentNode=currentNode.jumpPtr
            }
          }
          case bfdsl.Z =>{
            if(mem(pointer)==0){
              currentNode=currentNode.jumpPtr
            }
          }
          case bfdsl.X => {
            if(mem(pointer)==0){
              currentNode=currentNode.jumpPtr
            }
          }
          case bfdsl.C => {
            if(mem(pointer)!=0){
              currentNode=currentNode.jumpPtr
            }
          }
          case _ => ;
        }
       currentNode=currentNode.nextNode
      }
      //println(mem.mkString("<", ",", ">"))      
    }
    def A(word:StateWord) ={
      nodeupdate(bfdsl.A)
      nodeupdate(word)
    }
    def A = {
      nodeupdate(bfdsl.A)
    }
    def M(word:StateWord) = {
      nodeupdate(bfdsl.M)
      nodeupdate(word)
    }
    def M ={
     nodeupdate(bfdsl.M)
    }
    def P(word:StateWord) = {
      nodeupdate(bfdsl.P)
      nodeupdate(word)
    }
    def P = {
      nodeupdate(bfdsl.P)
    }
    def L(word:StateWord) = {
      nodeupdate(bfdsl.L)
      nodeupdate(word)
    }
    def L ={
      nodeupdate(bfdsl.L)
    }
    def R(word:StateWord) ={
      nodeupdate(bfdsl.R)
      nodeupdate(word)
    }
    def R={
      nodeupdate(bfdsl.R)
    }
    def X(word:StateWord) = {
      nodeupdate(bfdsl.X)
      nodeupdate(word)
    }
    def X = {
      nodeupdate(bfdsl.X)
    }
    def C(word:StateWord) ={
      nodeupdate(bfdsl.C)
      nodeupdate(word)
    }
    def C ={
      nodeupdate(bfdsl.C)
    }
    def E(word:StateWord) = {
      this
    }
    def END ={
      nodeupdate(bfdsl.END)
    }
    def FUN(c:Char) = {
      funChar=c
      nodeupdate(bfdsl.FUN)
      //this
    }
    def RESET ={
      mem=Array.ofDim(3000)
      pointer = 0
      firstNode= {
        var t = new node(N)
        t.nextNode=new node(N)
        t
      }
      currentNode= firstNode.nextNode  
    }    
  }  
}