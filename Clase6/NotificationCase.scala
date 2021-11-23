package Clase6

import scala.io.StdIn._

case class SMS(numero: String, cuerpo: String)

case class Correo(notificaciones: String, titulo: String, cuerpo: String)

case class Buzon(contacto: String, link: String)

object NotificationCase extends App {

  println(
    """
      |Tipos de notificaciones
      |1. SMS
      |2. Email
      |3. Buzón
      |""".stripMargin)

  val notification = readInt()

  notification match {
    case 0 => println(SMS("0988636271", "Señor Usuario debe acercarse+" +
      "a las instalaciones para recibir " +
      "mayor informacion, que tenga un buen día"))
    case 1 => println(Correo("Hotmail", "Saludo", "Señor Usuario debe acercarse" +
      " a las instalaciones para recibir " +
      "mayor informacion, que tenga un buen día"))
    case 2 => println(Buzon("Jordan", "https://www.instagram.com/lilo_23_01/"))
    case _ => println("No ha seleccionado ")
  
  }
}