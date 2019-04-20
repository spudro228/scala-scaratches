import scala.None

def sqrt(i: Int): Option[Double] = {
  i match {
    case _ => Some(10)
    case i: Int if i <= 0 => None
  }
}

val bar: Double => Option[Double] = _ => Some(228.0)
sqrt(0).get
sqrt(0).flatMap(_ => Some(228.0))

def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
  val check = (x: (Int, Int)) => {
    x match {
      case (_, xy) if xy == 0 => Left("Zero divisor")
      case (xx, yy) if xx < yy => Left("Invalid input")
      case (xx, yy) => Right(xx / yy)
    }
  }

  check(p).flatMap { px => check(q).flatMap({ py => Right(px, py) }) }
}


