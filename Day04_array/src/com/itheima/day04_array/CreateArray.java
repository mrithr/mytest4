package com.itheima.day04_array;

public class CreateArray {
    public static void main(String[] args) {
        int[] arr = new int[10]; //创建一个int类型的数组arr,并且给数组指定长度为3
        System.out.println(arr); //[I@1e643faf 地址

        int[] arr1 = new int[10];
        double[] arr2 = new double[8];  //创建一个double类型的数组arr2,并且给数组指定长度为10
        char[] arr3 = new char[6];  //创建一个char类型的数组arr3,并且给数组指定长度为6
        boolean[] arr4 = new boolean[4];  //创建一个boolean类型的数组arr4,并且给数组指定长度为4

        arr2[5] = 100;
        System.out.println(arr1[4]);  // byte,short,char,int(整数)类型的数组默认值为0
        System.out.println(arr2[5]);  // float,double(浮点数)类型的数组默认值为0.0
        System.out.println(arr3[3]);  // char
        System.out.println(arr4[2]);  //boolean类型的数组默认值为false
    }
}
