package bfdsl
import java.util.ArrayList
import scala.collection.mutable.Stack

class node(word:StateWord){
  var value=word
  var nextNode: node = _;
  var jumpPtr : node = _;
  var count = 1;
}

class BF {
  //The memory and pointer for the BrainFuck Machine
  var mem:Array[Int] = Array.ofDim[Int](3000)
  var pointer =0

  object START {
    //Data structures for building the nodes.
    var functionMap = scala.collection.mutable.Map[StateWord,node]() 
    var firstNode:node = {var t = new node(N);t.nextNode=new node(N);t}
    var currentNode:node = firstNode.nextNode
    var tempNode:node = currentNode
    var fNode:node = currentNode
    var parenstack = new Stack[node]
    var ifstack = new Stack[node]
    var thenstack = new Stack[node]
    var revparenstack = new Stack[node]
    var breakstack = new Stack[Stack[node]]
    var contstack = new Stack[Stack[node]]
    var input=""
    
    //Main function that handles the nodes and some optimization
    def nodeupdate(word:StateWord)={
       def common ={
         currentNode.nextNode=new node(word)
         currentNode = currentNode.nextNode
       }
       def check:Unit ={
         if(parenstack.isEmpty&&ifstack.isEmpty&&thenstack.isEmpty&&revparenstack.isEmpty&&breakstack.isEmpty&&contstack.isEmpty)
           return;
         else
           println("Warning there are unmatched control flow commands")
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
        case (_,bfdsl.U) => { fNode=currentNode; common;}
        case (bfdsl.U,_) => { functionMap+=(word -> new node(N));currentNode=functionMap.get(word).get;}
        case (_,bfdsl.Y) => { currentNode.nextNode=new node(bfdsl.END);currentNode=fNode;}
        case (_,bfdsl.END)=>{ common;currentNode=firstNode;check;eval(new node(N));}
        case (_,_) => {common;}
      }
      this
    }
    //Executes the created nodes
    def eval(prevNode:node) :node ={
      while(true){
        //println(currentNode.value + " " +currentNode.count)
        currentNode.value match{
          case bfdsl.A => {mem(pointer)+=currentNode.count ;currentNode=currentNode.nextNode}
          case bfdsl.M => {mem(pointer)-=currentNode.count;currentNode=currentNode.nextNode}
          case bfdsl.P => {print(mem(pointer).asInstanceOf[Char]);currentNode=currentNode.nextNode}
          case bfdsl.L => {pointer-=currentNode.count;currentNode=currentNode.nextNode}
          case bfdsl.R => {pointer+=currentNode.count;currentNode=currentNode.nextNode}
          case bfdsl.X|bfdsl.Z|bfdsl.F => {if(mem(pointer)==0)currentNode=currentNode.jumpPtr.nextNode;else currentNode=currentNode.nextNode}
          case bfdsl.C|bfdsl.V => {if(mem(pointer)!=0)currentNode=currentNode.jumpPtr.nextNode;else currentNode=currentNode.nextNode}        
          case bfdsl.T => currentNode=currentNode.jumpPtr.nextNode
          case bfdsl.B => currentNode=currentNode.jumpPtr.nextNode
          case bfdsl.O => currentNode=currentNode.jumpPtr.nextNode
          case bfdsl.I => {if(input.isEmpty()){input=scala.io.StdIn.readLine()}else{mem(pointer)=input.charAt(0).asInstanceOf[Int];input=input.substring(1)};currentNode=currentNode.nextNode}
          case bfdsl.END => return prevNode;
          case _ => {
            if(functionMap.contains(currentNode.value)){
              tempNode=currentNode
              currentNode=functionMap.get(currentNode.value).get
              currentNode=eval(tempNode);
            }
            currentNode=currentNode.nextNode
          }
        }
      }
      return prevNode;
    }

