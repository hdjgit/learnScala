package array.common.traverse

/**
  * Author: 端吉
  * Date:   2018/9/8.
  */
object TraverseArray {

  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4, 5)
    for (i <- 0 until a.length) {
      println(s"i:$i value:${a(i)}")
    }

    println("-----------")

    //遍历隔一个
    for (i <- 0 until a.length by 2) {
      println(s"i:$i value:${a(i)}")
    }

    println("-----------")

    //倒着遍历
    for (i <- 0 until a.length reverse) {
      println(s"i:$i value:${a(i)}")
    }

    println("-----------")

    //如果不需要index
    for (ele <- a) {
      println(s"value:${ele}")
    }
  }

}
