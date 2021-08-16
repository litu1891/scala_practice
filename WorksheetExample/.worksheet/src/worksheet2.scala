object worksheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(32); 
  
  def add(a:Int,b:Int) = a+b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(13); val res$0 = 
  add(10,10);System.out.println("""res0: Int = """ + $show(res$0));$skip(39); 
  
  def substract(a:Int, b:Int) = a-b;System.out.println("""substract: (a: Int, b: Int)Int""");$skip(19); val res$1 = 
  substract(10,10);System.out.println("""res1: Int = """ + $show(res$1))}
}
