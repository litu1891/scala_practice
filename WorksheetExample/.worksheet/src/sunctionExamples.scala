object sunctionExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  def abs(x:Int) = if (x < 0) -x else x;System.out.println("""abs: (x: Int)Int""");$skip(10); val res$0 = 
  abs(-5);System.out.println("""res0: Int = """ + $show(res$0));$skip(93); 
  
  def fac(n:Int) = {
  	var result = 1
  	for ( i <- 1 to n)
  	result *= i
  	result
  };System.out.println("""fac: (n: Int)Int""");$skip(9); val res$1 = 
  fac(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(70); 
  
  def factorial(n:Int):Int = if (n <= 0) 1 else n * factorial(n-1);System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$2 = 
  factorial(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(143); 
  
  def printname(left:String="[",firstName :String, lastName:String,right:String="]"){
  	println(left+firstName + " " + lastName+right)
  };System.out.println("""printname: (left: String, firstName: String, lastName: String, right: String)Unit""");$skip(86); 
  //printname("ranjan","priya")
  printname(lastName = "Ranjan",firstName = "Priya" );$skip(140); 
                                                  
	
	def sum(args:Int*) = {
		var result = 0
		for( arg <- args) result += arg
		result
	};System.out.println("""sum: (args: Int*)Int""");$skip(16); val res$3 = 
	sum(1,2,3,4,5);System.out.println("""res3: Int = """ + $show(res$3))}
	
}
