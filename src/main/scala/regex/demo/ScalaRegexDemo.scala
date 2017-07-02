package regex.demo

/**
  * Author: 端吉
  * Date:   2017/7/2.
  */
object ScalaRegexDemo {

    def main(args: Array[String]) = {
        //构造一个正则表达式
        //因为含有反斜杠，所以使用原始字符串
        var pattern="""@@\$\$##--.*--##\$\$@@"""
        var matches= "@@$$##--abcd--##$$@@".matches(pattern)
        println(s"matches:$matches")
    }
}
