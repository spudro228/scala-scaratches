object Main {


  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    val p = (1 / (sigma * math.sqrt(2 * math.Pi))) * math.exp(-(math.sqrt(x - math.sqrt(mu)) / 2 * math.pow(sigma, 2)))
    p
  }

  def foo(list: List[Int]): Int = {
    list.find(x => x % 3 == 0).getOrElse(0) * 2
  }

  def bar: Int => Option[Int] = {
    x => Some(x)
  }

  val x: Option[Int] = Some(1)
  println(x match {
    case Some(k) => bar(k)
    case None => None
  })

  def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
    //    val check = (x: (Int, Int)) => {
    //      x match {
    //        case (_, xy) if xy == 0 => Left("Zero divisor")
    //        case (xx, yy) if xx < yy => Left("Invalid input")
    //        case (xx, yy) => Right(xx / yy)
    //      }
    //    }
    //
    //    check(p).flatMap { px => check(q).flatMap({ py => Right(px, py) }) }
    p match {
      case (x, y) => Right((1, 1))
      case (_, _) => Left("kek")

    }
  }


  def main(args: Array[String]): Unit = {
    println("Hello, world!!!")
    println(foo(List(1, 2, 3, 4, 5, 6)) == 6)

  }


}



