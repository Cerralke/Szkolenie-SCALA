object Selfcount extends App {
  val lines = io.Source.fromFile("count-self.scala").getLines.toList

  println(lines.filterNot(_.isEmpty).length)
}