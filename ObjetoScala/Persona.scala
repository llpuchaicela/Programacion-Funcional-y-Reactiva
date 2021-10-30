package ObjetoScala

class Persona(
                val strNombre: String,
                val strApellidos: String,
                val intEdad: Int){


  def Imprimir(strNombre: String):Unit= {
    println(s"Mi nombre es $strNombre, " +
      s"y mi apellido es $strApellidos, " +
      s"con edad de $intEdad años")
  }
  Imprimir(strNombre)

  override def toString = s"Persona($strNombre, $strApellidos, $intEdad)"


}


