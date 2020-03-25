package com.itheima.day04_array;

/*
 *
 * 小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是
 * 10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
 * 请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？
 *
 * */
public class Demo11 {
    public static void main(String[] args) {
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int num = isPanDuan(arr);
        int num2 = arr.length - num;
        System.out.println("赚钱的股票有:" + num + "只," + "赔钱的股票有:" + num2 + "只");
    }


    //定义一个有参有返回值的方法
    public static int isPanDuan(double[] arr) {
        int num = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                num++;
            }
        }

        return num;
    }
}
