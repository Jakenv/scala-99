import scala.annotation.tailrec

object P01 {
  def lastBuiltin[A](ls: List[A]): A = ls.last
  @tailrec
  def lastRec[A](ls: List[A]): A = ls match
    case h :: Nil => h
    case _ :: tail => lastRec(tail)
    case _ => throw new NoSuchElementException
}