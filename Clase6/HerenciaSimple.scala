package Clase6

object EjercicioClase6Herencia extends App {
//TEST HERENCIA SIMPLE
  val objOficial = Oficial()
  objOficial.imprimirOf()
  objOficial.imprimirOpe()
  objOficial.imprimirEmpleado()
  println()

  val objTecnico = Tecnico()
  objTecnico.imprimirTec()
  objTecnico.imprimirOpe()
  objTecnico.imprimirEmpleado()
  println()

  val objDirectivo = Directivo()
  objDirectivo.imprimirDirec()
  objDirectivo.imprimirEmpleado()
  println()
}


//Herencia Simple

class Empleado {
  val Nombres = "Michael Puchaicela"
  val Edad = 35

  def imprimirEmpleado(): Unit = {
    println(
      s"""
         |Empleado
         |Nombres: $Nombres
         |Edad : $Edad
         |""".stripMargin)
  }
}

class Operario extends Empleado {
  def imprimirOpe(): Unit = {
    println(
      s"""
         |Operario
         |Nombres: $Nombres
         |Edad : $Edad
         |""".stripMargin)
  }
}

class Directivo extends Empleado {
  def imprimirDirec(): Unit = {
    println(
      s"""
         |Directivo
         |Nombres: $Nombres
         |Edad : $Edad
         |""".stripMargin)
  }
}


class Oficial extends Operario {
  def imprimirOf(): Unit = {
    println(
      s"""
         |Oficial
         |Nombres: $Nombres
         |Edad : $Edad
         |""".stripMargin)
  }
}

class Tecnico extends Operario {
  def imprimirTec(): Unit = {
    println(
      s"""
         |Tecnico
         |Nombres: $Nombres
         |Edad : $Edad
         |""".stripMargin)
  }
}




