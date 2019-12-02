object CountFunc extends App {

  def fizzbuzz (func: Int => String) {
    var riable = readInt()
    val range = readInt()
    while(riable<range) {
      println(func(riable))
      riable=riable+1
    }
  }

  def makeinttostring (number: Int) {
    if ((number % 3 == 0) && (number % 5 == 0)) "FizzBuzz"
    else if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"
    else number.toString
  }


  fizzbuzz(makeinttostring)
}