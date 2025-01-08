package com.JavaBasics;

public class FirstHighestInArry {
public static void main(String[] args) {
	
	int[] arr = {32,2,65,34,56};{
		int high = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > high) {
				high = arr[i];
			}
		}
		System.out.println("Num :"+ high);		
	}
}
}
