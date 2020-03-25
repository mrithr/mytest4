package com.itheima.day04_array;
import java.util.Random;
/*
*
*
* 创建一个长度为6的整数数组。请编写代码，
* 随机生成六个0-100之间的整数存放到数组中，然后再计算出数组中元素的和并打印。
*
* */
public class Demo07 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }

        printArray(arr);



    }

    //定义一个有参数无返回值的方法printArray
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
}
