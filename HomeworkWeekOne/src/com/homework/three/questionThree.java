package com.homework.three;

import java.util.Arrays;
import java.util.Random;

public class questionThree {

	/*
	 * Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak programı geliştirin. 
	 * Programı yazarken aşağıdaki özelliklere uygun yazınız.

		- Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. Sabit elemanlı bir dizi vermeyin!
		- Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
		- Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return) etsin.
	 */
	public static void main(String[] args) {
		int [] array1 = creatArray();
		printArray(array1);
		System.out.println(ortalama(array1));
	}
	public static int[] creatArray() {
		Random random = new Random();
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(20);
		}
		return arr;
	}
	public static double ortalama(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double ortalama = sum/arr.length;
		return ortalama;
	}
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
