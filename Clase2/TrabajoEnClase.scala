package Clase2

import scala.io.StdIn._

object TrabajoEnClase extends App {
  //Escriba un programa Scala para verificar dos enteros dados
  // y devuelva verdadero si uno de ellos es 30 o si su suma es 30

  println("Ingrese el valor: ")

  val stringDato = readInt()
  val stringDato2 = readInt()

  val lista = List(stringDato, stringDato2)
  if(verificaSuma(lista)== true){
    println("Es verdadero")
  }else{println("Es falso")}

  def verificaSuma(lista: List[Int]): Boolean = {
    if (lista.contains(30)){
      true
    }else{
      if(lista.sum==30) true else false
    }
  }


  // Escriba un programa Scala para comprobar si una cadena determinada comienza con Sc o no


  // Escriba un programa Scala para encontrar el valor mas grande\n
  // de dos valores enteros positivos en el rango 20...30, o devuelva 0 si ninguno esta en ese rango


}
