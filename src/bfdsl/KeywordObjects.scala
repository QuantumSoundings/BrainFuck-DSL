
package bfdsl

trait Tree[+StateWord]
case class Leaf[StateWord](word: StateWord) extends Tree[StateWord]
case class Branch[StateWord](left:Tree[StateWord],right:Tree[StateWord]) extends Tree[StateWord]

object Tree {
  def apply(word:StateWord) ={
    
    this   
  }
}
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
object E extends StateWord

case class tree(word:StateWord){
  
}
