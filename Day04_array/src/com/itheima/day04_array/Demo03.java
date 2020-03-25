package com.itheima.day04_array;

/*
 * 利用数组的遍历求数组中的最大最小值
 *
 * */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 60, 99, 56, 8, 55, 34, 66, 45, 90, 39, 13};  //定义一个int类型的数组
        int max = arr[0]; //定义一个max变量用于存储最大值，初始化把arr[0]赋给max，可以防止数组以外的数据进行比较

        for (int i = 1; i < arr.length; i++) {  //数组的循环遍历,其中i=1是因为，arr[0]已经赋值给了max，如果i=0，
            //max会跟arr[0]比较，本身与本身比较没有意义，所以从i=1开始遍历。
            if (arr[i] > max) { //如果arr[i] > max时执行if语句
                max = arr[i];   //进入语句体，把arr[i]大的数重新赋值给max;
            }
        }
        System.out.println(max); //当循环结束输出最大值





    }
}
