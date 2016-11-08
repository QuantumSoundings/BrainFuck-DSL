import bfdsl._
import scala.language.postfixOps


object tester extends BF{
  def main(args: Array[String]):Unit ={
    println("Running tester");
    
   /* S A A A A A A A A E(S.Lx(R,
        A,A,A,A,LS,R,A,A,R,A,A,A,
        R,A,A,A,R,A,L,L,L,L,M,LE,R,A,R,
        A,R,M,R,R,A,LS,L,LE,L,M,LE)) R R P
        R M M M P A A A A A A A P P A A
        A P R R P L M P L P A A A P M M M M
        M M P M M M M M M M M P R R A P
        R A A P */
    S R A A A A A A A A NULL E(S.Lx(M,L,A,A,A,A,A,A,A,A,A,R,LE)) L P R R A R M NULL E(S.Lx(A,LE)) A A R A A R A A A NULL E (S.Lx(R,LS, M, R ,A ,A ,A, L, L, A, A, A, R, 
        LE, L, L, LE)) R M M M M M P R M R A A A P P A A A P R M P L L A NULL E(S.Lx(R,LS,A,R,A,LE,R,R,LE)) L M M 
        M M M M M M M M M M M M P R R P A A A P M M M M M M P M M M M M M M M P R A P R A P
    
    
    
    S R R R R R R R A A A A A A A A A A R A R A NULL E(S.Lx(
LS,A,A,A,A,A,LS,R,A,A,A,A,A,A,A,A,L,M,LE,R,P,L,A,A,A,A,A,A,LS,R,M,M,M,M,M,M,M,M,L,M,LE,A,L,L,L,LE,R,P,R,R,LS,
LS,M,LE,L,LS,R,A,L,M,LE,R,R,LS,L,L,A,R,A,R,M,LE,L,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,
LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,LS,M,LE,R,A,R,A,L,L,L,M,LS,R,A,L,M,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,A,R,R,R,LE,L,L,L,LE
))    
  }
}