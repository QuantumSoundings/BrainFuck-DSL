package bfdsl

abstract sealed class StateWord
object R extends StateWord
object L extends StateWord
object A extends StateWord

object M extends StateWord
object P extends StateWord
object I extends StateWord
object NULL extends StateWord
abstract sealed class ControlWord
object LS extends StateWord
object LE extends StateWord
object | extends StateWord
object X extends StateWord
object C extends StateWord
