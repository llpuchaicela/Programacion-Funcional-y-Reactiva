package Clase6

import javax.swing.JOptionPane

object PatternMatching extends App{

  val dato1 : Int = JOptionPane.showInputDialog(null,"Ingrese el primer valor : " ).toInt
  val dato2 : Int = JOptionPane.showInputDialog(null, "Ingrese el segundo valor: " ).toInt

  val op = JOptionPane.showOptionDialog(null,
  "Elija una opción: ",
    "Calculadora Aritmetica",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE, null,
    Array('+', '-', '*', '/'), null)

    op match {
      case 0 => JOptionPane.showMessageDialog(null,
      s"El resultado de la suma es:  ${dato1 + dato2}",
      "Calculadora Aritmetica",
        JOptionPane.PLAIN_MESSAGE)

      case 1 => JOptionPane.showMessageDialog(null,
        s"El resultado de la resta es:  ${dato1 - dato2}",
        "Calculadora Aritmetica",
        JOptionPane.PLAIN_MESSAGE)

      case 2 => JOptionPane.showMessageDialog(null,
        s"El resultado de la multiplicación es:  ${dato1 * dato2}",
        "Calculadora Aritmetica",
        JOptionPane.PLAIN_MESSAGE)

      case 3 => JOptionPane.showMessageDialog(null,
        s"El resultado de la división es:  ${dato1 / dato2}",
        "Calculadora Aritmetica",
        JOptionPane.PLAIN_MESSAGE)

      case _ => JOptionPane.showMessageDialog(null, "No existe operación")


    }

}
