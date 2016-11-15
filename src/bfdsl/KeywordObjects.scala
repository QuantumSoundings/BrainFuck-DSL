package bfdsl

abstract sealed class StateWord
object R extends StateWord   // >
object L extends StateWord   // <
object A extends StateWord   // +
object M extends StateWord   // -
object P extends StateWord   // .
object I extends StateWord   // ,
object N extends StateWord   // NOP
object V extends StateWord   // {
object Z extends StateWord   // }
object C extends StateWord   // [
object X extends StateWord   // ]
object F extends StateWord   // (
object | extends StateWord   // |
object E extends StateWord   // )
object U extends StateWord   // :
object Y extends StateWord   // ;
object B extends StateWord   // @

object END extends StateWord // Ends the program
object FUN extends StateWord // Designates a function

