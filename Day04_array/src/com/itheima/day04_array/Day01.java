package com.itheima.day04_array;
/*
* 数组常见的问题：
*               1、数组索引越界问题。
*               2、空指针异常问题
* */
public class Day01 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //System.out.println(arr[2]);

        int[] arr2 = new int[5];
        System.out.println(arr2[3]);
        arr2 = null;
        System.out.println(arr2.length);

    }
}
