package array.common.variable

import scala.collection.mutable.ArrayBuffer

/**
  * Author: 端吉
  * Date:   2018/9/8.
  */
object ArrayBufferDemo {

  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer[Int]() //初始化
    //或者
    //    val b = new ArrayBuffer[Int]

    b += 1 //添加一个元素
    b += (1, 2, 3, 4, 5) //添加多个元素在末尾

    println(s"b:$b") //b:ArrayBuffer(1, 1, 2, 3, 4, 5)

    b ++= Array(8, 1, 34) //一次添加一个数组，注意这里是数组
    println(s"b:$b") //b:ArrayBuffer(1, 1, 2, 3, 4, 5, 8, 1, 34)

    b.trimEnd(3) //移除最后三个元素
    println(s"b:$b") //b:ArrayBuffer(1, 1, 2, 3, 4, 5)

    //scala也支持插入一个元素到任意位置，但是性能不好（index后面所有的元素都需要移动一位）算法复杂度O(n)
    b.insert(1, 6, 6, 6) //index=2 插入 6,6,6
    println(s"b:$b") //b:ArrayBuffer(1, 6, 6, 6, 1, 2, 3, 4, 5)

    //移除元素
    b.remove(1, 3)  //从第1 index个开始，移除3个元素
    println(s"b:$b") //b:ArrayBuffer(1, 1, 2, 3, 4, 5)

    //转变成数组
    val array = b.toArray
    array.toBuffer // 转成ArrayBuffer
  }
}
