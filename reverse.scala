object ReverseString extends App {
	val stringToReverse = readLine()

	println(reverseString(stringToReverse))

	def reverseString (myString: String): String = {
		if (myString.isEmpty) ""
		else reverseString(myString.tail) + myString.head.toString
	}
}