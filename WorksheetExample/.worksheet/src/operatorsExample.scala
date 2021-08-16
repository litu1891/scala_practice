object operatorsExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  println("Welcome to the Scala worksheet");$skip(12); 
  var x = 3;System.out.println("""x  : Int = """ + $show(x ));$skip(12); 
  var y = 9;System.out.println("""y  : Int = """ + $show(y ));$skip(21); 
  
  var sum = x + y;System.out.println("""sum  : Int = """ + $show(sum ));$skip(15); 
  var b1 = x&y;System.out.println("""b1  : Int = """ + $show(b1 ));$skip(15); 
  var b2 = x|y;System.out.println("""b2  : Int = """ + $show(b2 ));$skip(15); 
  var b3 = x^y;System.out.println("""b3  : Int = """ + $show(b3 ));$skip(19); 
  
  var b4 = x<<2;System.out.println("""b4  : Int = """ + $show(b4 ));$skip(39); 
  
  val nums = 1::3::5::2.3::"h"::Nil;System.out.println("""nums  : List[Any] = """ + $show(nums ));$skip(45); val res$0 = 
  if (x>0 || y>0) "Both values are positive";System.out.println("""res0: Any = """ + $show(res$0))}
}
