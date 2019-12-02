object Count extends App {
	var riable = readInt()
	val range = readInt()
  while(riable<range) { 
    if((riable%3==0) && (riable%5==0)){ 
      println("FizzBuzz") 
    } else if(riable%3==0) {
      println("Fizz")
    } else if(riable%5==0){ 
      println("Buzz") 
    } else {
      println(riable)
    } 
    riable=riable+1
  }
}