object higherOrderFunction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	val double = (i:Int) => i * 2             //> double  : Int => Int = higherOrderFunction$$$Lambda$8/1456208737@1cd072a9
	def higherOrder(x:Int, y:Int =>Int) = y(x)//> higherOrder: (x: Int, y: Int => Int)Int
	higherOrder(6,double)                     //> res0: Int = 12
	
	val triple = (i:Int) => i * 3             //> triple  : Int => Int = higherOrderFunction$$$Lambda$9/2088051243@4c203ea1
	higherOrder(6,triple)                     //> res1: Int = 18
	
	def sayHello = (name : String) => { "Hello"+" "+name}
                                                  //> sayHello: => String => String
	val grretings = sayHello("Monalisa")      //> grretings  : String = Hello Monalisa
	var y = 5                                 //> y  : Int = 5
	val  multiplier = (x:Int) => x * y        //> multiplier  : Int => Int = higherOrderFunction$$$Lambda$11/997110508@1e643fa
                                                  //| f
	multiplier(10)                            //> res2: Int = 50
}