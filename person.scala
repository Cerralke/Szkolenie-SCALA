object RunPerson extends App {
	val human1 = Person("Andrzej", "Pupa", 35, None)
	val human2 = Person("Krystyna", "Czacza", 51, None)
	val human3 = Person("Marek", "Kulka", 14, Some("kulka@costam.pl"))

	val human4 = human2.copy()
	println("Czy Krystyna Czacza to Krystyna Czacza?")
	println(human2 == human4)

	println("Jakiego Marek ma maila?")
	val e = human3.toStringIsDefined
	println(e)

	println("Jakiego Andrzej ma maila?")
	println(human1.toStringMatchCase)

	val people = List(human1, human2, human3, human4)
	println("Pełna lista osób:")
	for(human <- people) {
		val name = human.name;
		val surname = human.surname;
		val age = human.age;
		val mail = human.toStringIsDefined
		println(s"$name $surname ma $age lat. Email: $mail")
	}

	println("Kto ma maila?")
	println(filter(people, doesPersonHasMail))

	def filter(people: List, method: Person => Boolean) = {
		for(human <- people) {
			if (method(human)) human
		}
	}

	def doesPersonHasMail(person: Person) = {
		person.email.isDefined
	}

	def isPersonOver18(person: Person) = {
		person.age > 18
	}
}

case class Person (name: String, surname: String, age: Int, email: Option[String]) {

	val noEmail = "brak danych"
	
	def toStringIsDefined = {
		if(email.isDefined) {
			email.get
		}
		else noEmail
	}

	def toStringMatchCase() = {
		email match {
			case Some(email) => email
			case None => noEmail
		}
	}
}
