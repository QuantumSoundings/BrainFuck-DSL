package macros1
import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object Macros {
  def doBrainFuck(s:String):Unit =macro doBFImpl
  def doBFImpl(c: blackbox.Context)(s: c.Expr[String]): c.Expr[Unit] = {
    import c.universe._
    var z = OptimizeBF.replacements(s.toString().substring(15, s.toString.length-2).replaceAll(" ", "").replaceAllLiterally(" ", ""))
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