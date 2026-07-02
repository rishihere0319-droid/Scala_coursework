import breeze.linalg._
import breeze.stats._

object Practical4 {

  def main(args: Array[String]): Unit = {

    // Create two dense vectors
    val v1 = DenseVector(1.0, 2.0, 3.0, 4.0, 5.0)
    val v2 = DenseVector(5.0, 4.0, 3.0, 2.0, 1.0)

    // Sum of elements in v1
    val sumValue = sum(v1)

    // Mean of elements in v1
    val meanValue = mean(v1)

    // Dot product of v1 and v2
    val dotProduct = v1 dot v2

    // Display results
    println("Vector 1: " + v1)
    println("Vector 2: " + v2)
    println("Sum = " + sumValue)
    println("Mean = " + meanValue)
    println("Dot Product = " + dotProduct)
  }
}