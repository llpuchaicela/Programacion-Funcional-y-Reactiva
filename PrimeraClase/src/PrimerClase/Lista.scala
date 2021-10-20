package PrimerClase

import scala.::

object Lista extends App {
val ListaUno : List[Int]= List(1, 2, 3, 4)
  println(ListaUno)


  //Matriz de 2*2

  val listBid : List[List[String]] = List(List("Jammil" , " Francisco"),
    List("Carlos, Kevin "))
println(listBid)

  val ListaDos : List [Double] =  10.1 :: 3.8 :: 5.0 :: Nil
println(ListaDos)

  val ListaTress : List [Double] = 10.1 :: (3.8 :: (5.0 :: Nil))
  println(ListaTress)


  //Son las PRINCIPALES PARA USAR CALCULO LANDA POR MÉTODO O RECURSIVO
  println("Los metodos principales son : " )
  print(ListaUno )

  println( "\n")

  println(ListaUno.head)
  println(ListaUno.tail)
  println(ListaUno.empty)

  val condicion = false
  val valcondicion = if(condicion) 5 else 3
  println(valcondicion)

  val condicional = 3
  val resultado = if(condicional == 2)
    println("Igual")
  else println("Diferente")

  var i =0
  val cicloWhile = while (i<20)    {
      print(i)
      i+=1

    }
}
