package other.deepcopy2


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

    val p3 = p.copy()
    p.computer = new Computer("computer2")  // 并不会改变其他的指向
    computer.computerName="new computer"
    println(s"${p}")
    println(s"${p2}")
    println(s"${p3}")
  }
}

case class Person(val name: String, var computer: Computer) {

}

case class Computer(var computerName: String) {

}