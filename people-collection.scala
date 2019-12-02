case class Person (name: String, surname: String, age: Int, email: Option[String])

object CollectionOfPeople extends App {
	val ppl = Vector(Person("Damian", "Buła", 23, Some("bula@wp.pl")),
					Person("Kasia", "Chodsky", 56, Some("chodsky@pes.pl")),
					Person("Wanda", "Wostocznik", 35, Some("woo@ss.pl")),
					Person("Hans", "Doberman", 19, Some("fafik@gomail.com")),
					Person("Olga", "Toy", 99, Some("nowoczesna-babcia@o2.pl")),
					Person("Dżesika", "Pudl", 9, Some("dzesika@brajanki.pl")),
					Person("Brajanek", "Degu", 13, Some("dddd@brajanki.pl")),
					Person("Ryszard", "Sweter", 11, Some("rysio@brajanki.pl")),
					Person("Jolanta", "Maltan", 72, None),
					Person("Igna", "Yoreczek", 18, None),
					Person("Kura", "Ozdobna", 12, None),
					Person("Krystyna", "Ozdobna", 24, Some("kurnik@ku.ku")), 
					Person("Łilhelm", "Blokowy", 9, None))

	val (adults, kids) = ppl.partition(_.age >= 18)
	val noMail = ppl.filter(_.email.isEmpty)

	// val pplIndexed = ppl.zipWithIndex
	// println("Give surname: ")
	// val search = readLine()
	// val found = pplIndexed.filter(_._1.surname == search)
	// println(found)

	// val sortedBySurname = ppl.sortBy(_.surname)
	// println(sortedBySurname)

	// val sortedBySurnameAndName = ppl.sortBy(p => (p.surname, p.name))
	// println(sortedBySurnameAndName)

	// val sortedByAge = ppl.sortBy(p => (p.age, p.surname))
	// println(sortedByAge)

	// println(oldestPerson(ppl))

	// ageRange(ppl)
	println(groupByAge(5, ppl))

	def ageRange(collection: Vector[Person]) = {
		val myMap = collection.map(c => (c.age / 10))
		println("Wiek 0 - 20: ")
		println(myMap.filter(_ < 2).size)
		println("Wiek 20 - 40: ")
		println(myMap.filter(a => (a > 2) && (a < 4)).size)
		println("Wiek ponad 40: ")
		println(myMap.filter(_ > 4).size)
	}

	def groupByAge(ageDifferenceLessThan: Int, people: Vector[Person]) = {
		val myMap = people.groupBy(c => (c.age / ageDifferenceLessThan))
		myMap.values.toList
	}

	def oldestPerson(collection: Vector[Person]) = {
		collection.maxBy(_.age)
	}
}