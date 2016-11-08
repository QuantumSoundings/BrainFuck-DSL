package macros;


class Base64 {
  def intToString(num:Int):String={
     num match {
      case 0 => "0"
      case 1 => "1"
      case 2 => "2"
      case 3 => "3"
      case 4 => "4"
      case 5 => "5"
      case 6 => "6"
      case 7 => "7"
      case 8 => "8"
      case 9 => "9"
      case 10 => "a"
      case 11 => "b"
      case 12 => "c"
      case 13 => "d"
      case 14 => "e"
      case 15 => "f"
      case 16 => "g"
      case 17 => "h"
      case 18 => "i"
      case 19 => "j"
      case 20 => "k"
      case 21 => "l"
      case 22 => "m"
      case 23 => "n"
      case 24 => "o"
      case 25 => "p"
      case 26 => "q"
      case 27 => "r"
      case 28 => "s"
      case 29 => "t"
      case 30 => "u"
      case 31 => "v"
      case 32 => "w"
      case 33 => "x"
      case 34 => "y"
      case 35 => "z"
      case 36 => "A"
      case 37 => "B"
      case 38 => "C"
      case 39 => "D"
      case 40 => "E"
      case 41 => "F"
      case 42 => "G"
      case 43 => "H"
      case 44 => "I"
      case 45 => "J"
      case 46 => "K"
      case 47 => "L"
      case 48 => "M"
      case 49 => "N"
      case 50 => "O"
      case 51 => "P"
      case 52 => "Q"
      case 53 => "R"
      case 54 => "S"
      case 55 => "T"
      case 56 => "U"
      case 57 => "V"
      case 58 => "W"
      case 59 => "X"
      case 60 => "Y"
      case 61 => "Z"
      case _ =>"";
    }
  }
  def stringToInt(s:String):Int ={
    s match {
      case "0"=>0
      case "1"=>1
      case "2"=>2
      case "3"=>3
      case "4"=>4
      case "5"=>5
      case "6"=>6
      case "7"=>7
      case "8"=>8
      case "9"=>9
      case "a"=>10
      case "b"=>11
      case "c"=>12
      case "d"=>13
      case "e"=>14
      case "f"=>15
      case "g"=>16
      case "h"=>17
      case "i"=>18
      case "j"=>19
      case "k"=>20
      case "l"=>21
      case "m"=>22
      case "n"=>23
      case "o"=>24
      case "p"=>25
      case "q"=>26
      case "r"=>27
      case "s"=>28
      case "t"=>29
      case "u"=>30
      case "v"=>31
      case "w"=>32
      case "x"=>33
      case "y"=>34
      case "z"=>35
      case "A"=>36
      case "B"=>37
      case "C"=>38
      case "D"=>39
      case "E"=>40
      case "F"=>41
      case "G"=>42
      case "H"=>43
      case "I"=>44
      case "J"=>45
      case "K"=>46
      case "L"=>47
      case "M"=>48
      case "N"=>49
      case "O"=>50
      case "P"=>51
      case "Q"=>52
      case "R"=>53
      case "S"=>54
      case "T"=>55
      case "U"=>56
      case "V"=>57
      case "W"=>58
      case "X"=>59
      case "Y"=>60
      case "Z"=>61
      case _ => 0
    }
  }
}