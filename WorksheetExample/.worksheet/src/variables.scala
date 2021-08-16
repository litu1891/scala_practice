object variables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(43); 
  
  var greeting, message : String = null;System.out.println("""greeting  : String = """ + $show(greeting ));System.out.println("""message  : String = """ + $show(message ));$skip(29); 
  
  val list1 = List(1,2,3);System.out.println("""list1  : List[Int] = """ + $show(list1 ));$skip(28); 
  val list2 = List(1,2,3.0);System.out.println("""list2  : List[Double] = """ + $show(list2 ));$skip(29); 
  val list3 = List(1,2,true);System.out.println("""list3  : List[AnyVal] = """ + $show(list3 ));$skip(38); 
  val list4 = List(1,2,true,"Ranjan");System.out.println("""list4  : List[Any] = """ + $show(list4 ));$skip(25); 
	
	var a = 10.toString();System.out.println("""a  : String = """ + $show(a ));$skip(19); 
	var b = 10.to(20);System.out.println("""b  : scala.collection.immutable.Range.Inclusive = """ + $show(b ));$skip(20); 
	
	var c = 10.+(11);System.out.println("""c  : Int = """ + $show(c ));$skip(18); 
	var d = 10 to 20;System.out.println("""d  : scala.collection.immutable.Range.Inclusive = """ + $show(d ));$skip(19); 
	
	var e = 10 + 11;System.out.println("""e  : Int = """ + $show(e ));$skip(19); 
	var f = 97.toChar;System.out.println("""f  : Char = """ + $show(f ));$skip(21); 
	var g = 85.97.toInt;System.out.println("""g  : Int = """ + $show(g ));$skip(15); 
	
	a += " ten";$skip(12); 
	println(a)}
}
