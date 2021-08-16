object higherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(33); 
	
	val double = (i:Int) => i * 2;System.out.println("""double  : Int => Int = """ + $show(double ));$skip(44); 
	def higherOrder(x:Int, y:Int =>Int) = y(x);System.out.println("""higherOrder: (x: Int, y: Int => Int)Int""");$skip(23); val res$0 = 
	higherOrder(6,double);System.out.println("""res0: Int = """ + $show(res$0));$skip(33); 
	
	val triple = (i:Int) => i * 3;System.out.println("""triple  : Int => Int = """ + $show(triple ));$skip(23); val res$1 = 
	higherOrder(6,triple);System.out.println("""res1: Int = """ + $show(res$1));$skip(57); 
	
	def sayHello = (name : String) => { "Hello"+" "+name};System.out.println("""sayHello: => String => String""");$skip(38); 
	val grretings = sayHello("Monalisa");System.out.println("""grretings  : String = """ + $show(grretings ));$skip(11); 
	var y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(36); 
	val  multiplier = (x:Int) => x * y;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(16); val res$2 = 
	multiplier(10);System.out.println("""res2: Int = """ + $show(res$2))}
}
