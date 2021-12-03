package PruebaBimestral

object ExBim extends App {

  println("Arco Coseno de un valor ")

  def pregunta1(): Unit = {
    val x = (n: Int) => (0 to 10000).map(i => (math.pow(-1, i)) / ((2 * i) + 1) * math.pow(n, (-2 * i - 1))).sum
    val pi = (16 * x(5)) - (x(239))
    println(pi)
  }

  pregunta1()


  println("Triángulo de Pascal ")

  def pascal(c: Int, f: Int): Int = {
    c match {
      case 0 => 1
      case c if (c == f) => 1
      case c if (c < f) => (pascal(c - 1, f - 1) + pascal(c, f - 1))
      case _ => -1

    }
  }

  println(pascal(1, 2))
  println(pascal(3, 3))
  println(pascal(2, 3))
  println(pascal(4, 5))
  println(pascal(4, 3))

  def pascal(x: Int): List[Int] = x match {
    case 1 => List(1)
    case n: Int => 1 +: ((pascal(n - 1) zip pascal(n - 1).tail) map { case (a, b) => a + b }) :+ 1
  }

  def trianguloPascal(n: Int) = (1 to n) foreach { i =>
    print(" " * (n - i));
    pascal(i) map (c => print(c + " "));
    println
  }

  trianguloPascal(8)
}

