object CountPartial extends App {

  def fizzbuzz () {
    var riable = readInt()
    val range = readInt()

    val printNr = Map(3 -> "Fizz", 5 -> "Buzz", 35 -> "FizzBuzz")

    while(riable <= range) {
      val number = {
        if ((riable % 3 == 0) && (riable % 5 == 0)) 35
        else if (riable % 3 == 0) 3
        else if (riable % 5 == 0) 5
        else riable
      }

      println(printNr.applyOrElse(number,(nr: Int) => nr))

      riable=riable+1
    }
  }

  fizzbuzz()
}