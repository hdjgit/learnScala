package other.optiondemo

/**
  * Author: 端吉
  * Date:   2017/4/15.
  */
object OptionDemo {
  def main(args: Array[String]): Unit = {
    val strMap = Map("key1" -> "value1", "key2" -> "value2", "key3" -> "value3")
    val value = strMap.get("key1")
    val nullVal=strMap.get("key4")
    println(value)
    println(nullVal)

    //get方法返回Option[T],有值时候返回Some(T),没有值时候返回None

    //可以通过isEmpty和get获取值
    println(s"val.isEmpty:${value.isEmpty}")

    val value2=strMap.getOrElse("key","zzz")
    println(s"value2:$value2")

    //遍历时候忽略None
    for(result<-strMap.get("zzz")) println("has value")

    //可以通过map、foreach、filter方式直接调用
  }
}
