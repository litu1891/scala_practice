object loopsPractice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(34); 
	var x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(235); 
	/*while ( x >= 0 ) {
	println(x)
	x -= 1
	}
	
	do {
	println(x)
	x -= 1
	}
	while(x >=0)
	
  for (x <- 10 to 0 by -1){
  println(x)
  }
	println("BlastOff!")
  
  var y = for (num <- 1 to 10) yield num + 1   */
  var word = "Monday";System.out.println("""word  : String = """ + $show(word ));$skip(54); 
  for ( x <- 0 until word.length) { println(word(x))}}
}
