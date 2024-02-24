object P08 {
  def compress[A](ls: List[A]): List[A] = ls match
    case Nil => Nil
    case h :: tail => h :: compress(tail.dropWhile(_ == h))
}