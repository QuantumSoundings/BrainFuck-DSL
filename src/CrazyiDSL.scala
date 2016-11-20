import bfdsl._
import Macros._
import scala.language.postfixOps
import bfdsl.BF



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
    //START A A A A A M FUN 'x' A  A A ;f('c');
    def time[A](a: => A) = {
        val now:Double = System.nanoTime.toDouble
        val result = a
        val micros = (System.nanoTime.toDouble - now) / 1000000000.0
        println("%f seconds".format(micros))
        result
      }
    //START Fu c Ad Ad Ad Ad Ad Ad Y No FUN 'c' FUN 'c' END;
    //START A X A A A A A A A A A C END;
    println(mem.mkString("<", ",", ">"))
    
    time {START Ad Ad Ad Ad Ad Ad Ad Ad L1 Ri Ad Ad Ad Ad L1 Ri Ad Ad Ri Ad Ad Ad Ri Ad Ad Ad Ri Ad Le Le Le Le Mi L2 Ri Ad Ri Ad Ri
  Mi Ri Ri Ad L1 Le L2 Le Mi L2 Ri Ri Pr Ri Mi Mi Mi Pr Ad Ad Ad Ad Ad Ad Ad Pr Pr Ad Ad Ad Pr Ri Ri Pr Le Mi Pr Le Pr Ad Ad Ad Pr Mi
  Mi Mi Mi Mi Mi Pr Mi Mi Mi Mi Mi Mi Mi Mi Pr Ri Ri Ad Pr Ri Ad Ad Pr END};
