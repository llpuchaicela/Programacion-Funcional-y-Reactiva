package Clase2

import scala.io.StdIn.{readInt, readLine}
import javax.swing.JOptionPane

object Clase2 extends App {

  /*
  //declaración de variables
  val stringNombres = "Jammil"
  val stringApellidos = "Ramos"
  val stringNombresCom = stringNombres + " " + stringApellidos
  println(stringNombres + " " + stringApellidos)
  println(s"Los nombres completos son: $stringNombres $stringApellidos")
  println(s"Los nombres completos son: $stringNombres $stringApellidos")
  println("Ingrese un valor :")
  val stringDato = readLine()
  println(s"El nuevo dato ingresado: $stringDato")
  println("Ingrese un dato:")
  val intDato = readLine().toInt
  println(intDato)
  println("Ingrese un dato Siguiente:")
  val intDato2 = readInt()
  println(s"El dato es: $intDato2")
  val datosPanel = JOptionPane.showInputDialog(null, "Ingrese datos por Joption:")
  println(datosPanel)
  JOptionPane.showMessageDialog(null, datosPanel, "Resultado Panel", JOptionPane.PLAIN_MESSAGE)

  */

  /*

  //conficonal if else

  val inta = 3
  val intb = 4
  if (inta == intb) println("cumple condición")
  else println("No cumple la condidión-ES INCORRECTO ")


  val intc = if (inta < intb) inta else intb
  println(intc)
  */


  // if else if

  val intCompara = 40

  if (intCompara == 10) {
    println("el valor de dato es: " + 10)
  } else if (intCompara == 20) {
    println("El valor del dato es :" + 20)
  } else if (intCompara == 30) {
    println("El valor de dato es:" + 30)
  } else println("FIN DE TAREA")

  val valorA = 40
  val valorB = 50
  val valorC = 70

  if (valorA > valorB) {
    if (valorA > valorC) {
      println(s"$valorA es mayor")
    } else {
      println(s"$valorC es mayor ")
    }
  } else if (valorB > valorC) {
    println(s"$valorB es mayor")
  } else {
    println(s"$valorC es mayor")
  }
  //BUCLE FOR
  val dat = Array(1, 2, 3, 4)
  //for (i <- dat) println(i)

  val datosUno = 0
  val datosDos = 0

  for (datosUno <- 1 to 3; datosDos <- 1 to 3) {
    println(s"Valor de datosUno= $datosUno")

    println(s"Valor de datosDos= $datosDos")
  }

println("******")
  val ArregloA = Array(10, 20, 30, 40, 50)
  for (i <- ArregloA) println(i)

  val arregloB = for {i <- ArregloA if i != 20} yield i
  for (i <- arregloB) println(i)

  //MATCH
  val meses = 1
  meses match {
    case 1 => println("Enero")
    case 2 => println("Febrero")
    case 3 => println("Marzo")
    case 4 => println("Abril")
    case 5 => println("Mayo")
    case _ => println("Mes No reconocido")
  }

}
