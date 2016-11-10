package bfdsl
import java.util.ArrayList
class node(word:StateWord){
  var value=word
  var nextNode: node = _;
  var jumpPtr : node = _;
  var funchar:Char = _;
}

class BF { 
  
  
      
  
  object START {
    var firstNode:node = new node(NULL);
    var currentNode:node = new node(NULL);
    var parenstack = new scala.collection.mutable.Stack[node]
    var words = new ArrayList[StateWord]
    var mem:Array[Int] = Array.ofDim[Int](3000)
    var pointer =0
    var funChar = '-'
    
    def nodeupdate(word:StateWord){
      currentNode.value match{
        case NULL => {          
          currentNode= new node(word)
          firstNode.nextNode = currentNode
          if(currentNode.value.eq(bfdsl.X))
            parenstack.push(currentNode)
          else if (currentNode.value.eq(bfdsl.C)){
            currentNode.jumpPtr=parenstack.pop()
          }
        }
        case _ => {
          currentNode.nextNode=new node(word)
          currentNode = currentNode.nextNode
          if(currentNode.value.eq(bfdsl.X))
            parenstack.push(currentNode)
          else if (currentNode.value.eq(bfdsl.C)){
            currentNode.jumpPtr=parenstack.pop()
            currentNode.jumpPtr.jumpPtr=currentNode
          }
        }
      }
    }
    def eval ={
      currentNode=firstNode
      while(!currentNode.value.eq(bfdsl.END)){
        //println(currentNode.value)
        currentNode.value match {
          case bfdsl.A => mem(pointer)+=1
          case bfdsl.M => mem(pointer)-=1
          case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.I => print(",")
          case bfdsl.L => pointer-=1
          case bfdsl.R => pointer+=1
          case bfdsl.LS => {
            if(mem(pointer)==0){
              currentNode=currentNode.jumpPtr
            }
          }
          case bfdsl.LE =>{
            if(mem(pointer)!=0){
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
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def +(word:StateWord) ={
      nodeupdate(bfdsl.A)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def + ={
      nodeupdate(bfdsl.A)     
      this
    }
    def A = {
      nodeupdate(bfdsl.A)
      this
    }
    def M(word:StateWord) = {
      nodeupdate(bfdsl.M)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def M ={
     nodeupdate(bfdsl.M)
      this
    }
    def P(word:StateWord) = {
      nodeupdate(bfdsl.P)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def P = {
      nodeupdate(bfdsl.P)
      this
    }
    def L(word:StateWord) = {
      nodeupdate(bfdsl.L)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def L ={
      nodeupdate(bfdsl.L)
      this
    }
    def R(word:StateWord) ={
      nodeupdate(bfdsl.R)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def R={
      nodeupdate(bfdsl.R)
      this
    }
    def X(word:StateWord) = {
      nodeupdate(bfdsl.X)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def X = {
      nodeupdate(bfdsl.X)
      this
    }
    def C(word:StateWord) ={
      nodeupdate(bfdsl.C)
      nodeupdate(word)
      if(word.eq(bfdsl.END))
        eval
      this
    }
    def C ={
      nodeupdate(bfdsl.C)
      this
    }
    def E(word:StateWord) = {
      this
    }
    def END ={
      nodeupdate(bfdsl.END)
      eval
      this
    }
    def fun(word:StateWord) = {
      nodeupdate(bfdsl.FUN)
      nodeupdate(word)
      this
    }
    def fun = {
      nodeupdate(bfdsl.FUN)
      this
    }
    def N(word:StateWord)= {
      nodeupdate(word)
      this      
    }
    def RESET ={
      mem=Array.ofDim(3000)
      pointer = 0
      firstNode= new node(NULL)
      currentNode= new node(NULL)
    }
     
  }
  
  
  implicit def stringtoFun(s:Char) ={
    START.funChar=s
    FUN
  }
  
}