    // Program control Functions 
    def A(word:StateWord) ={nodeupdate(bfdsl.A);nodeupdate(word)};def A ={nodeupdate(bfdsl.A)}
    def M(word:StateWord) ={nodeupdate(bfdsl.M);nodeupdate(word)};def M ={nodeupdate(bfdsl.M)}
    def P(word:StateWord) ={nodeupdate(bfdsl.P);nodeupdate(word)};def P ={nodeupdate(bfdsl.P)}
    def I(word:StateWord) ={nodeupdate(bfdsl.I);nodeupdate(word)};def I ={nodeupdate(bfdsl.I)}
    def L(word:StateWord) ={nodeupdate(bfdsl.L);nodeupdate(word)};def L ={nodeupdate(bfdsl.L)}
    def R(word:StateWord) ={nodeupdate(bfdsl.R);nodeupdate(word)};def R ={nodeupdate(bfdsl.R)}
    def X(word:StateWord) ={nodeupdate(bfdsl.X);nodeupdate(word)};def X ={nodeupdate(bfdsl.X)}
    def C(word:StateWord) ={nodeupdate(bfdsl.C);nodeupdate(word)};def C ={nodeupdate(bfdsl.C)}
    def V(word:StateWord) ={nodeupdate(bfdsl.V);nodeupdate(word)};def V ={nodeupdate(bfdsl.V)}
    def Z(word:StateWord) ={nodeupdate(bfdsl.Z);nodeupdate(word)};def Z ={nodeupdate(bfdsl.Z)}
    def F(word:StateWord) ={nodeupdate(bfdsl.F);nodeupdate(word)};def F ={nodeupdate(bfdsl.F)}
    def T(word:StateWord) ={nodeupdate(bfdsl.T);nodeupdate(word)};def T ={nodeupdate(bfdsl.T)}
    def E(word:StateWord) ={nodeupdate(bfdsl.E);nodeupdate(word)};def E ={nodeupdate(bfdsl.E)}
    def U(word:StateWord) ={nodeupdate(bfdsl.U);nodeupdate(word)};def U ={nodeupdate(bfdsl.U)}
    def Y(word:StateWord) ={nodeupdate(bfdsl.Y);nodeupdate(word)};def Y ={nodeupdate(bfdsl.Y)}
    def B(word:StateWord) ={nodeupdate(bfdsl.B);nodeupdate(word)};def B ={nodeupdate(bfdsl.B)}
    def O(word:StateWord) ={nodeupdate(bfdsl.O);nodeupdate(word)};def O ={nodeupdate(bfdsl.O)}
    
    // Function Functions
    def f0(word:StateWord) ={nodeupdate(bfdsl.f0);nodeupdate(word)};def f0 ={nodeupdate(bfdsl.f0)}
    def f1(word:StateWord) ={nodeupdate(bfdsl.f1);nodeupdate(word)};def f1 ={nodeupdate(bfdsl.f1)}
    def f2(word:StateWord) ={nodeupdate(bfdsl.f2);nodeupdate(word)};def f2 ={nodeupdate(bfdsl.f2)}
    def f3(word:StateWord) ={nodeupdate(bfdsl.f3);nodeupdate(word)};def f3 ={nodeupdate(bfdsl.f3)}
    def f4(word:StateWord) ={nodeupdate(bfdsl.f4);nodeupdate(word)};def f4 ={nodeupdate(bfdsl.f4)}
    def f5(word:StateWord) ={nodeupdate(bfdsl.f5);nodeupdate(word)};def f5 ={nodeupdate(bfdsl.f5)}
    def f6(word:StateWord) ={nodeupdate(bfdsl.f6);nodeupdate(word)};def f6 ={nodeupdate(bfdsl.f6)}
    def f7(word:StateWord) ={nodeupdate(bfdsl.f7);nodeupdate(word)};def f7 ={nodeupdate(bfdsl.f7)}
    def f8(word:StateWord) ={nodeupdate(bfdsl.f8);nodeupdate(word)};def f8 ={nodeupdate(bfdsl.f8)}
    def f9(word:StateWord) ={nodeupdate(bfdsl.f9);nodeupdate(word)};def f9 ={nodeupdate(bfdsl.f9)}
    
    
    def END ={
      nodeupdate(bfdsl.END)
    }
    def RESET ={
      mem=Array.ofDim(3000)
      pointer = 0
      functionMap = functionMap.empty
      firstNode = {var t = new node(N);t.nextNode=new node(N);t}
      currentNode = firstNode.nextNode
      tempNode=currentNode
      fNode=currentNode
      parenstack = new Stack[node]
      ifstack = new Stack[node]
      thenstack = new Stack[node]
      revparenstack = new Stack[node]
      breakstack = new Stack[Stack[node]]
      contstack = new Stack[Stack[node]]
      println("")
    }   
  }

}