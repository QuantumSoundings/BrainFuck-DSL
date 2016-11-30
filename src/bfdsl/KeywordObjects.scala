package bfdsl

abstract sealed class StateWord
// Basic Operations
object R extends StateWord   // >
object L extends StateWord   // <
object A extends StateWord   // +
object M extends StateWord   // -
object P extends StateWord   // .
object I extends StateWord   // ,
object N extends StateWord   // NOP
//Control Flow Loops
object V extends StateWord   // {
object Z extends StateWord   // }
object C extends StateWord   // [
object X extends StateWord   // ]
object B extends StateWord   // '
object O extends StateWord   // `
//Control Flow If statements
object F extends StateWord   // (
object T extends StateWord   // |
object E extends StateWord   // )
//Functions
object U extends StateWord   // :
object Y extends StateWord   // ;
//Available function names
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


object END extends StateWord // Ends the program

