package com.homework.five;

import java.util.Arrays;
import java.util.Random;

public class questionFive {

	/*
	 * Rastgele sayılardan oluşan 100 elemanlık tamsayı dizisi oluşturun. 
	 * Ardından tek ve çift sayıları bulan bir program yazın.
	 */
	public static void main(String[] args) {
		int [] array = creatArray();
		printArray(array);	
		
		System.out.println("Çift Sayılar : ");
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("Tek Sayılar : ");
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}		
	}
	public static int[] creatArray() {
		Random random = new Random();
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(50)+1;
		}
		return arr;
	}	
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
