object Statisticsexample2 extends App {

  val numbers = List(1, 2, 3, 2, 4, 5, 2, 6)

  // Mean
  val mean = numbers.sum.toDouble / numbers.length

  // Median
  val sorted = numbers.sorted

  val median =
    if (sorted.length % 2 == 0)
      (sorted(sorted.length / 2 - 1) + sorted(sorted.length / 2)).toDouble / 2
    else
      sorted(sorted.length / 2)

  // Mode
  val mode = numbers.groupBy(identity).maxBy(_._2.size)._1

  println(s"Mean = $mean")
  println(s"Median = $median")
  println(s"Mode = $mode")
}