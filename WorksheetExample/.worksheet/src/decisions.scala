object decisions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(23); 
	var today = "Tuseday";System.out.println("""today  : String = """ + $show(today ));$skip(103); 
	if(today == "Monday") println("It might rain")
	else println("It is not monday, so it will not rain");$skip(13); 
	
	var b = 4;System.out.println("""b  : Int = """ + $show(b ));$skip(29); 
	var a = if(b < 0) -1 else 1;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
	println(a);$skip(54); 
	
	println(if(b < 0) "-" else if (b==0) "0" else "+");$skip(19); 
  var rate = 10.50;System.out.println("""rate  : Double = """ + $show(rate ));$skip(222); 
  
  def earning(s:String, h:Double) : String = {
  	if (s != "y") {
  		if( h <=40 )
  			"Salary is: $"+ h * rate
  		else {"Salary is: $"+ (rate * 40 + (h-40) * rate * 1.5)}
  		}
  	else "This is a salaried employee"};System.out.println("""earning: (s: String, h: Double)String""");$skip(32); 
  	
  	println(earning("n",30));$skip(28); 
  	println(earning("n",45));$skip(28); 
  	println(earning("y",50))}
 
}
