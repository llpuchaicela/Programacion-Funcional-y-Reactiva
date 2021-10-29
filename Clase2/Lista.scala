package Clase2

object Lista extends App {

  def suma(n: Int)= n+n
  println(suma(2))

  def defStandar(x: List[Double]): Double={
    val n= x.length.toDouble
    val xsum = x.sum
    val x2sum = x.map(x=> x*x).sum
    math.sqrt(x2sum/(n-1)- xsum * xsum/n/(n-1))
  }

  println(defStandar(List(10.0, 20, 0, 30, 0)))

//DEFINICION DEL METODO
  def m1(x:Int)=x+1
  //DEFINICION DE FUNCION
  val f1= (x: Int)=> x+1
}
