package com.itheima.day04_array;
import java.util.Scanner;
/*
*
* 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
* 再通过键盘录入一个整数数字。
* 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
* */
public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数元素");
        int num = sc.nextInt();
        printArray(arr);
        orderArray(arr,num);
        printArray(arr);
    }


    //定义一个有参无返回值的方法，实现顺序输出数组元素功能
    public static void orderArray(int[] arr,int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= num) {
                arr[i] = num;
                break;
            }
            if(num < arr[0]) {
                arr[0]  = num;
                break;
            }

            if(arr[arr.length - 1] <= num) {
                arr[arr.length - 1] = num;
                break;
            }
        }

    }


    //定义一个打印数组的有参无返回值的方法
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
