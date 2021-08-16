object worlsheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(12); 
  var x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(27); 
  val str = "Scala Rocks!";System.out.println("""str  : String = """ + $show(str ));$skip(29); 
  var odds = List(1,3,5,7,9);System.out.println("""odds  : List[Int] = """ + $show(odds ));$skip(10); val res$0 = 
  2 to 10;System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(19); 
  
  var y = true;System.out.println("""y  : Boolean = """ + $show(y ));$skip(19); 
  val pi = 3.14159;System.out.println("""pi  : Double = """ + $show(pi ));$skip(30); 
  def add(a:Int, b:Int) = a+b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(11); val res$1 = 
  add(4,9);System.out.println("""res1: Int = """ + $show(res$1))}
   
}
