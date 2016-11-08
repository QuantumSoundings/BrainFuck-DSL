import scala.reflect.macros.blackbox
import scala.language.experimental.macros
import optim._
object Macros {
  def doBrainFuck(s:String):Unit =macro doBFImpl
  def doBFImpl(c: blackbox.Context)(s: c.Expr[String]): c.Expr[Unit] = {
    import c.universe._
    var z = optim.OptimizeBF.replacements(s.toString().substring(15, s.toString.length-2).replaceAll(" ", "").replaceAllLiterally(" ", ""))
    var t = new Base64
    var temp = ""
    for(x<- 0 to 61){
      temp = temp+"var fun"+t.intToString(x) + " = (x:Any) => { }\n"
    }
    z=temp+z
    var tree = c.parse(z)
    c.Expr(q"""${tree}""") 
  }
  
  def main(args: Array[String]):Unit ={}
}