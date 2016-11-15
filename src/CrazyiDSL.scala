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
    
    //expand(""">++++++++[-<+++++++++>]<.>>+>-[+]++>++>+++[>[->+++<<+++>]<<]>-----.>->+++..+++.>-.<<+[>[+>+]>>]<--------------.>>.+++.------.--------.>+.>+.""" )
    //println(me.mkString("<", ",", ">"))
    //START A A A A A M FUN 'x' A 'c'
  
    
    
    START A A A A A A A A X R A A A A X R A A R A A A R A A A R A L L L L M C R A R A R
  M R R A X L C L M C R R P R M M M P A A A A A A A P P A A A P R R P L M P L P A A A P M
  M M M M M P M M M M M M M M P R R A P R A A P END;
   
START RESET; 

START A A A A A A A A A A A A A X M R A A R R R A A A A A R A A R A L L L L L L C R R R R R A A A A A A R M M M R R R R R R R R R R A A A A A A A A A A A A A A A X X 
START R R R R R R R R R C A X L L L L L L L L L C R R R R R R R R R M C A X R R R R R R R R X M C R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R X M C A 
START L L L L L L L A A A A A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R R R R A R R R R R R R R R R R R R R R R R R R R R R R R R R 
START R A L L L L L L L L L L L L L L L L L X L L L L L L L L L C R R R X M C A X R R R R R R X R R R R R R R X M C R R C L L L L L L L L L X L L L L L L L L L C R R 
START R R R R R X M C A L L L L L L A A A A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R R R A L L L L L L A A A A A A A X M X M R R R 
START R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R R R A L L L L L L L L L L L L L L L L X L L L L L L L L L C R R R X X M C R R R R R R X R R R R R 
START R R X M L L L L L L A R R R R R R C L L L L L L X M R R R R R R A L L A L L L A L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R 
START X R R R R R R R R X M L L L L L L L A R R R R R R R C L L L L L L L X M R R R R R R R A L L A L L L A L L C R R R R R R R R C L L L L L L L L L X L L L L L L L 
START L L C R R R R R R R X M L L L L L L L A R R R R R R R C L L L L L L L X M R R R R R R R A L L A L L L L L C R R R R R R R R R A A A A A A A A A A A A A A A X X 
START R R R R R R R R R C A R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A X 
START R A R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R X M L L L L A R R R R C L L L L X M R R R R A L L L L L X M R R X 
START M L L A R R C L L X M R R A R R A L L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R R R R R R R R C L L L L L L L 
START L L X R X M R R R R R R R R R A L L L L L L L L L C L L L L L L L L L L C R X M R R R R R R R R R A L L L L L L L L L C L A R R R R R R R R C L L L L L L L L L 
START X R X M C L M R R R R X M L L L L A R X L M R M L L L L L L A R R R R R R C L X M R A L C R R R R C L L L X M R R R A L L L C L A L L L L L L L L L C R R R R R 
START R R R R X R A R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R R X M L L L L L A R R R R R C L L L L L X M R R R R R A 
START L L L L L L X M R R R X M L L L A R R R C L L L X M R R R A R A L L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R 
START R R R R R R R C L L L L L L L L L X R R X M R R R R R R R R R A L L L L L L L L L C L L L L L L L L L L L C R R X M R R R R R R R R R A L L L L L L L L L C L L 
START A R R R R R R R R C L L L L L L L L L X R X M C L M R R R R X M L L L L A R X L M R M L L L L L L A R R R R R R C L X M R A L C R R R R C L L L X M R R R A L L 
START L C L A L L L L L L L L L C R R R R R R R R R X R R R R X M L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L A R R R R R R R R R R R R R 
START R R R R R R R R R R R R R R R R R R R R R R R C R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R A A A A A A A A A A A A A A A X X R R R R 
START R R R R R C L L L L L L L L L M L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A R R R R R R R R R R R R R R R R R R R R R A L L L X L L L L L L 
START L L L C R R R R R R R R R X R R R X M L L L M R R R C A L L L X M R R R M R X M L L L L A R R R R C L L L L X M R R R R A L L L L L L L L L L L L L X L L L L L 
START L L L L C R R R R X M C A R R R R R X R R R R R R R R R C R A L C C A R R R R X M L L L L M R R R R C A L L L L X M R R R R M L X M L L L A R R R C L L L X M R 
START R R A L L L L L L L L L L L L X L L L L L L L L L C R R R X M C A R R R R R R X R R R R R R R R R C R X M C A L C C A R X M L X R R R R R R R R R C L L L L L L 
START L L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C L L L L L L L X M R A R R R M L L L L C R R R R R R R R R A A A A A A A A A A A A A A A A A A A 
START A A A A A A A R R X M L L L L A R R R R C L L L L X M R R R R A L L X M C L L C R R X L L L L L L L A L X M L A R R R R A L L X M C C R X M L L X M R A R R R M 
START L L L L C R R R C R R R R R R R R R R R R R X R R X M C R X M C R X M C R R R R R C L L L L L L L L L X L L L L L L L L L C R R R X M C R R R R R R X R R R R R 
START X M L L L L A R R R R C L L L L X M R R R R A L L L A L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R R X M L L L L L L L L 
START L A R R R R R R R R R C R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R A A A A A A A A A A A A A A A X X R R R R R R R R R C A R X M 
START C R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A X R A R R R R R R R R C L L L 
START L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R R X M L L L L L A R R R R R C L L L L L X M R R R R R A L L L L L L X M R R X M L L A R R C L 
START L X M R R A R A L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R R R R R R R R C L L L L L L L L L X R X M R R R R 
START R R R R R A L L L L L L L L L C L L L L L L L L L L C R X M R R R R R R R R R A L L L L L L L L L C L A R R R R R R R R C L L L L L L L L L X R X M C L M R R R 
START X M L L L A R X L M R M L L L L L L L A R R R R R R R C L X M R A L C R R R C L L X M R R A L L C L A L L L L L L L L L C R R R R R R R R R X R R R R R R X M L 
START L L L L A R R R R R C L L L L L X M R R R R R A L L L L A L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R A R R R R R R R R 
START C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R R X M L L L L L A R R R R R C L L L L L X M R R R R R A L L L L L L X M R R X M L L A 
START R R C L L X M R R A R R A L L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R R R R R R R R C L L L L L L L L L X R 
START X M R R R R R R R R R A L L L L L L L L L C L L L L L L L L L L C R X M R R R R R R R R R A L L L L L L L L L C L A R R R R R R R R C L L L L L L L L L X R X M 
START C L M R R R R X M L L L L A R X L M R M L L L L L L A R R R R R R C L X M R A L C R R R R C L L L X M R R R A L L L C L A L L L L L L L L L C R R R R R R R R R 
START X R R R R X M L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L A R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R 
START C R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R R R X M L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L A R 
START R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R C R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R A A A A A A A A 
START A A A A A A A X X R R R R R R R R R C L L L L L L L L L M L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A X R R R R R R R R X M L L L L L L L A 
START R R R R R R R C L L L L L L L X M R R R R R R R A L L L L L L A L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R R R R R R X 
START M C R R R C L L L L L L L L L X L L L L L L L L L C R R R R A R X M L M L L L L A R R R R R C R X M L L L L L L X M R R R R R A L A A L L L L C R R R R R X M L 
START L L L L A R R R R R C L M R A R C L X M R A L C L L L L L X M R R R R R A L L L L L C R R R R R R X M C L L L L L L A R R R R X M L L L L M R R R R C A L L L L 
START X M R R R R M R R R R R X R R X M L L M R R C A L L X M R R M R X M L L L A R R R C L L L X M R R R A L L L L L L L L L L L L X L L L L L L L L L C R R R X M C 
START A R R R R R R X R R R R R R R R R C R A L C C A R R R X M L L L M R R R C A L L L X M R R R M L X M L L A R R C L L X M R R A L L L L L L L L L L L X L L L L L 
START L L L L C R R R R X M C A R R R R R X R R R R R R R R R C R X M C A L C C A R X M L X R R R R R R R R R C L L L L L L L L C R R R R R R R R C L L L L L L L L L 
START X L L L L L L L L L C R R R R X M L L L L A R R R R C L L L L X M R R R R A R R R R R X R A R R X M L L M R R C L L X M R R A L L C R R R R R R R R C L L L L L 
START L L L A L X R X M R R R R R A L L L L X M R R R R M L L L L L L L L L L L L L L A R R R R R R R R R R R X M R R R A L L L C L C R X M R R R M L L L L L L L L L 
START L L L L L A R R R R R R R R R R R C L L C R X M R R R R A L L L X M R R R M L L L L L L L L L L L L L L A R R R R R R R R R R R C L C R X M R R R A L L L C L L 
START L L L L L L L L L L C R R R R X M C L L L L C R R R X M L L L A R R R C L L L X M R R R A R R R R R R X R A R X M L M R C L X M R A L C R R R R R R R R C L L L 
START L L L L L A L X R X M R R R R R A L L L X M R R R M L L L L L L L L L L L L L L A R R R R R R R R R R X M R R R R A L L L L C R C L X M R R R R M L L L L L L L 
START L L L L L L L A R R R R R R R R R R C L C R R X M R R R A L L L L X M R R R R M L L L L L L L L L L L L L L A R R R R R R R R R R C R C L X M R R R R A L L L L 
START C L L L L L L L L L L L C R R R R R R A L L L L L L C C R R R R X M L L L L A R R R R C L L L L X M R R R R A R R R R R X R R R R R R R R R C L L L L L L L L L 
START X R X M R R R R R A L L L L X M R R R R M L L L L L L L L L L L L L L A R R R R R R R R R R R X M R R R A L L L C L C R X M R R R M L L L L L L L L L L L L L L 
START A R R R R R R R R R R R C L L C R X M R R R R A L L L X M R R R M L L L L L L L L L L L L L L A R R R R R R R R R R R C L C R X M R R R A L L L C L L L L L L L 
START L L L L L C C R X M C R R X M C R X M C R R R R R X R R X M C R X M C R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R R R R R X M L 
START L L L A R R R R C L L L L X M R R R R A L L L A L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R A A A A A A A A A A A A A A A X 
START X R R R R R R R R R C A R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A 
START X R A R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R X M L L L L A R R R R C L L L L X M R R R R A L L L L L X M R R 
START X M L L A R R C L L X M R R A R A L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R R R R R R R R C L L L L L L L L 
START L X R X M R R R R R R R R R A L L L L L L L L L C L L L L L L L L L L C R X M R R R R R R R R R A L L L L L L L L L C L A R R R R R R R R C L L L L L L L L L X 
START R X M C L M R R R X M L L L A R X L M R M L L L L L L L A R R R R R R R C L X M R A L C R R R C L L X M R R A L L C L A L L L L L L L L L C R R R R R R R R R X 
START R R R X M L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L A R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R R C R 
START R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R X M C R R R R A A A A A A A A A A A A A A A X X R R R R R R R R R C L L L L L L L L L M L L L L L 
START L L L L X L L L L L L L L L C R R R R R R R R R M C A X R R R X M L L L M R R R C A L L L X M R R R M R X M L L L L A R R R R C L L L L X M R R R R A L L L L L 
START L L L L L L L L X L L L L L L L L L C R R R R X M C A R R R R R X R R R R R R R R R C R A L C C A R R R R X M L L L L M R R R R C A L L L L X M R R R R M L X M 
START L L L A R R R C L L L X M R R R A L L L L L L L L L L L L X L L L L L L L L L C R R R X M C A R R R R R R X R R R R R R R R R C R X M C A L C C A R X M L X R R 
START R R R R R R R C L L L L L L L L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R X M L L L A R R R C L L L X M R R R A R R R R R R X R A R R R 
START X M L L L M R R R C L L L X M R R R A L L L C R R R R R R R R C L L L L L L L L A L X R X M R A R X M L M L L L L L L L L L L A R R R R R R R R R R R R X M L L 
START A R R C L C R X M L L M L L L L L L L L L L A R R R R R R R R R R R R C L L L C R R X M L A R R X M L L M L L L L L L L L L L A R R R R R R R R R R R R C L C R 
START X M L L A R R C L L L L L L L L L L L L L C C R R R R X M L L L L A R R R R C L L L L X M R R R R A R R R R R X R A R R X M L L M R R C L L X M R R A L L C R R 
START R R R R R R C L L L L L L L L A L X R X M R A R R X M L L M L L L L L L L L L L A R R R R R R R R R R R X M L A R C R C L X M L M L L L L L L L L L L A R R R R 
START R R R R R R R C L L C R R R X M L L A R X M L M L L L L L L L L L L A R R R R R R R R R R R C R C L X M L A R C L L L L L L L L L L L L C R R R R R A L L L L L 
START C R R R R R R R R R X R R R X M C R X M C R X M C R R R R C L L L L L L L L L X L L L L L L L L L C R R R X M C R X M C R R R R R X R R R R R R R X M L L L L L 
START L A R R R R R R C L L L L L L X M R R R R R R A L L L L A L L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R A R X M L M L L L L A R R R R 
START R C R R X M L L L L L L L X M R R R R R A L A A L L L L C R R R R R X M L L L L L A R R R R R C L M R A R R C L L X M R R A L L C L L L L L X M R R R R R A L L 
START L L L C A R R R R X M L L L L M R R R R C A L L L L X M R R R R M R R R R R X R R R X M L L L M R R R C A L L L X M R R R M L X M L L A R R C L L X M R R A L L 
START L L L L L L L L L X L L L L L L L L L C R R R R X M C A R R R R R X R R R R R R R R R C R A L C C A R R X M L L M R R C A L L X M R R M R X M L L L A R R R C L 
START L L X M R R R A L L L L L L L L L L L L X L L L L L L L L L C R R R X M C A R R R R R R X R R R R R R R R R C R X M C A L C C A R X M L X R R R R R R R R R C L 
START L L L L L L L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R X M L L L A R R R C L L L X M R R R A R R R R R R X R A R X M L M R C L X M R A 
START L C R R R R R R R R C L L L L L L L L A L X R X M R R R R A L L X M R R M L L L L L L L L L L L L L A R R R R R R R R R R X M R R R A L L L C R C L X M R R R M 
START L L L L L L L L L L L L L A R R R R R R R R R R C L C R R X M R R A L L L X M R R R M L L L L L L L L L L L L L A R R R R R R R R R R C R C L X M R R R A L L L 
START C L L L L L L L L L L L C R R R R R X M C R R X M L L L L L L L A R R R R R R R C L L L L L L L X M R R R R R R R A L L A L L L L L C C R R R R X M L L L L A R 
START R R R C L L L L X M R R R R A R R R R R X R A R R X M L L M R R C L L X M R R A L L C R R R R R R R R C L L L L L L L L A L X R X M R R R R A L L L X M R R R M 
START L L L L L L L L L L L L L A R R R R R R R R R R R X M R R A L L C L C R X M R R M L L L L L L L L L L L L L A R R R R R R R R R R R C L L C R X M R R R A L L X 
START M R R M L L L L L L L L L L L L L A R R R R R R R R R R R C L C R X M R R A L L C L L L L L L L L L L L L C C R R R R X M C L L L L C R R R R X M L L L L A R R 
START R R C L L L L X M R R R R A R X M C R R X M L L L L L L L A R R R R R R R C L L L L L L L X M R R R R R R R A L L A L L L L L C R R R R R R R R R X R R R R R R 
START R R R C L L L L L L L L L X R X M R R R R A L L L X M R R R M L L L L L L L L L L L L L A R R R R R R R R R R R X M R R A L L C L C R X M R R M L L L L L L L L 
START L L L L L A R R R R R R R R R R R C L L C R X M R R R A L L X M R R M L L L L L L L L L L L L L A R R R R R R R R R R R C L C R X M R R A L L C L L L L L L L L 
START L L L L C C R R R R R R R R R X R R X M C R X M C R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R X M C R X M C R R R R R X R R R R R X M L L L L A 
START R R R R C L L L L X M R R R R A L L L A L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R R R R R R X M L L L L L A R R R R R 
START C L L L L L X M R R R R R A L L L A L L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R A A A A A A A A A A A A A A A X X R R R R 
START R R R R R C A R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C R X M C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A X R A R R 
START R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R X M L L L L A R R R R C L L L L X M R R R R A L L L L L X M R R X M L L A 
START R R C L L X M R R A R R A L L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R R R R R R R R C L L L L L L L L L X R 
START X M R R R R R R R R R A L L L L L L L L L C L L L L L L L L L L C R X M R R R R R R R R R A L L L L L L L L L C L A R R R R R R R R C L L L L L L L L L X R X M 
START C L M R R R R X M L L L L A R X L M R M L L L L L L A R R R R R R C L X M R A L C R R R R C L L L X M R R R A L L L C L A L L L L L L L L L C R R R R R R R R R 
START X R A R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R M R R R R R X M L L L L L A R R R R R C L L L L L X M R R R R R A L L L L 
START L L X M R R R X M L L L A R R R C L L L X M R R R A R A L L L L C A R R R R R R R R R C L L L L L L L L X L L L L L L L L L C C R R R R R R R R R X R R R R R R 
START R R R C L L L L L L L L L X R R X M R R R R R R R R R A L L L L L L L L L C L L L L L L L L L L L C R R X M R R R R R R R R R A L L L L L L L L L C L L A R R R 
START R R R R R C L L L L L L L L L X R X M C L M R R R R X M L L L L A R X L M R M L L L L L L A R R R R R R C L X M R A L C R R R R C L L L X M R R R A L L L C L A 
START L L L L L L L L L C R R R R R R R R R X R R R R X M L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L A R R R R R R R R R R R R R R R R R 
START R R R R R R R R R R R R R R R R R R R C R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R A A A A A A A A A A A A A A A X X R R R R R R R R 
START R C L L L L L L L L L M L L L L L L L L L X L L L L L L L L L C R R R R R R R R R M C A R R R R R R R R R R R R R R R R R R R R R A L L L X L L L L L L L L L C 
START R R R R R R R R R X R R R X M L L L M R R R C A L L L X M R R R M R X M L L L L A R R R R C L L L L X M R R R R A L L L L L L L L L L L L L X L L L L L L L L L 
START C R R R R X M C A R R R R R X R R R R R R R R R C R A L C C A R R R R X M L L L L M R R R R C A L L L L X M R R R R M L X M L L L A R R R C L L L X M R R R A L 
START L L L L L L L L L L L X L L L L L L L L L C R R R X M C A R R R R R R X R R R R R R R R R C R X M C A L C C A R X M L X R R R R R R R R R C L L L L L L L L C R 
START R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R M R R X M L L L L A R R R R C L L L L X M R R R R A L L X M C L L C R R C L L A R R R R X M L L L L 
START M R R R R C A L L L L X M R R R R M L L L L L L P R R C R R R R X M L L L L L L L P R R R R R R R C L L L X M C R X M C R X M C R X M C R X M C R X M C R R R X 
START R X M C R X M C R X M C R X M C R X M C R X M C R R R C L L L L L L L L L X L L L L L L L L L C R R R R R R R R R X R R R R R X M C R R R R C L L L L L L L L L 
START X L L L L L L L L L C R A A A A A A A A A A A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R A R R R R R R R R R A L L L L L L L L 
START L L L L L L X L L L L L L L L L C R R R R R R R X M L L L L L L L A R R R R R R R C L L L L L L L X M R R R R R R R A X M C R R X R R R R R R R R R C L L L L L 
START L L L L X R R R R R R R X M L L L L L L A R R R R R R C L L L L L L X M R R R R R R A L L L L L L L X L L L L L L L L L C R R R R R R R X M C A R R R C L L L L 
START L L L L L L C C R R R R R R R X M L L L L L L L A R R R R R R R C L L L L L L L X M R R R R R R R A R R X R A R R R R X M L L L L M R R R R C L L L L X M R R R 
START R A L L L L C R R R R R R R R C L L A L L L L L L L X R R R R R X M R R A L L C L L L L L L L L L L L L L L C R R R R R R R R R X R R R R R R R R R C L L L L L 
START L L L L X R X M C L M R R R R R R R X M L L L L L L L A R X L M R M L L L A R R R C L X M R A L C R R R R R R R C L L L L L L X M R R R R R R A L L L L L L C L 
START A L L L L L L L L L C R R R R R R R M L L L L X M C A L L L C A R R R R R R R X M L L L L L L L M R R R R R R R C A L L L L L L L X M R R R R R R R M R R X R R 
START R R R X M R R A L L C R R R R C L L L L L L L L L X R X M C L M R R R R R R R X M L L L L L L L A R X L M R M L L L A R R R C L X M R A L C R R R R R R R C L L 
START L L L L X M R R R R R R A L L L L L L C L A L L L L L L L L L C R A A A A A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R A L L L 
START L L X L L L L L L L L L C R R R R R R R R R X R R R R R X M L L L L L M R R R R R C A L L L L L X M R R R R R M R R X M L L L L L L L A R R R R R R R C L L L L 
START L L L X M R R R R R R R A L L L L L L L L L L L L L L L L X L L L L L L L L L C R R R R X M C A R R R R R X R R R R R R R R R C R A L C C A R R R R R R R X M L 
START L L L L L L M R R R R R R R C A L L L L L L L X M R R R R R R R M L L X M L L L L L A R R R R R C L L L L L X M R R R R R A L L L L L L L L L L L L L L X L L L 
START L L L L L L C R R R X M C A R R R R R R X R R R R R R R R R C R X M C A L C C A R X M L X R R R R R R R R R C L L L L L L L L C R R R R R R R R C L L L L L L L 
START L L X L L L L L L L L L C R R R R X M C L L L A A A A A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R M L L L L L X L L L L L L L 
START L L C C R R R C L L L L P R R R R R R R R R R X R R R R R R X M C R R R C L L L L L L L L L X L L L L L L L L L C R A A A A A A A A A A X M X M R R R R R R R R 
START R A L L L L L L L L L C R R R R R R R R R C R R R R R A R R R R R R R R R A L L L L L L L L L L L L L L L X L L L L L L L L L C R R R R R R R R X M L L L L L L 
START L L A R R R R R R R R C L L L L L L L L X M R R R R R R R R A X M C R X R R R R R R R R R C L L L L L L L L L X R R R R R R R R X M L L L L L L L A R R R R R R 
START R C L L L L L L L X M R R R R R R R A L L L L L L L L X L L L L L L L L L C R R R R R R R R X M C A R R C L L L L L L L L L L C C R R R R R R R R X M L L L L L 
START L L L A R R R R R R R R C L L L L L L L L X M R R R R R R R R A R X R A R R R R R X M L L L L L M R R R R R C L L L L L X M R R R R R A L L L L L C R R R R R R 
START R R C L A L L L L L L L L X R R R R R R X M R R A L L C L L L L L L L L L L L L L L L C R R R R R R R R R X R R R R R R R R R C L L L L L L L L L X R X M C L M 
START R R R R R R R R X M L L L L L L L L A R X L M R M L L A R R C L X M R A L C R R R R R R R R C L L L L L L L X M R R R R R R R A L L L L L L L C L A L L L L L L 
START L L L C R R R R R R R R M L L L L L X M C A L L L C A R R R R R R R R X M L L L L L L L L M R R R R R R R R C A L L L L L L L L X M R R R R R R R R M R X R R R 
START R R R X M R R A L L C R R R C L L L L L L L L L X R X M C L M R R R R R R R R X M L L L L L L L L A R X L M R M L L A R R C L X M R A L C R R R R R R R R C L L 
START L L L L L X M R R R R R R R A L L L L L L L C L A L L L L L L L L L C R A A A A A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R R 
START A R R R R R R R R R R R R R R R R R R R R R R R R R R R A L L L L L L X L L L L L L L L L C R R R R R R R R R X R R R R R R X M L L L L L L M R R R R R R C A L 
START L L L L L X M R R R R R R M R R X M L L L L L L L L A R R R R R R R R C L L L L L L L L X M R R R R R R R R A L L L L L L L L L L L L L L L L L X L L L L L L L 
START L L C R R R R X M C A R R R R R X R R R R R R R R R C R A L C C A R R R R R R R R X M L L L L L L L L M R R R R R R R R C A L L L L L L L L X M R R R R R R R R 
START M L L X M L L L L L L A R R R R R R C L L L L L L X M R R R R R R A L L L L L L L L L L L L L L L X L L L L L L L L L C R R R X M C A R R R R R R X R R R R R R 
START R R R C R X M C A L C C A R X M L X R R R R R R R R R C L L L L L L L L C R R R R R R R R C L L L L L L L L L X L L L L L L L L L C R R R R X M C L L L A A A A 
START A X M X M R R R R R R R R R A L L L L L L L L L C R R R R R R R R R C R R R R R M R R R R R R R R R R R R R R R R R R R R R R R R R R R M L L L L L L X L L L L 
START L L L L L C C R R R C;
START END
    
    
 /*S R|R|R|R|R|R|R|A|A|A|A|A|A|A|A|A|A|R|A|R|A|Lx(
LS,A,A,A,A,A,LS,R,A,A,A,A,A,A,A,A,L,M,LE,R,P,L,A,A,A,A,A,A,LS,R,M,M,M,M,M,M,M,M,L,M,LE,A,L,L,L,LE,R,P,R,R,LS,
LS,M,LE,L,LS,R,A,L,M,LE,R,R,LS,L,L,A,R,A,R,M,LE,L,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,
LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,LS,M,LE,R,A,R,A,L,L,L,M,LS,R,A,L,M,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,A,R,R,R,LE,L,L,L,LE
)*/
  }
}