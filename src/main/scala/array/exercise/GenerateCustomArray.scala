package array.exercise

import scala.util.Random

/**
  * Author: 端吉
  * Date:   2017/4/1.
  * 从0 ~ n 填充 0~n间的随机数
  */
object GenerateCustomArray {
  def main(args:Array[String]): Unit ={
    val a = new Array[Int](10)
    for(index<-0 until 10) {
      a(index)=new Random().nextInt(10)
    }

    for(num<-a) {
      println(num)
    }
  }
}