START RESET;
START Fu Z1 L1 Le f1 f0 Ri Mi L2 Cl Fu Y1 L1 f5 f1 f0 Ri Mi L2 Cl Fu X1 L1 Le f2 f0 Ri Mi L2 Cl Fu W1 L1 f5 f2 Ri Mi L2 Cl ;
START Fu V1 L1 Le f2 Ri Mi L2 Cl Fu U1 L1 f5 f2 f0 Ri Mi L2 Cl Fu T1 L1 Le f1 Ri Mi L2 Cl Fu S1 L1 f5 f1 Ri Mi L2 Cl; 
START Fu f0 Ad Ad Cl Fu f1 f0 f0 Cl Fu f2 f1 f1 Cl Fu f3 Ri f2 Cl Fu f4 Ri f3 Cl Fu f5 Le Ad Cl Fu f6 f5 f4 Cl Fu f7 f0 Ad Cl Fu f8 X1 f6 Cl Fu f9 f3 f1 Cl ;
START Fu A Le Mi Cl     Fu B Ad W1 Cl     Fu C A f4 Cl     Fu D f0 f8 Cl     Fu E f1 B Cl     Fu F f3 f7 Cl     Fu G T1 f9 Cl     Fu H f0 f4 Cl     Fu I C f1 Cl     Fu J Le H Cl 
START Fu K Y1 f9 Cl     Fu L F f8 Cl     Fu M Ri f4 Cl     Fu N f3 D Cl     Fu O f0 X1 Cl     Fu P f7 X1 Cl     Fu Q f0 V1 Cl     Fu R f0 Y1 Cl     Fu S Q J Cl     Fu T Ad V1 Cl 
START Fu U E C Cl     Fu V f7 K Cl     Fu W f9 B Cl     Fu X G R Cl     Fu Y D P Cl     Fu Z Mi f4 Cl     Fu A1 T1 L Cl     Fu B1 f3 O Cl     Fu C1 f1 S Cl     Fu D1 A Z Cl 
START Fu E1 Ad S1 Cl     Fu Fx f4 f1 Cl     Fu G1 V1 f6 Cl     Fu H1 f5 M Cl     Fu I1 I T Cl     Fu J1 f7 f8 Cl     Fu K1 C D Cl     Fu Lx T1 f2 Cl     Fu M1 G B Cl     Fu N1 W1 N Cl 
START Fu O1 E D1 Cl     Fu P1 I N1 Cl     Fu Q1 f7 U1 Cl     Fu R1 f1 W1 Cl 
START Ri M f1 Ad Z1 f9 f7 Y1 F X1 N U Q1 f4 R I V T I1 W C Q1 Fx Y1 K1 E f6 Y W C Q1 Fx Y1 I V X1 W C Q1 f4 f0 K f7 Y1 B1 J U Q1 f4 R L E f9 S U Q1 Fx K T f9 V S U Q1 Fx K X1 C 
START Y W C Q1 M E1 F X1 f9 f7 Y1 F X1 B1 H1 E1 N f1 V T I1 W A M E1 W D1 D E f6 Y f4 E1 W D1 f1 V X1 f4 E1 B1 J f1 V B f6 O H1 E1 B1 J J1 E f9 Q Le f0 M E1 W I1 f9 S D O H1 E1 W 
START I X1 C P H1 E1 L P B1 f5 Ri M X L U E P1 O1 A1 O J X N D C1 A1 P f3 M1 I1 N G X1 I G1 R1 f9 W1 F Lx f0 M X L U E P1 O1 A1 O J X N D C1 f7 Lx H f1 K G1 R1 K1 A1 P N T1 B1 
START L f1 X1 C P F T1 f3 G Q f9 G1 O1 O1 G V B C G G1 C1 J1 E F X1 B1 F Lx f0 M X L U E P1 O1 A1 O J X N D C1 A1 P f3 M1 I1 N G X1 I G1 R1 f9 W1 f3 E1 f5 f3 f0 f3 f0 Ri M f1 Ad Z1 
START f9 f7 Y1 F X1 N U D Y f4 R I V T I1 W K1 Y Fx Y1 K1 E f6 Y W K1 Y Fx Y1 I V X1 W K1 Y f4 f0 K f7 Y1 B1 J U D Y f4 R L E f9 S U D Y Fx K T f9 V S U D Y Fx K X1 K1 R1 
START W f6 O H1 R P1 E f6 Y M f1 Y1 N P Fx Ad Z1 f9 f7 Y1 F X1 B1 H1 R I V T I1 W A M f1 Y1 K1 E f6 Y Fx Y1 I V X1 f4 f0 K V B f6 O H1 R L E f9 Q Le f0 M f1 K T f9 S D O H1 f1 
START K X1 C P H1 Q C P B1 H1 f1 Ad Z1 L G W1 f6 J1 C1 O f5 Ri M X L U E P1 A1 O J X N D C1 A1 P f3 M1 I1 N G X1 I G1 R1 f9 W1 F Lx f0 M X L U E P1 A1 O J X N D C1 f7 Lx H f1 
START K G1 R1 K1 G V B C T1 B1 L f1 X1 C P F T1 f3 G Q f9 G1 O1 O1 G V B C G G1 C1 J1 E F X1 B1 F Lx f0 M X L U E P1 A1 O J X N D C1 A1 P f3 M1 I1 N G X1 I G1 R1 f9 W1 f3 E1 f5 
START f3 f0 f3 f0 M X L U E P1 O1 A1 O J X N D C1 f7 Lx H R f6 J1 M1 C J1 M1 I1 N M1 D1 U J1 C1 D f7 T1 f3 G f0 K B F U1 f3 M1 D1 J1 R1 f6 D G W1 f6 J1 C1 D f7 Lx f0 Ri ;
START Fu U1 Le Le L1 L1 L1 Le L2 Le L2 Le L2 Ri Ri Cl     Fu V1 Le Le L1 L1 Le L2 Le L2 Ri Cl     Fu W1 Ri L1 L1 Ri L2 Ri L2 Cl     Fu X1 Ri L1 Ri L2 Cl     Fu Y1 Ri L1 Pr Ri L2 Cl     Fu Z1 Le Le L1 Le L2 Cl ;
START Fu f0 Y1 W1 Cl Fu f1 X1 X1 Cl     Fu f2 Z1 Z1 Cl     Fu f3 Y1 V1 Cl     Fu f4 f3 V1 Cl     Fu f5 f0 f1 Cl     Fu f6 f0 W1 Cl     Fu f7 Y1 U1 Cl     Fu f8 f4 f2 Cl     Fu f9 f0 X1 Cl ;
START Fu A Y1 Ri Cl Fu B f6 f2 Cl     Fu C f7 f1 Cl     Fu D Z1 A Cl     Fu E X1 f5 Cl     Fu F f8 f2 Cl     Fu G f4 D Cl     Fu H f8 Z1 Cl     Fu I f4 V1 Cl     Fu J X1 f6 Cl 
START Fu K B Z1 Cl Fu L B f2 Cl     Fu M f1 A Cl     Fu N W1 f2 Cl     Fu O f5 f1 Cl     Fu P X1 f0 Cl     Fu Q f9 f7 Cl     Fu R f9 C Cl     Fu S f6 D Cl     Fu T f1 f1 Cl 
START Fu U f0 f7 Cl Fu V f0 C Cl     Fu W f5 C Cl     Fu X f5 f7 Cl     Fu Y X1 f9 Cl     Fu Z M W1 Cl     Fu A1 I f6 Cl     Fu B1 I Z Cl     Fu C1 I J Cl     Fu D1 G N Cl 
START Fu E1 E f1 Cl Fu Fx f4 M Cl     Fu G1 f0 f8 Cl     Fu H1 f5 f8 Cl     Fu I1 f9 f8 Cl     Fu J1 X1 B Cl     Fu K1 f0 F Cl     Fu Lx f5 F Cl     Fu M1 f9 F Cl     Fu N1 f0 H Cl 
START Fu O1 f5 H Cl Fu P1 f9 H Cl     Fu Q1 X1 K Cl     Fu R1 G f1 Cl     Fu S1 J D Cl     Fu T1 X1 L Cl 
START U1 f0 U f0 Q f9 X f9 U f9 Q f5 X f5 U f5 Q f5 E f7 f5 P f7 f5 X1 Q O X O U O Q L X L U L Q K X K U K Q B X B U B Q S f1 f7 S f7 S X1 f7 f6 f1 f7 f6 f7 f6 X1 f7 P X 
START P U P Q Y X Y U Y Q E X E U E Q E E f7 E P f7 E X1 Q E1 X E1 U E1 Q T1 X T1 U T1 Q Q1 X Q1 U Q1 Q J1 X J1 U J1 Q S1 f1 f7 S1 f7 S1 X1 f7 J f1 f7 J f7 J X1 C f0 W f0 
START V f0 R f9 W f9 V f9 R f5 W f5 V f5 R f5 E C f5 P C f5 X1 R O W O V O R L W L V L R K W K V K R B W B V B R S f1 C S C S X1 C f6 f1 C f6 C f6 X1 C P W P V 
START P R Y W Y V Y R E W E V E R E E C E P C E X1 R E1 W E1 V E1 R T1 W T1 V T1 R Q1 W Q1 V Q1 R J1 W J1 V J1 R S1 f1 C S1 C S1 X1 C J f1 C J C J X1 F f0 Lx f0 K1 f0 
START M1 f9 Lx f9 K1 f9 M1 f5 Lx f5 K1 f5 M1 f5 E F f5 P F f5 Y F O Lx O K1 O M1 L Lx L K1 L M1 K Lx K K1 K M1 B Lx B K1 B M1 S f1 F S F S X1 F f6 f1 F f6 F f6 X1 H f0 O1 f0 N1 f0 ;
START P1 f9 O1 f9 N1 f9 P1 f5 O1 f5 N1 f5 P1 f5 E H f5 P H f5 Y H O O1 O N1 O P1 L O1 L N1 L P1 K O1 K N1 K P1 B O1 B N1 B P1 S f1 H S H S X1 H f6 f1 H f6 H f6 X1 f8 f0 H1 f0 G1 f0 I1 
START f9 H1 f9 G1 f9 I1 f5 H1 f5 G1 f5 I1 f5 E f8 f5 P f8 f5 Y f8 O H1 O G1 O I1 L H1 L G1 L I1 K H1 K G1 K I1 B H1 B G1 B I1 S f1 f8 S f8 S X1 f8 f6 f1 f8 f6 f8 f6 X1 G f5 G f0 G f9 G E 
START G P G Y R1 f5 R1 f0 R1 f9 R1 E R1 P R1 Y G T f5 G T f0 G T f9 D1 f2 f5 D1 f2 f0 D1 f2 f9 D1 Z1 f5 D1 Z1 f0 D1 Z1 f9 D1 f5 D1 f0 D1 f9 G W1 D f1 G W1 D G W1 D X1 G W1 f1 G W1 G W1 P 
START Fx f4 f0 f4 Y Fx X1 f4 f9 f4 E Fx f1 f4 f5 f4 E X1 Fx f1 X1 f4 f5 X1 f4 E1 Fx T f4 O f4 E1 X1 Fx T X1 f4 O X1 f4 Q1 Fx N Z1 f4 K f4 J1 Fx N f4 B f4 J Z1 f4 Z Z1 f4 f6 Z1 f4 J B1 A1 C1 X1 B1 
START X1 A1 X1 C1 f1 B1 f1 A1 f1 C1 f1 X1 B1 f1 X1 A1 f1 X1 C1 T B1 T A1 T C1 T X1 B1 T X1 A1 T X1 C1 T f1 B1 T f1 A1 T f1 C1 N f2 B1 N f2 A1 N f2 C1 N Z1 B1 N Z1 A1 N Z1 C1 N f5 f3 f2 f0 f3 f2 
START f9 f3 Z1 B1 W1 Z1 A1 W1 D f1 X1 f7 f0 f5 Y1 END*/
START END;
  
