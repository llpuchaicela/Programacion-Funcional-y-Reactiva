package Clase2

object Colleciones extends App {

  val arreglo = Array(1,2,3,4,5)
val arreglo2= Array(6,7,8)
  println("Arreglo Normal")

  println(arreglo.mkString(","))

  println("Arreglo con Foreach")
  arreglo.foreach(i=>println(i))

  println("Arreglo con For")
  for(j<- arreglo)
    println(j)

val arreglo3 = arreglo ++ arreglo2
  println("Imprimir nuevo arreglo combinado")
println(arreglo3.mkString(","))



  //ARRAY BUFFER


}
