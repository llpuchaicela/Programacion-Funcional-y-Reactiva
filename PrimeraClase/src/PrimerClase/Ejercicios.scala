package PrimerClase

import scala.annotation.tailrec

object Ejercicios extends App {
  //1.-Función factorial


  println("Ingrese el número del que desee su factorial: ")
  val valor = scala.io.StdIn.readLine()
  val intValor = valor.toInt

  def factorial(valor: Int): Int = {

    def fac(f: Int, valor: Int): Int = {
      if (valor <= 0) f else fac(f * valor, valor - 1)
    }

    fac(1, valor)
  }

  print(factorial(intValor))


  //2.-Funcion fibonacis 5(ultimo valor)
  println("\n Ingrese el numero para la serie fibonacci : ")
  val num = scala.io.StdIn.readLine()
  val intNum = num.toInt

  @tailrec
  def fib(num: Int, a: Int = 1, b: Int = 1, t: List[Int] = Nil): List[Int] = {
    if (num == 0) (a :: t).reverse else fib(num - 1, b, a + b, a :: t)
  }

  println(fib(intNum))


  //3.- Funcion que permita determinar si un numero es primo

  println("\n Introduce el numero a verificar si es primo : ")
  val x = scala.io.StdIn.readLine()
  val intX = x.toInt

  def esPrimo(x: Int): Boolean = {

    def primo(n: Int, i: Int): Boolean = (i == n) || (n % i != 0) && primo(n, i + 1)

    primo(x, 2)
  }

  println("El numero " + intX + " es ", esPrimo(intX))

}