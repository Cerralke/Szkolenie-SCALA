class Logger (val name: String, deflevel: Int = 3) extends Debug with Info with Warn with Error {

	var level = deflevel

	def communicate {
		if (level > 0) {
			error(s"Error in $name")
			if (level > 1) {
				warn(s"Warning in $name")
				if (level == 3)  {
					info(s"Notification in $name")
				}
			}
		} else {
			println(s"Wrong level in $name")
		}
	}

	def this(_class: Class[_]) = this(_class.getSimpleName)

	def changelvl (lvl: Int) {
		level = lvl
	}
}

object LogThis extends App {
	val logger = new Logger("Jakaś Apka")

	logger.communicate
}

object Level {
	val _level1 = 1
	val _level2 = 2
	val _level3 = 3
}

trait Debug {
	def debug(message: String) {
		println(s"Debug: $message")
	}
}

trait Info {
	def info(message: String) {
		println(s"Info: $message")
	}
}

trait Warn {
	def warn(message: String) {
		println(s"Warning: $message")
	}
}

trait Error {
	def error(message: String) {
		println(s"Error: $message")
	}
}

trait ErrorThrowable {
	def error(message: String, throwable: Throwable) {}
}

trait Appender {
	def append {}
}

class StreamAppender extends Appender {}

class ConsoleAppender extends StreamAppender {}

class FileAppender extends StreamAppender {}