package array.common

/**
  * Author: 端吉
  * Date:   2018/9/8.
  */
object NewArrayDemo {

  def main(args: Array[String]): Unit = {
    //new一个大小不变的数组
    val nums = new Array[Int](10) //会被初始化为0

    val s = Array("hello", "world") //使用两个字符串初始化数组（记住，这里不需要new）

    s(0) = "good bye" //使用()来访问数组

    //scala数组底层实现就是java数组，上述底层是java.lang.String[]
  }
}