/* 
START RESET; 
time {
START Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 Mi Ri Ad Ad Ri Ri Ri Ad Ad Ad Ad Ad Ri Ad Ad Ri Ad Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ri Mi Mi Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 
START Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ad L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad L1 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi L2 Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi L2 Ad 
START Le Le Le Le Le Le Le Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad L1 Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri L1 Mi L2 Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri 
START Ri Ri Ri Ri Ri L1 Mi L2 Ad Le Le Le Le Le Le Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Ad Ad Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri 
START Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 L1 Mi L2 Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri 
START Ri Ri L1 Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ad Le Le Ad Le Le Le Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START L1 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Ad Le Le Le Ad Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le 
START Le Le L2 Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Ad Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 
START Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ad Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad L1 
START Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le Le L1 Mi Ri Ri L1 
START Mi Le Le Ad Ri Ri L2 Le Le L1 Mi Ri Ri Ad Ri Ri Ad Le Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le 
START Le Le L1 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le 
START L1 Ri L1 Mi L2 Le Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri 
START Ri Ri Ri Ri L1 Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad 
START Le Le Le Le Le Le L1 Mi Ri Ri Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Ri Ad Le Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri 
START Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le 
START Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi L2 Le Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le 
START Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 Ri Ri Ri Ri 
START Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le Mi Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le L1 Le Le Le Le Le Le 
START Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri L1 Mi Le Le Le Mi Ri Ri Ri L2 Ad Le Le Le L1 Mi Ri Ri Ri Mi Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le 
START Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri Ri Ri L1 Mi Le Le Le Le Mi Ri Ri Ri Ri L2 Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri 
START Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le 
START Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le L1 Mi Ri Ad Ri Ri Ri Mi Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad 
START Ad Ad Ad Ad Ad Ad Ad Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le L1 Mi L2 Le Le L2 Ri Ri L1 Le Le Le Le Le Le Le Ad Le L1 Mi Le Ad Ri Ri Ri Ri Ad Le Le L1 Mi L2 L2 Ri L1 Mi Le Le L1 Mi Ri Ad Ri Ri Ri Mi 
START Le Le Le Le L2 Ri Ri Ri L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri 
START L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri L1 Mi Le Le Le Le Le Le Le Le 
START Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ad Ri L1 Mi 
START L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad L1 Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le 
START Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le L1 Mi Ri Ri L1 Mi Le Le Ad Ri Ri L2 Le 
START Le L1 Mi Ri Ri Ad Ri Ad Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi Ri Ri Ri Ri 
START Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi L2 Le Mi Ri Ri Ri 
START L1 Mi Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri L1 Mi Le 
START Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri 
START L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le L1 Mi Ri Ri L1 Mi Le Le Ad 
START Ri Ri L2 Le Le L1 Mi Ri Ri Ad Ri Ri Ad Le Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri 
START L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi 
START L2 Le Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START L1 Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START L2 Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri 
START Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad 
START Ad Ad Ad Ad Ad Ad Ad L1 L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le Mi Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad L1 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad 
START Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri L1 
START Mi L2 Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ad Ri L1 Mi Le Mi Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Ri L1 Mi Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Ad Ad Le Le Le Le L2 Ri Ri Ri Ri Ri L1 Mi Le 
START Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Mi Ri Ad Ri L2 Le L1 Mi Ri Ad Le L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri L1 Mi L2 Le Le Le Le Le Le Ad Ri Ri Ri Ri L1 Mi Le Le Le Le Mi Ri Ri Ri Ri L2 Ad Le Le Le Le 
START L1 Mi Ri Ri Ri Ri Mi Ri Ri Ri Ri Ri L1 Ri Ri L1 Mi Le Le Mi Ri Ri L2 Ad Le Le L1 Mi Ri Ri Mi Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 
START Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri Ri L1 Mi Le Le Le Mi Ri Ri Ri L2 Ad Le Le Le L1 Mi Ri Ri Ri Mi Le L1 Mi Le Le Ad Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le 
START Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le 
START L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri L1 Ri Ad Ri Ri L1 Mi Le Le Mi Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le 
START Le Le Le Ad Le L1 Ri L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ri Ad Le Le Le L2 Le L2 Ri L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le 
START Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ad Le Le Le L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri L1 Mi Ri Ri Ri Ad Le Le Le L2 Le Le 
START Le Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Le Le Le Le L2 Ri Ri Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Ri Ri Ri Ri Ri Ri L1 Ri Ad Ri L1 Mi Le Mi Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le 
START Le Le Le Le Le Ad Le L1 Ri L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ri Ri Ad Le Le Le Le L2 Ri L2 Le L1 Mi Ri Ri Ri Ri Mi Le Le Le Le Le Le Le 
START Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri Ri L1 Mi Ri Ri Ri Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L2 Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le 
START L2 Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le 
START L1 Ri L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ri Ad Le Le Le L2 Le L2 Ri L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le 
START Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ad Le Le Le L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri L1 Mi Ri Ri Ri Ad Le Le Le L2 Le Le Le Le Le Le Le 
START Le Le Le Le Le L2 L2 Ri L1 Mi L2 Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri Ri L1 Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri L1 Mi Le 
START Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 
START L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ad Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad 
START L1 Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le Le L1 Mi Ri Ri 
START L1 Mi Le Le Ad Ri Ri L2 Le Le L1 Mi Ri Ri Ad Ri Ad Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le 
START Le L1 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 
START Ri L1 Mi L2 Le Mi Ri Ri Ri L1 Mi Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 
START Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri 
START Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri L1 Mi L2 Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le Mi Le Le Le Le Le 
START Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad L1 Ri Ri Ri L1 Mi Le Le Le Mi Ri Ri Ri L2 Ad Le Le Le L1 Mi Ri Ri Ri Mi Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le Le 
START Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri Ri Ri L1 Mi Le Le Le Le Mi Ri Ri Ri Ri L2 Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le L1 Mi 
START Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri 
START Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Ri Ri Ri Ri Ri Ri L1 Ri Ad Ri Ri Ri 
START L1 Mi Le Le Le Mi Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Ad Le L1 Ri L1 Mi Ri Ad Ri L1 Mi Le Mi Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le 
START Ad Ri Ri L2 Le L2 Ri L1 Mi Le Le Mi Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le L2 Ri Ri L1 Mi Le Ad Ri Ri L1 Mi Le Le Mi Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri 
START L1 Mi Le Le Ad Ri Ri L2 Le Le Le Le Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri L1 Ri Ad Ri Ri L1 Mi Le Le Mi Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le L2 Ri Ri 
START Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Ad Le L1 Ri L1 Mi Ri Ad Ri Ri L1 Mi Le Le Mi Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Ad Ri L2 Ri L2 Le L1 Mi Le Mi Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri 
START Ri Ri Ri Ri Ri Ri Ri L2 Le Le L2 Ri Ri Ri L1 Mi Le Le Ad Ri L1 Mi Le Mi Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L2 Le L1 Mi Le Ad Ri L2 Le Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ad Le Le Le Le Le 
START L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le 
START Le Ad Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Ad Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ad Ri L1 Mi Le Mi Le Le Le Le Ad Ri Ri Ri Ri 
START Ri L2 Ri Ri L1 Mi Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Ad Ad Le Le Le Le L2 Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Mi Ri Ad Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le 
START Le Le Le L2 Ad Ri Ri Ri Ri L1 Mi Le Le Le Le Mi Ri Ri Ri Ri L2 Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Ri Ri Ri Ri Ri L1 Ri Ri Ri L1 Mi Le Le Le Mi Ri Ri Ri L2 Ad Le Le Le L1 Mi Ri Ri Ri Mi Le L1 Mi Le Le Ad Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le 
START Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri L1 Mi Le Le Mi Ri Ri L2 Ad Le Le L1 Mi Ri Ri Mi Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le 
START Le Le L1 Mi Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le 
START Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Ri Ri Ri Ri Ri Ri L1 Ri Ad Ri L1 Mi Le Mi Ri L2 Le L1 Mi Ri Ad 
START Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Ad Le L1 Ri L1 Mi Ri Ri Ri Ri Ad Le Le L1 Mi Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ri Ad Le Le Le L2 Ri L2 Le L1 Mi Ri Ri Ri Mi 
START Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri Ri L1 Mi Ri Ri Ad Le Le Le L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L2 Le L1 Mi Ri Ri Ri Ad Le Le Le 
START L2 Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri L1 Mi L2 Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Ad Le Le Le Le Le L2 L2 Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri 
START Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri L1 Ri Ad Ri Ri L1 Mi Le Le Mi Ri Ri L2 Le Le L1 Mi Ri Ri Ad Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Ad Le L1 Ri L1 Mi Ri Ri Ri Ri Ad Le Le Le L1 Mi Ri Ri Ri Mi 
START Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ad Le Le L2 Le L2 Ri L1 Mi Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le L2 Ri L1 Mi Ri Ri Ri Ad Le Le L1 
START Mi Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri L1 Mi Ri Ri Ad Le Le L2 Le Le Le Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri L1 Mi L2 Le Le Le Le L2 Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri 
START Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Ri L1 Mi L2 Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Ad Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri 
START Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi Ri Ri Ri Ri Ad Le Le Le L1 Mi Ri Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ad Le Le L2 Le L2 Ri L1 Mi Ri Ri Mi Le Le Le Le Le Le Le Le 
START Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le L2 Ri L1 Mi Ri Ri Ri Ad Le Le L1 Mi Ri Ri Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le L2 Ri L1 Mi Ri Ri Ad Le Le L2 Le Le Le Le Le Le Le Le 
START Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Ad 
START Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri 
START L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Ad Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 Ri Ri Ri Ri 
START Ri Ri Ri Ri Ri L2 Ad Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad L1 Ri Ad Ri Ri 
START Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le Le L1 Mi Ri Ri L1 Mi Le Le Ad 
START Ri Ri L2 Le Le L1 Mi Ri Ri Ad Ri Ri Ad Le Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri 
START L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le L2 Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi 
START L2 Le Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START L1 Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Mi Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le 
START Le Le L1 Mi Ri Ri Ri L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Ri Ad Le Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri 
START Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Le Le Ad Ri Ri Ri 
START Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi L2 Le Mi Ri Ri Ri Ri L1 Mi Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le Le Le L2 Le Ad 
START Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri 
START Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 L1 Ri Ri Ri Ri Ri Ri Ri Ri 
START Ri L2 Le Le Le Le Le Le Le Le Le Mi Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 
START Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri L1 Mi Le Le Le Mi Ri Ri Ri L2 Ad Le Le Le L1 Mi Ri Ri Ri Mi Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le 
START L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri Ri Ri L1 Mi Le Le Le Le Mi Ri Ri Ri Ri L2 Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le L1 Mi Le Le Le Ad Ri Ri Ri L2 Le Le Le L1 Mi Ri Ri Ri Ad Le 
START Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L2 Ri 
START Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Mi Ri Ri L1 Mi Le Le Le Le Ad Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri Ri Ad Le Le L1 Mi L2 Le Le L2 Ri Ri L2 Le Le Ad Ri Ri Ri Ri L1 Mi Le Le Le Le 
START Mi Ri Ri Ri Ri L2 Ad Le Le Le Le L1 Mi Ri Ri Ri Ri Mi Le Le Le Le Le Le Pr Ri Ri L2 Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Pr Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri L1 
START Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri L1 Mi L2 Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri L1 Mi L2 Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le 
START L1 Le Le Le Le Le Le Le Le Le L2 Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le 
START Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad L1 Mi L2 Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le 
START Le Le Le Le L1 Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri L2 Le Le Le Le 
START Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Ri Ri L1 Ri Ad Ri Ri Ri Ri L1 Mi Le Le Le Le Mi Ri Ri Ri Ri L2 Le Le Le Le L1 Mi Ri Ri Ri 
START Ri Ad Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Ad Le Le Le Le Le Le Le L1 Ri Ri Ri Ri Ri L1 Mi Ri Ri Ad Le Le L2 Le Le Le Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le 
START Le Le Le Le L1 Ri L1 Mi L2 Le Mi Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Ad Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le L2 Le 
START Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Mi Le Le Le Le L1 Mi L2 Ad Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Mi Ri Ri Ri Ri Ri Ri Ri L2 Ad Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Mi Ri Ri L1 Ri Ri 
START Ri Ri Ri L1 Mi Ri Ri Ad Le Le L2 Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi L2 Le Mi Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Le Ad Ri Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri Ri Ri Ri L2 Le Le 
START Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ad Le Le Le 
START Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Mi Ri Ri Ri Ri Ri L2 Ad Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Mi Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le 
START Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri Ri Ri Ri Ri Ri L1 Mi Le 
START Le Le Le Le Le Le Mi Ri Ri Ri Ri Ri Ri Ri L2 Ad Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Mi Le Le L1 Mi Le Le Le Le Le Ad Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le 
START Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le 
START Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Le Le Le Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Mi Le Le Le Le Le L1 Le Le Le Le Le Le Le 
START Le Le L2 L2 Ri Ri Ri L2 Le Le Le Le Pr Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri L1 Mi L2 Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ad Ad Ad Ad Ad Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri 
START Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le 
START Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ad L1 Mi L2 Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri 
START Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri L2 Le Le Le Le Le Le Le Le Le Le L2 L2 Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le 
START Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ad Ri L1 Ri Ad Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Mi Ri Ri Ri Ri Ri L2 Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ad Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri 
START Ri Ri L2 Le Ad Le Le Le Le Le Le Le Le L1 Ri Ri Ri Ri Ri Ri L1 Mi Ri Ri Ad Le Le L2 Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi L2 Le Mi 
START Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Ad Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le L2 Le Ad Le Le Le Le Le Le 
START Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Mi Le Le Le Le Le L1 Mi L2 Ad Le Le Le L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Mi Ri Ri Ri Ri Ri Ri Ri Ri L2 Ad Le Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Mi Ri L1 Ri Ri Ri 
START Ri Ri Ri L1 Mi Ri Ri Ad Le Le L2 Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Ri L1 Mi L2 Le Mi Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Ad Ri L1 Le Mi Ri Mi Le Le Ad Ri Ri L2 Le L1 Mi Ri Ad Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le 
START Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le L2 Le Ad Le Le Le Le Le Le Le Le Le L2 Ri Ad Ad Ad Ad Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri 
START Ad Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Mi Ri Ri Ri Ri Ri Ri L2 Ad Le 
START Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Mi Ri Ri L1 Mi Le Le Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le 
START Le Le L2 Ri Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ad Le L2 L2 Ad Ri Ri Ri Ri Ri Ri Ri Ri L1 Mi Le Le Le Le Le Le Le Le Mi Ri Ri Ri Ri Ri Ri Ri Ri L2 Ad Le Le Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri 
START Mi Le Le L1 Mi Le Le Le Le Le Le Ad Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le L1 Mi Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri L1 Mi L2 Ad Ri Ri Ri Ri Ri Ri L1 Ri Ri Ri Ri Ri Ri 
START Ri Ri Ri L2 Ri L1 Mi L2 Ad Le L2 L2 Ad Ri L1 Mi Le L1 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri L2 Le Le Le Le Le Le Le Le Le L1 Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri L1 Mi L2 Le Le Le Ad Ad Ad Ad 
START Ad L1 Mi L1 Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ad Le Le Le Le Le Le Le Le Le L2 Ri Ri Ri Ri Ri Ri Ri Ri Ri L2 Ri Ri Ri Ri Ri Mi Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Ri Mi Le Le Le Le Le Le L1 Le Le Le Le 
START Le Le Le Le Le L2 L2 Ri Ri Ri L2 END;
}   */
    
 /*S R|R|R|R|R|R|R|A|A|A|A|A|A|A|A|A|A|R|A|R|A|Lx(
LS,A,A,A,A,A,LS,R,A,A,A,A,A,A,A,A,L,M,LE,R,P,L,A,A,A,A,A,A,LS,R,M,M,M,M,M,M,M,M,L,M,LE,A,L,L,L,LE,R,P,R,R,LS,
LS,M,LE,L,LS,R,A,L,M,LE,R,R,LS,L,L,A,R,A,R,M,LE,L,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,
LS,R,A,L,M,LS,R,A,L,M,LS,R,A,L,M,LS,R,LS,M,LE,R,A,R,A,L,L,L,M,LS,R,A,L,M,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,LE,A,R,R,R,LE,L,L,L,LE
)*/
  }
}