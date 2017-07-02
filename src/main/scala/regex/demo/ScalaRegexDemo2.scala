package regex.demo

/**
  * Author: 端吉
  * Date:   2017/7/2.
  */
object ScalaRegexDemo2 {

    def main(args: Array[String]) = {
        val pattern ="""@@\$\$##--(.*?)--##\$\$@@""".r
        //使用提取器的方式，获取匹配到的字符串
        for (pattern(item) <- pattern.findAllIn("@@$$##--ab--##$$@@ zfewurehewui  @@$$##--cd--##$$@@  @@$$##--ef--##$$@@")) {
            println(s"item: ${item}")
        }
    }

}
