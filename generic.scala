object Generic extends App {
	val myConfig = new Config[String, Int]()
	myConfig.set("A", 1)
	myConfig.set("B", 2)
	myConfig.set("C", 3)

	println(myConfig.get("A", 23))
	println(myConfig.get("B", 11))
	println(myConfig.get("C", 1))

	var configA = new ConfigView(new Config[A, String])
	var configB = new ConfigView(new Config[B, String])

	configB = configA
}

class Config[K, V] {

	val map = scala.collection.mutable.Map.empty[K, V]

	def get(key: K, default: V) = {
		map.getOrElse(key, default)
	}

	def set(key: K, value: V) = {
		map(key) = value
	}
}

class ConfigView[-K, +V](config: Config[K, V]) {
	def get(key: K) = {
		config.map.get(key)
	}
}

class A {
	val fiubziu = "Ala ma kota"
}

class B extends A {
	val foo = 235
}

trait ConfigKey[K](key: K)

