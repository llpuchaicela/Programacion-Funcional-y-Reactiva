import KANTANcsv.data
import kantan.csv.ops._
import kantan.csv._
import kantan.csv.generic._
object KANTANcsv extends App {
  val data: java.net.URL = getClass.getResource("/movie_dataset.csv")
  type movie1 = (Int, Int, String, String, Int, String, String)
  val lectura = data.asCsvReader[List[String]](rfc.withHeader)
  // lectura.foreach(println _)


  case class movie(index: Int, budget: Int, genres: String, homepage: String, id: Int, keywords: String)

  println("tercer tutorial")
  println(scala.io.Source.fromURL(data).mkString)

  implicit val movieDecoder: RowDecoder[movie] = RowDecoder.ordered {
    (index: Int, budget: Int, genres: String, homepage: String, id: Int, keywords: String)
    =>
      movie(index, budget, genres, homepage, id, keywords)
  }
  val iterator = data.asCsvReader[movie](rfc.withHeader())

  val filtered = iterator.filter(_.exists(_.budget >= 2000000)).map(_.map(_.budget))
  println("cuarto tutorial")
  println(filtered.next)


}
