package PrimerClase

object Clase1 extends App {

    println("hola mundo")
    // En java: String nombre = "HOLA"
    //En escala: val = hace referencia a un valor | var = Cuando se requiera realizar una modificacion al valor
    //val
    val intX: Int = 2
    print(intX)
    //var
    var inty: Int = 3
    println(inty)
    inty = 3 + intX
    println(inty)
    //if

    val condicion = true
    val valCondicion = if (condicion) 5 else 3

    val condicional = 2
    val resultado: Unit = if (condicional == 2) println("Igual") else println("Diferente")
    //Ciclos con Scal:
    var i = 0
    val cicloRepetitivo: Unit = while (i < 23) {
      println(i)
      i += 1
    }

    var x = 1 to 20
    println(x)

    //Funcion en escala
    // def max(x:Int, y:Int)):Int ={
    //if(x > y
    // x
    // else
    // y
    // }
    //es el que devuelve el tipo de dato unit es como void
    def datosConsola(): Unit=
    {
      println("Ingrese 1 Valor")
      val valor1 = scala.io.StdIn.readLine()
      val intValor1=valor1.toInt
      println("Ingrese valor 2")
      val valor2 = scala.io.StdIn.readLine()
      val intValor2=valor2.toInt
      var suma = intValor1 + intValor2
      println("La suma de los valores es:" +suma)
      suma = intValor1 * intValor2
      println("La multi de los valores es:" +suma)
    }
    datosConsola()

    //1.-Funcion factorial
    //2.-Funcion fibonacis 5(ultimo valor)


 // https://www.it-swarm-es.com/es/scala/genere-una-secuencia-de-numero-de-fibonacci-en-scala/942008253/

    //3.- Funcion que permita determinar si un numero es primo
  }