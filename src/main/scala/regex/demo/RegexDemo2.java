package regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 端吉
 * Date:   2017/7/2.
 */
public class RegexDemo2 {

    public static void main(String[] args) {
        //此处使用非贪婪匹配，关于贪婪匹配可以看这篇文章
        //http://blog.csdn.net/lxcnn/article/details/4756030
        //我们把要提取的字符串用()括起来
        Pattern pattern = Pattern.compile("@@\\$\\$##--(.*?)--##\\$\\$@@");
        Matcher matcher = pattern.matcher("@@$$##--ab--##$$@@ zfewurehewui  @@$$##--cd--##$$@@  @@$$##--ef--##$$@@");
        while (matcher.find()) {
            System.out.println("匹配的完整字符串:" + matcher.group(0));
            System.out.println("内容：" + matcher.group(1));
        }
    }
}
