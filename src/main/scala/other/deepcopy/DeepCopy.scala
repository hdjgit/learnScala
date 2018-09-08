package other.deepcopy

/**
  * Author: 端吉
  * Date:   2018/1/27.
  */
object DeepCopy {
  def main(args: Array[String]): Unit = {
    val computer = new Computer("computer1")
    val p = new Person("duanji", computer)
    println(s"${p}")

    val p2 = p.copy() //拷贝一下p2
    println(s"${p2}")

    println("-----------------")

    val p3 = p.copy(name = "lisi") // 由于都是val的，因此深拷贝时候不会改变原来的值
    println(s"${p}")
    println(s"${p2}")
    println(s"${p3}")
  }
}

case class Person(val name: String, val computer: Computer) {

}

case class Computer(val computerName: String) {

}