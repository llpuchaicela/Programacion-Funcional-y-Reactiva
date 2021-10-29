package Clase2

object Tarea2 extends App{


  //Escriba un programa Scala para verificar dos enteros dados
  // y devuelva verdadero si uno de ellos es 30 o si su suma es 30

  def validar30(x: Int, y : Int): Boolean ={
    x==30||y ==30 || x+ y ==30

  }
  println(validar30(30, 15))
  println(validar30(0,30))
  println(validar30(15,15))



  // Escriba un programa Scala para comprobar si una cadena determinada comienza con Sc o no

  println("Programa para determinar letras en una cadena")
def validarString(strCadena:String): Boolean={

  strCadena.startsWith("sc")

  }
  println(validarString("scala"))
  println(validarString("Jva"))


  // Escriba un programa Scala para encontrar el valor mas grande\n
  // de dos valores enteros positivos en el rango 20...30, o devuelva 0 si ninguno esta en ese rango

println("Compara rango entre 20 y 30")
  def compararRango(x: Int, y: Int): Int={

    val valorUno = if(x>y)x else y

    if(valorUno>=20 && valorUno<=30)x else 0

  }
  println(compararRango(70, 90))
  println(compararRango(20, 30))
  println(compararRango(10,10))


}
