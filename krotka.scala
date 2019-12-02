object Krotka extends App {
	val iTakeArguments: (Int, Int) => Int = add
	val iTakeKrotka: ((Int, Int)) => Int = subtract

	def add(nr1: Int, nr2: Int) = nr1 + nr2

	def subtract(t: (Int, Int)) = t._1 - t._2

	// czy to działa?
	// println(iTakeArguments(1,2))
	// println(iTakeKrotka((2,1)))

	// krotka do argumentów
	// iTakeArguments((1, 2))
	// Error: Not enough arguments.

	// argumenty do krotki
	result = iTakeKrotka(1, 2)
	// ok - gives proper result
}