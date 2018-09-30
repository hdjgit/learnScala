package array.common.traverse;

/**
 * Author: 端吉
 * Date:   2018/9/8.
 */
public class JavaTraverseArray {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.println("index:" + i + ",value:" + a[i]);
        }

        System.out.println("-----------------");

        //遍历隔着2
        for (int i = 0; i < a.length; i += 2) {
            System.out.println("index:" + i + ",value:" + a[i]);
        }

        System.out.println("-----------------");

        //倒着遍历
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("index:" + i + ",value:" + a[i]);
        }

        System.out.println("-----------------");

        //不关心index
        for (int value : a) {
            System.out.println("value:" + value);
        }
    }
}
