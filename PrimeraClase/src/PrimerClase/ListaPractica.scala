package PrimerClase

object ListaPractica extends App {
  val serie: List[Int] = List(1, 2, 3, 4, 5, 6) map (_ * 2)

  println("El doble de los elementos de la lista son: ")
  serie foreach (numero => doble(numero))

  def doble(result: Int): Unit = {
    print(result + ", ")
  }

  println("\nLos metodos principales son : ")
  //metodo para determinar si la lista esta vacia
  println("\nLista vacia " + serie.isEmpty)
  //Metodo para obtener primer elemento de la lista
  println("\nPrimer elemento de la lista " + serie.head)
  //Metodo para obtener ultimo elemento de la lista
  println("\nUltimo elemento de la lista " + serie.tail)

  //Metodo para invertir la lista
  println("\n\nLista invertida " + serie.reverse)
  //Metodo para obtener prefijo de la lista
  println("\nPrefijo de la lista " + serie.take(3))
  //Metodo para obtener sufijo de la lista
  println("\nSufijo de la lista " + serie.drop(3))
  //Metodo para generar cadena de una lista
  println("\nCadena de la lista " + serie.mkString)
  //Metodo para obtener longitud de una lista
  println("\nLongitud de la lista " + serie.length)

   //Suma de la lista
  var sum = 0
  serie.foreach(sum += _)
  //Promedio de la lista
  var prom = 0
  prom = sum / serie.length

  println ("\nLa lista inicial " + serie)
  println("La suma de la lista es : " + sum)
  println("El promedio de la lista es " + prom + "\n ")


  val Lista: List[Double] = 7.1 :: 8.8 :: 5.3 :: Nil

  //Suma de la lista
  var sum2  = 0.0
  Lista.foreach(sum2 += _)
  //Promedio de la lista
  var prom2 = 0.0
  prom2 = sum2 / Lista.length

  println ("\nLa lista inicial " + Lista)
  println("La suma de la lista es : " + sum2)
  println("El promedio de la lista es " + prom2 + "\n ")
}
