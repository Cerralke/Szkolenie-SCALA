object Lotto extends App {
	val r = scala.util.Random
	val results = shuffleResults

	println("Give your results: ")
	val userNumbers = List(readInt(), readInt(), readInt(), readInt(), readInt(), readInt())

	val winning = findHits(results, userNumbers).size

	println(s"Trafione zostało $winning liczb!")

	def findHits(results: List[Int], user: List[Int]) = {
		val resultsSet = results.toSet
		val userSet = user.toSet
		resultsSet.intersect(userSet)
	}

	def shuffleResults = {
		val range = scala.util.Random.shuffle(Range(1, 49).toList)
		range.take(6)
	}
}