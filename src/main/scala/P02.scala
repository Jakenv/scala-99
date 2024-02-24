import scala.annotation.tailrec

object P02 {
  def lastBuiltinUltimate[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  @tailrec
  def lastRecUltimate[A](ls: List[A]): A = ls match
    case h :: _ :: Nil => h
    case _ :: tail => lastRecUltimate(tail)
    case _ => throw new NoSuchElementException
}
