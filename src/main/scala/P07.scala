object P07 {
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ns: List[_] => flatten(ns)
    case x => List(x)
  }
}
