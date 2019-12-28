package com.company;

public class ray1 {
	
	public static void main(String[] args) {
		
		//声明
		int[] arr;
		//1.静态初始化：数组的初始化和数组元素的赋值是同时操作的
		arr = new int[] {23,21,65,34};
		System.err.println(arr.length);
		
		//声明
		int[] num;
		//动态初始化：数组的初始化和数组元素的赋值是分开的
		num = new int[4];
		num[0] = 100;
		num[1] = 111;
		num[2] = 200;
		num[3] = 222;
		
		for(int i = 0;i < num.length;i++) {
			System.err.println(num[i]);
		}
		
		//动态初始化2
		String[] names = new String[3];
		names[0] = "刘备";
		names[1] = "关羽";
		names[2] = "张飞";
		//遍历数组
		for(int i = 0;i < names.length;i++) {
			System.err.println(names[i]);
		}
	}
}
