package Clase2

object Practica2 extends App {

  // PROGRAMA para encontrar los pares
  // de elementos en una matriz cuya suma sea igual a un numero especifico.

  println("Suma de numeros especificos  ")

  var arreglo = Array(2, 7, 4, -5, 11, 5, 20)

  //for (i <- arreglo ; j <-  arreglo  if (i + j == 15)) println(s"$i + $j  =  15")

  for (i <- 0 to arreglo.length - 1) {
    for (j <- i to arreglo.length - 1) {
      if (arreglo(i) + arreglo(j) == 15) {
        println(arreglo(i) + " + " + arreglo(j) + "  =  15")
      }
    }
  }

  //Programa para encontrar el producto maximo de dos
  //enteros en una matriz dada de enteros

  println("Producto de números máximo")
  var arregloUno = Array(2, 3, 5, 7, -7, 5, 8, -5)
  println("El arreglo original es " + arregloUno.mkString(","))
  arregloUno = Array(2, 3, 5, 7, -7, 5, 8, -5)
  scala.util.Sorting.quickSort(arregloUno)
  println("El arreglo ordenado es : " + arregloUno.mkString(","))

  //Elimina ultimo elemento de la lista
  val ultimo = arregloUno.max
  println("El numero maximo es : " + ultimo)

  val nuevoArray = arregloUno.dropRight(1)
  println("El arreglo sin el ultimo elemento es " + nuevoArray.mkString(","))

  val penultimo = nuevoArray.max
  println("El segundo numero maximo de la lista es  " + penultimo)
  println("El producto maximo de la lista es " + ultimo * penultimo)

  //Programa pa separar numeros pares e impares de una matriz
  // dada de enteros ponga todos los numeros pares primero yb luego los impares

  println("Ordena una lista primero pares  y impares ")
  var arregloDos = Array(20, 12, 23, 17, 7, 8, 10, 2, 1)
  for (i <- arregloDos if (i % 2 == 0)) {
    print(i + ",")
  }

  for (i <- arregloDos if (i % 2 != 0)) {
    print(i + ",")
  }

  // ***  LISTAS   ***
  //Programa para imprimir los elementos de una lista y calcular la suma y el p
  //producto de todos los elementos de esta lista

  println("Suma y producto de una lista")

  var lista = List(3, 4, 1, 2, 6, 8, 2, 3)
  println("Suma de la lista " + List(lista.sum))
  println("Producto de la lista " + List(lista.product))

  //Programa para comprobar si una lista determinada es un palindromo o no (funcion reverse)

  println("Programa para determinar si una lista es un palindromo")

  println("Determina si la lista es un palindromo")
  var listaUno = List(1, 2, 3, 4, 4, 3, 2, 1)
  println("Lista original " + listaUno.mkString(","))
  val listaReversa = listaUno.reverse
  println("Lista en reversa " + listaReversa.mkString(","))
  val compara = listaReversa.intersect(listaUno)
  println("La lista  es un palindromo " + compara.mkString(","))

  //Programa para triplicar cada elemento inmediatamente al lado de la lista dada de enteros. (funcoin flapmap)

  println("Programa que imprime los valores triplicados ")

  val serie = List(3, 6, 1, 2)
  print(serie.mkString(","))

  for (i <- serie) print(","+ List.fill(3)(i).mkString(","))

  //    3, 6,1,2,4 333,666,111,222,444
}
