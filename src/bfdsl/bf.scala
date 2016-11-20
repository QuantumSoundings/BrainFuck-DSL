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
    var t = new node(No)
    t.nextNode=new node(No)
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
        case (bfdsl.Ad,bfdsl.Ad) => currentNode.count+=1
        case (bfdsl.Mi,bfdsl.Mi) => currentNode.count+=1
        case (bfdsl.Ri,bfdsl.Ri) => currentNode.count+=1
        case (bfdsl.Le,bfdsl.Le) => currentNode.count+=1
        case (_,bfdsl.L1) => { common;parenstack.push(currentNode);breakstack.push(new Stack[node]);contstack.push(new Stack[node])}
        case (_,bfdsl.L2) => { common;currentNode.jumpPtr=parenstack.pop();currentNode.jumpPtr.jumpPtr=currentNode;fixstacks}
        case (_,bfdsl.L3) => { common;revparenstack.push(currentNode);breakstack.push(new Stack[node]);contstack.push(new Stack[node])}
        case (_,bfdsl.L4) => { common;currentNode.jumpPtr=revparenstack.pop();currentNode.jumpPtr.jumpPtr=currentNode;fixstacks}
        case (_,bfdsl.If) => { common;ifstack.push(currentNode)}
        case (_,bfdsl.El) => { common;ifstack.pop.jumpPtr=currentNode;thenstack.push(currentNode)}
        case (_,bfdsl.Ed) => { common;if(!thenstack.isEmpty){thenstack.pop().jumpPtr=currentNode}else{ifstack.pop().jumpPtr=currentNode}}
        case (_,bfdsl.Br) => { common;breakstack.head.push(currentNode)}
        case (_,bfdsl.Co) => { common;contstack.head.push(currentNode)}
        case (bfdsl.Fu,_)=>{ tempNode=currentNode;functionMap+=(word -> new node(NULL));currentNode=functionMap.get(word).get;}
        case (_,bfdsl.Cl) => { currentNode.nextNode=new node(bfdsl.END);currentNode=tempNode }
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
          case bfdsl.Ad => mem(pointer)+=currentNode.count
          case bfdsl.Mi => mem(pointer)-=currentNode.count
          case bfdsl.Pr => print(mem(pointer).asInstanceOf[Char])
          case bfdsl.In => print(",")
          case bfdsl.Le => pointer-=currentNode.count
          case bfdsl.Ri => pointer+=currentNode.count
          case bfdsl.L3 => {
            if(mem(pointer)!=0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.L4 =>{
            if(mem(pointer)==0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.L1 => {
            if(mem(pointer)==0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.L2 => {
            if(mem(pointer)!=0)
              currentNode=currentNode.jumpPtr
          }
          case bfdsl.If => {
            if(mem(pointer)==0)
              currentNode = currentNode.jumpPtr
          }
          case bfdsl.El => {
            currentNode=currentNode.jumpPtr
          }
          case bfdsl.Br => currentNode=currentNode.jumpPtr
          case bfdsl.Co => currentNode=currentNode.jumpPtr
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
    def Ad(word:StateWord) ={ nodeupdate(bfdsl.Ad); nodeupdate(word)}
    def Ad = {nodeupdate(bfdsl.Ad)}
    
    def Mi(word:StateWord) = {nodeupdate(bfdsl.Mi);nodeupdate(word)}
    def Mi ={nodeupdate(bfdsl.Mi)}
    
    def Pr(word:StateWord) = {nodeupdate(bfdsl.Pr);nodeupdate(word)}
    def Pr = {nodeupdate(bfdsl.Pr)}
    
    def In(word:StateWord) ={nodeupdate(bfdsl.In);nodeupdate(word)}
    def In ={nodeupdate(bfdsl.In)}
    
    def Le(word:StateWord) = {nodeupdate(bfdsl.Le);nodeupdate(word)}
    def Le ={nodeupdate(bfdsl.Le)}
    
    def Ri(word:StateWord) ={nodeupdate(bfdsl.Ri);nodeupdate(word)}
    def Ri={nodeupdate(bfdsl.Ri)}
    
    def L1(word:StateWord) = {nodeupdate(bfdsl.L1);nodeupdate(word)}
    def L1 = {nodeupdate(bfdsl.L1)}
    
    def L2(word:StateWord) ={nodeupdate(bfdsl.L2);nodeupdate(word)}
    def L2 ={nodeupdate(bfdsl.L2)}
    
    def L3(word:StateWord) ={nodeupdate(bfdsl.L3);nodeupdate(word)}
    def L3 ={nodeupdate(bfdsl.L3)}
    
    def L4(word:StateWord) ={nodeupdate(bfdsl.L4);nodeupdate(word)}
    def L4 ={nodeupdate(bfdsl.L4)}
    
    def If(word:StateWord) ={nodeupdate(bfdsl.If);nodeupdate(word)}
    def If ={nodeupdate(bfdsl.If)}
    
    def El(word:StateWord) ={nodeupdate(bfdsl.El);nodeupdate(word)}
    def El ={nodeupdate(bfdsl.El)}
    
    def Ed(word:StateWord) ={nodeupdate(bfdsl.Ed);nodeupdate(word)}
    def Ed ={nodeupdate(bfdsl.Ed)}
    
    def Fu(word:StateWord) ={nodeupdate(bfdsl.Fu);nodeupdate(word)}
    def Fu ={nodeupdate(bfdsl.Fu)}
    
    def Cl(word:StateWord) ={nodeupdate(bfdsl.Cl);nodeupdate(word)}
    def Cl ={nodeupdate(bfdsl.Cl)}
    
    def Br(word:StateWord) ={nodeupdate(bfdsl.Br);nodeupdate(word)}
    def Br ={nodeupdate(bfdsl.Br)}
    
    def Co(word:StateWord) ={nodeupdate(bfdsl.Co);nodeupdate(word)}
    def Co ={nodeupdate(bfdsl.Co)}
    
    def A1(word:StateWord) ={nodeupdate(bfdsl.A1);nodeupdate(word)};def A1 ={nodeupdate(bfdsl.A1)}
    def B1(word:StateWord) ={nodeupdate(bfdsl.B1);nodeupdate(word)};def B1 ={nodeupdate(bfdsl.B1)}
    def C1(word:StateWord) ={nodeupdate(bfdsl.C1);nodeupdate(word)};def C1 ={nodeupdate(bfdsl.C1)}
    def D1(word:StateWord) ={nodeupdate(bfdsl.D1);nodeupdate(word)};def D1 ={nodeupdate(bfdsl.D1)}
    def E1(word:StateWord) ={nodeupdate(bfdsl.E1);nodeupdate(word)};def E1 ={nodeupdate(bfdsl.E1)}
    def Fx(word:StateWord) ={nodeupdate(bfdsl.Fx);nodeupdate(word)};def Fx ={nodeupdate(bfdsl.Fx)}
    def G1(word:StateWord) ={nodeupdate(bfdsl.G1);nodeupdate(word)};def G1 ={nodeupdate(bfdsl.G1)}
    def H1(word:StateWord) ={nodeupdate(bfdsl.H1);nodeupdate(word)};def H1 ={nodeupdate(bfdsl.H1)}
    def I1(word:StateWord) ={nodeupdate(bfdsl.I1);nodeupdate(word)};def I1 ={nodeupdate(bfdsl.I1)}
    def J1(word:StateWord) ={nodeupdate(bfdsl.J1);nodeupdate(word)};def J1 ={nodeupdate(bfdsl.J1)}
    def K1(word:StateWord) ={nodeupdate(bfdsl.K1);nodeupdate(word)};def K1 ={nodeupdate(bfdsl.K1)}
    def Lx(word:StateWord) ={nodeupdate(bfdsl.Lx);nodeupdate(word)};def Lx ={nodeupdate(bfdsl.Lx)}
    def M1(word:StateWord) ={nodeupdate(bfdsl.M1);nodeupdate(word)};def M1 ={nodeupdate(bfdsl.M1)}
    def N1(word:StateWord) ={nodeupdate(bfdsl.N1);nodeupdate(word)};def N1 ={nodeupdate(bfdsl.N1)}
    def O1(word:StateWord) ={nodeupdate(bfdsl.O1);nodeupdate(word)};def O1 ={nodeupdate(bfdsl.O1)}
    def P1(word:StateWord) ={nodeupdate(bfdsl.P1);nodeupdate(word)};def P1 ={nodeupdate(bfdsl.P1)}
    def Q1(word:StateWord) ={nodeupdate(bfdsl.Q1);nodeupdate(word)};def Q1 ={nodeupdate(bfdsl.Q1)}
    def R1(word:StateWord) ={nodeupdate(bfdsl.R1);nodeupdate(word)};def R1 ={nodeupdate(bfdsl.R1)}
    def S1(word:StateWord) ={nodeupdate(bfdsl.S1);nodeupdate(word)};def S1 ={nodeupdate(bfdsl.S1)}
    def T1(word:StateWord) ={nodeupdate(bfdsl.T1);nodeupdate(word)};def T1 ={nodeupdate(bfdsl.T1)}
    def U1(word:StateWord) ={nodeupdate(bfdsl.U1);nodeupdate(word)};def U1 ={nodeupdate(bfdsl.U1)}
    def V1(word:StateWord) ={nodeupdate(bfdsl.V1);nodeupdate(word)};def V1 ={nodeupdate(bfdsl.V1)}
    def W1(word:StateWord) ={nodeupdate(bfdsl.W1);nodeupdate(word)};def W1 ={nodeupdate(bfdsl.W1)}
    def X1(word:StateWord) ={nodeupdate(bfdsl.X1);nodeupdate(word)};def X1 ={nodeupdate(bfdsl.X1)}
    def Y1(word:StateWord) ={nodeupdate(bfdsl.Y1);nodeupdate(word)};def Y1 ={nodeupdate(bfdsl.Y1)}
    def Z1(word:StateWord) ={nodeupdate(bfdsl.Z1);nodeupdate(word)};def Z1 ={nodeupdate(bfdsl.Z1)}
    def A(word:StateWord) ={nodeupdate(bfdsl.A);nodeupdate(word)};def A ={nodeupdate(bfdsl.A)}
    def B(word:StateWord) ={nodeupdate(bfdsl.B);nodeupdate(word)};def B ={nodeupdate(bfdsl.B)}
    def C(word:StateWord) ={nodeupdate(bfdsl.C);nodeupdate(word)};def C ={nodeupdate(bfdsl.C)}
    def D(word:StateWord) ={nodeupdate(bfdsl.D);nodeupdate(word)};def D ={nodeupdate(bfdsl.D)}
    def E(word:StateWord) ={nodeupdate(bfdsl.E);nodeupdate(word)};def E ={nodeupdate(bfdsl.E)}
    def F(word:StateWord) ={nodeupdate(bfdsl.F);nodeupdate(word)};def F ={nodeupdate(bfdsl.F)}
    def G(word:StateWord) ={nodeupdate(bfdsl.G);nodeupdate(word)};def G ={nodeupdate(bfdsl.G)}
    def H(word:StateWord) ={nodeupdate(bfdsl.H);nodeupdate(word)};def H ={nodeupdate(bfdsl.H)}
    def I(word:StateWord) ={nodeupdate(bfdsl.I);nodeupdate(word)};def I ={nodeupdate(bfdsl.I)}
    def J(word:StateWord) ={nodeupdate(bfdsl.J);nodeupdate(word)};def J ={nodeupdate(bfdsl.J)}
    def K(word:StateWord) ={nodeupdate(bfdsl.K);nodeupdate(word)};def K ={nodeupdate(bfdsl.K)}
    def L(word:StateWord) ={nodeupdate(bfdsl.L);nodeupdate(word)};def L ={nodeupdate(bfdsl.L)}
    def M(word:StateWord) ={nodeupdate(bfdsl.M);nodeupdate(word)};def M ={nodeupdate(bfdsl.M)}
    def N(word:StateWord) ={nodeupdate(bfdsl.N);nodeupdate(word)};def N ={nodeupdate(bfdsl.N)}
    def O(word:StateWord) ={nodeupdate(bfdsl.O);nodeupdate(word)};def O ={nodeupdate(bfdsl.O)}
    def P(word:StateWord) ={nodeupdate(bfdsl.P);nodeupdate(word)};def P ={nodeupdate(bfdsl.P)}
    def Q(word:StateWord) ={nodeupdate(bfdsl.Q);nodeupdate(word)};def Q ={nodeupdate(bfdsl.Q)}
    def R(word:StateWord) ={nodeupdate(bfdsl.R);nodeupdate(word)};def R ={nodeupdate(bfdsl.R)}
    def S(word:StateWord) ={nodeupdate(bfdsl.S);nodeupdate(word)};def S ={nodeupdate(bfdsl.S)}
    def T(word:StateWord) ={nodeupdate(bfdsl.T);nodeupdate(word)};def T ={nodeupdate(bfdsl.T)}
    def U(word:StateWord) ={nodeupdate(bfdsl.U);nodeupdate(word)};def U ={nodeupdate(bfdsl.U)}
    def V(word:StateWord) ={nodeupdate(bfdsl.V);nodeupdate(word)};def V ={nodeupdate(bfdsl.V)}
    def W(word:StateWord) ={nodeupdate(bfdsl.W);nodeupdate(word)};def W ={nodeupdate(bfdsl.W)}
    def X(word:StateWord) ={nodeupdate(bfdsl.X);nodeupdate(word)};def X ={nodeupdate(bfdsl.X)}
    def Y(word:StateWord) ={nodeupdate(bfdsl.Y);nodeupdate(word)};def Y ={nodeupdate(bfdsl.Y)}
    def Z(word:StateWord) ={nodeupdate(bfdsl.Z);nodeupdate(word)};def Z ={nodeupdate(bfdsl.Z)}
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
        var t = new node(No)
        t.nextNode=new node(No)
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