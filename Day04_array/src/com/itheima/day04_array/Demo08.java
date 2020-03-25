package com.itheima.day04_array;
import java.util.Random;
/*
*
*
* 有一个整数数组。请编写代码，让数组的最后一个元素代表个位，
* 倒数第二个元素代表十位，以此类推。最终得到一个大的整数。
*
* */
public class Demo08 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        printArray(arr);
        System.out.println("最大的整数是:" + maxNumber(arr));

    }

    //定义一个有参无返回值的方法，打印输出数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

    //定义一个方法实现最大的整数
    public static int maxNumber(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            max = max * 10 + arr[i];
        }

        return max;
    }

}
