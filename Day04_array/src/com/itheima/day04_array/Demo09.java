package com.itheima.day04_array;

/*
 *
 * 定义一个数组来存储10个学生的成绩{72,89,65,87,91,82,71,93,76,68}，计算并输出学生的平均成绩。
 *
 * */
public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        System.out.println("10个学生的成绩平均分是:" + isAge(arr));

    }

    //定义一个有参有返回值的方法，求平均分
    public static int isAge(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count / arr.length;
    }
}
