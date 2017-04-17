package array.generic

import scala.reflect.ClassTag

/**
  * Author: 端吉
  * Date:   2017/4/16.
  */
class ScalaGenericArray[T: ClassTag] {

  val arr: Array[T] = new Array[T](10)

}

object ScalaGenericArray {
  def main(args: Array[String]): Unit = {

    val arr = new ScalaGenericArray[String]
  }
}