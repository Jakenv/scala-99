object P04 {
  def lenghtBuiltin[A](ls: List[A]): Int = ls.length

  def lenghtRec[A](ls: List[A]): Int = ls match
    case Nil => 0
    case _ :: tail => 1 + lenghtRec(tail)

  def lenghtFold[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1}
}