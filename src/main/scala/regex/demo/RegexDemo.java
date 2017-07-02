package regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 端吉
 * Date:   2017/7/2.
 */
public class RegexDemo {

    public static void main(String[] args) {
        //正则表达式
        String pattern = "@@\\$\\$##--.*--##\\$\\$@@";
        boolean matches = "@@$$##--abcd--##$$@@".matches(pattern);
        //是否匹配
        System.out.println("@@##--abcd--##@@ 是否匹配:" + matches);
    }
}
