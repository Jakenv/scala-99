import scala.annotation.tailrec

object P03 {
  def nthBuiltin[A](n: Int, ls: List[A]): A =
    if n >= 0 then ls(n)
    else throw new NoSuchElementException

  @tailrec
  def nthRec[A](n: Int, ls: List[A]): A = (n, ls) match
    case (0, h :: _) => h
    case (n, _ :: tail) => nthRec(n - 1, tail)
    case _ => throw new NoSuchElementException
}
