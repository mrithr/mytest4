package com.itheima.day04_array;
/*
 *数组的遍历（重中之重）
 *
 */

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  //定义一个int类型的数组
        for (int i = 0; i < arr.length; i++) {
            //数组索引从0开始，所以i=0，索引最大值 = 数组长度-1，所以i<=arr.length-1,简化：i < arr.length
            //arr.length:获取arr数组的长度
            System.out.println("输出arr数组第" + i + "个" + "元素：" + arr[i]);

        }
    }
}
