import bfdsl._
import Macros._
import scala.language.postfixOps


/*object tester extends bftake2 {
  def main(args: Array[String]):Unit = {
    var s ="s"  
   // var | = 10
    10 add|add|
}
}*/
object tester extends BF{  
  def main(args: Array[String]):Unit ={
    println("Running tester");
    var me:Array[Int] = Array.ofDim(30000)
    var po = 0
    
    doBrainFuck("""[....]""" )
    println(me.mkString("<", ",", ">"))
  START R A A A A A A A X M L A A A A A A A A A R C L P R R A R M X A C A R A A R A A A X R C
  M R A A A L L A A A R C L L C R M M M M M P R M R A A A P P A A A P R M P L L A X R
  X A R A C R R C L M M M M M M M M M M M M M M P R R P A A A P M M M M M M P M M M M M M M M P R A P R A P END
    
    
 /*S R|R|R|R|R|R|R|A|A|A|A|A|A|A|A|A|A|R|A|R|A|Lx(
LS,A,A,A,A,A,LS,R,A,A,A,A,A,A,A,A,L,M,LE,R,P,L,A,A,A,A,A,A,LS,R,M,M,M,M,M,M,M,M,L,M,LE,A,L,L,L,LE,R,P,R,R,LS,
LS,M,LE,L,LS,R,A,L,M,LE,R,R,LS,L,L,A,R,A,R,M,LE,L,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,
LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,LS,M,LE,R,A,R,A,L,L,L,M,LS,R,A,L,M,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,A,R,R,R,LE,L,L,L,LE
)*/
  }
}