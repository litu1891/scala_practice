object decisions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	var today = "Tuseday"                     //> today  : String = Tuseday
	if(today == "Monday") println("It might rain")
	else println("It is not monday, so it will not rain")
                                                  //> It is not monday, so it will not rain
	
	var b = 4                                 //> b  : Int = 4
	var a = if(b < 0) -1 else 1               //> a  : Int = 1
	println(a)                                //> 1
	
	println(if(b < 0) "-" else if (b==0) "0" else "+")
                                                  //> +
  var rate = 10.50                                //> rate  : Double = 10.5
  
  def earning(s:String, h:Double) : String = {
  	if (s != "y") {
  		if( h <=40 )
  			"Salary is: $"+ h * rate
  		else {"Salary is: $"+ (rate * 40 + (h-40) * rate * 1.5)}
  		}
  	else "This is a salaried employee"}       //> earning: (s: String, h: Double)String
  	
  	println(earning("n",30))                  //> Salary is: $315.0
  	println(earning("n",45))                  //> Salary is: $498.75
  	println(earning("y",50))                  //> This is a salaried employee
 
}