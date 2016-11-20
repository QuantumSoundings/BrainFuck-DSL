package bfdsl
import java.util.ArrayList
import scala.collection.mutable.Stack


class node(word:StateWord){
  var value=word
  var nextNode: node = _;
  var jumpPtr : node = _;
  var funchar:Char = _;
  var count = 1;
}

class BF { 
  var firstNode:node = {
    var t = new node(N)
    t.nextNode=new node(N)
    t
  }
  var currentNode:node = firstNode.nextNode
  var tempNode:node = currentNode
  var parenstack = new Stack[node]
  var ifstack = new Stack[node]
  var thenstack = new Stack[node]
  var revparenstack = new Stack[node]
  var breakstack = new Stack[Stack[node]]
  var contstack = new Stack[Stack[node]]
  var words = new ArrayList[StateWord]
  var mem:Array[Int] = Array.ofDim[Int](3000)
  var functionMap = scala.collection.mutable.Map[StateWord,node]()
  
  var pointer =0
  var funChar = '-' 
  object START {
    def nodeupdate(word:StateWord)={
       def common ={
         currentNode.nextNode=new node(word)
         currentNode = currentNode.nextNode
       }
       def fixstacks = {
         if(breakstack.head.isEmpty) breakstack.pop()
         else { while(!breakstack.head.isEmpty){ breakstack.head.pop().jumpPtr = currentNode} }
         if(contstack.head.isEmpty) contstack.pop()
         else { while(!contstack.head.isEmpty){ contstack.head.pop().jumpPtr = currentNode} }        
       }
      (currentNode.value,word) match{
        case (bfdsl.A,bfdsl.A) => currentNode.count+=1
        case (bfdsl.M,bfdsl.M) => currentNode.count+=1
        case (bfdsl.R,bfdsl.R) => currentNode.count+=1
        case (bfdsl.L,bfdsl.L) => currentNode.count+=1
        case (_,bfdsl.X) => { common;parenstack.push(currentNode);breakstack.push(new Stack[node]);contstack.push(new Stack[node])}
        case (_,bfdsl.C) => { common;currentNode.jumpPtr=parenstack.pop();currentNode.jumpPtr.jumpPtr=currentNode;fixstacks}
        case (_,bfdsl.V) => { common;revparenstack.push(currentNode);breakstack.push(new Stack[node]);contstack.push(new Stack[node])}
        case (_,bfdsl.Z) => { common;currentNode.jumpPtr=revparenstack.pop();currentNode.jumpPtr.jumpPtr=currentNode;fixstacks}
        case (_,bfdsl.F) => { common;ifstack.push(currentNode)}
        case (_,bfdsl.T) => { common;ifstack.pop.jumpPtr=currentNode;thenstack.push(currentNode)}
        case (_,bfdsl.E) => { common;if(!thenstack.isEmpty){thenstack.pop().jumpPtr=currentNode}else{ifstack.pop().jumpPtr=currentNode}}
        case (_,bfdsl.B) => { common;breakstack.head.push(currentNode)}
        case (_,bfdsl.O) => { common;contstack.head.push(currentNode)}
        case (bfdsl.U,_)=>{ tempNode=currentNode;functionMap+=(word -> new node(N));currentNode=functionMap.get(word).get;}
        case (_,bfdsl.Y) => { currentNode.nextNode=new node(bfdsl.END);currentNode=tempNode }
        case (_,bfdsl.FUN)=>{ common; currentNode.funchar=funChar;}
        case (_,bfdsl.END)=>{ common;currentNode=firstNode;eval;}
        case (_,_) => {common;}
      }
      this
    }   
    def eval :Unit ={
      //currentNode=firstNode
      //compress(currentNode)
      //println(currentNode)
      while(!currentNode.value.eq(bfdsl.END)){
        //println(currentNode.value)
        currentNode.value match {
          case bfdsl.A => mem(pointer)+=currentNode.count
          case bfdsl.M => mem(pointer)-=currentNode.count
          case bfdsl.P => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.I => print(",")
          case bfdsl.L => pointer-=currentNode.count
          case bfdsl.R => pointer+=currentNode.count
          case bfdsl.V => {
            if(mem(pointer)!=0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.Z =>{
            if(mem(pointer)==0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.X => {
            if(mem(pointer)==0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.C => {
            if(mem(pointer)!=0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.F => {
            if(mem(pointer)==0)
              currentNode = currentNode.jumpPtr
          }
          case bfdsl.T => {
            currentNode=currentNode.jumpPtr
          }
          case bfdsl.B => currentNode=currentNode.jumpPtr
          case bfdsl.O => currentNode=currentNode.jumpPtr
          case bfdsl.FUN=> {
            tempNode=currentNode
            currentNode=functionMap.get(currentNode.value).get
            eval
            currentNode=tempNode
          }
          case _ => {
            if(functionMap.contains(currentNode.value)){
              tempNode=currentNode
              currentNode=functionMap.get(currentNode.value).get
              eval
              currentNode=tempNode
            }
          }
        }
        currentNode=currentNode.nextNode
      }
      //println(mem.mkString("<", ",", ">"))      
    }

    // Program control Functions 
    def A(word:StateWord) ={ nodeupdate(bfdsl.A); nodeupdate(word)}
    def A = {nodeupdate(bfdsl.A)}
    
    def M(word:StateWord) = {nodeupdate(bfdsl.M);nodeupdate(word)}
    def M ={nodeupdate(bfdsl.M)}
    
    def P(word:StateWord) = {nodeupdate(bfdsl.P);nodeupdate(word)}
    def P = {nodeupdate(bfdsl.P)}
    
    def I(word:StateWord) ={nodeupdate(bfdsl.I);nodeupdate(word)}
    def I ={nodeupdate(bfdsl.I)}
    
    def L(word:StateWord) = {nodeupdate(bfdsl.L);nodeupdate(word)}
    def L ={nodeupdate(bfdsl.L)}
    
    def R(word:StateWord) ={nodeupdate(bfdsl.R);nodeupdate(word)}
    def R={nodeupdate(bfdsl.R)}
    
    def X(word:StateWord) = {nodeupdate(bfdsl.X);nodeupdate(word)}
    def X = {nodeupdate(bfdsl.X)}
    
    def C(word:StateWord) ={nodeupdate(bfdsl.C);nodeupdate(word)}
    def C ={nodeupdate(bfdsl.C)}
    
    def V(word:StateWord) ={nodeupdate(bfdsl.V);nodeupdate(word)}
    def V ={nodeupdate(bfdsl.V)}
    
    def Z(word:StateWord) ={nodeupdate(bfdsl.Z);nodeupdate(word)}
    def Z ={nodeupdate(bfdsl.Z)}
    
    def F(word:StateWord) ={nodeupdate(bfdsl.F);nodeupdate(word)}
    def F ={nodeupdate(bfdsl.F)}
    
    def T(word:StateWord) ={nodeupdate(bfdsl.T);nodeupdate(word)}
    def T ={nodeupdate(bfdsl.T)}
    
    def E(word:StateWord) ={nodeupdate(bfdsl.E);nodeupdate(word)}
    def E ={nodeupdate(bfdsl.E)}
    
    def U(word:StateWord) ={nodeupdate(bfdsl.U);nodeupdate(word)}
    def U ={nodeupdate(bfdsl.U)}
    
    def Y(word:StateWord) ={nodeupdate(bfdsl.Y);nodeupdate(word)}
    def Y ={nodeupdate(bfdsl.Y)}
    
    def B(word:StateWord) ={nodeupdate(bfdsl.B);nodeupdate(word)}
    def B ={nodeupdate(bfdsl.B)} 
    
    def O(word:StateWord) ={nodeupdate(bfdsl.O);nodeupdate(word)}
    def O ={nodeupdate(bfdsl.O)}
    
    def END ={
      nodeupdate(bfdsl.END)
    }
    def FUN(c:Char) = {
      funChar=c
      nodeupdate(bfdsl.FUN)
      //this
    }
    def fun(c:Char) = {
      bfdsl.FUN
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
  implicit def chartoFun(c:Char) ={
    funChar=c
    bfdsl.FUN
  }
}