package array.common.variable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: 端吉
 * Date:   2018/9/8.
 */
public class JavaArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list.addAll(list2);
        //java一次要添加1，2，3，4，5就麻烦很多了
        // 当然使用guava的Lists.newArrayList看起来代码会简单些
        // 或者使用下面的Arrays.asList也会简单些，最主要的原因是直接构造一个含有多个数字的list原生的java支持的不好

        System.out.println(list); //[1, 1, 2, 3, 4, 5]

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list); //[1, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        //java没有提供原生的，移除最后5个元素的函数

        list.add(1,6); //List一次只能添加一个元素
        System.out.println(list); //[1, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        list.remove(1);
        System.out.println(list); //[1, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        //list也不支持，移除第index上的连续n个数字

        Object[] array = list.toArray();//转数组
        Arrays.asList(array); //转list
    }
}
