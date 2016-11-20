package bfdsl

abstract sealed class StateWord
//Basic Ops
object Ri extends StateWord   // >
object Le extends StateWord   // <
object Ad extends StateWord   // +
object Mi extends StateWord   // -
object Pr extends StateWord   // .
object In extends StateWord   // ,
object No extends StateWord   // NOP
//Control Flow Loops
object L3 extends StateWord   // {
object L4 extends StateWord   // }
object L1 extends StateWord   // [
object L2 extends StateWord   // ]
object Br extends StateWord   // ' Break
object Co extends StateWord   // ` Continue
//Control Flow If statements
object If extends StateWord   // ( 
object El extends StateWord   // | 
object Ed extends StateWord   // )
//Functions
object Fu extends StateWord   // :
object Cl extends StateWord   // ;


object END extends StateWord // Ends the program
object FUN extends StateWord // Designates a function

//Function Identifiers
object A1 extends StateWord
object B1 extends StateWord
object C1 extends StateWord
object D1 extends StateWord
object E1 extends StateWord
object Fx extends StateWord
object G1 extends StateWord
object H1 extends StateWord
object I1 extends StateWord
object J1 extends StateWord
object K1 extends StateWord
object Lx extends StateWord
object M1 extends StateWord
object N1 extends StateWord
object O1 extends StateWord
object P1 extends StateWord
object Q1 extends StateWord
object R1 extends StateWord
object S1 extends StateWord
object T1 extends StateWord
object U1 extends StateWord
object V1 extends StateWord
object W1 extends StateWord
object X1 extends StateWord
object Y1 extends StateWord
object Z1 extends StateWord
object A extends StateWord
object B extends StateWord
object C extends StateWord
object D extends StateWord
object E extends StateWord
object F extends StateWord
object G extends StateWord
object H extends StateWord
object I extends StateWord
object J extends StateWord
object K extends StateWord
object L extends StateWord
object M extends StateWord
object N extends StateWord
object O extends StateWord
object P extends StateWord
object Q extends StateWord
object R extends StateWord
object S extends StateWord
object T extends StateWord
object U extends StateWord
object V extends StateWord
object W extends StateWord
object X extends StateWord
object Y extends StateWord
object Z extends StateWord
object f0 extends StateWord
object f1 extends StateWord
object f2 extends StateWord
object f3 extends StateWord
object f4 extends StateWord
object f5 extends StateWord
object f6 extends StateWord
object f7 extends StateWord
object f8 extends StateWord
object f9 extends StateWord
