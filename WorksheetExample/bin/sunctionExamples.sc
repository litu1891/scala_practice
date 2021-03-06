object sunctionExamples {
  def abs(x:Int) = if (x < 0) -x else x           //> abs: (x: Int)Int
  abs(-5)                                         //> res0: Int = 5
  
  def fac(n:Int) = {
  	var result = 1
  	for ( i <- 1 to n)
  	result *= i
  	result
  }                                               //> fac: (n: Int)Int
  fac(5)                                          //> res1: Int = 120
  
  def factorial(n:Int):Int = if (n <= 0) 1 else n * factorial(n-1)
                                                  //> factorial: (n: Int)Int
  factorial(5)                                    //> res2: Int = 120
  
  def printname(left:String="[",firstName :String, lastName:String,right:String="]"){
  	println(left+firstName + " " + lastName+right)
  }                                               //> printname: (left: String, firstName: String, lastName: String, right: String
                                                  //| )Unit
  //printname("ranjan","priya")
  printname(lastName = "Ranjan",firstName = "Priya" )
                                                  //> [Priya Ranjan]
                                                  
	
	def sum(args:Int*) = {
		var result = 0
		for( arg <- args) result += arg
		result
	}                                         //> sum: (args: Int*)Int
	sum(1,2,3,4,5)                            //> res3: Int = 15
	
}