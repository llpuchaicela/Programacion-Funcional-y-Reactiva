package Clase6

import scala.io.StdIn.*
import scala.util.Random

object Calculadora extends App {

  println("Ingrese 1 Valor")
  val dato1 = readLine().toInt
  println("Ingrese valor 2")
  val dato2 = readLine().toInt

  println("0 - Suma")
  println("1 - resta")
  println("2 - Multiplicar")
  println("3 - Dividir ")
  println("Elija una opción: ")
  val op = readLine()
  val Op = op.toInt

  calculate(Op)

  def calculate(Op: Any): Any = Op match {

    case 0 => println(s"El resultado de la suma es:  ${dato1 + dato2}")

    case 1 => println(s"El resultado de la resta es:  ${dato1 - dato2}")

    case 2 => println(s"El resultado de la multiplicación es:  ${dato1 * dato2}")

    case 3 => println(s"El resultado de la división es:  ${dato1.toDouble / dato2.toDouble}")

    case _ => println("No existe operación")

  }

}
