package com.homework.four;

public class questionFour {

	/*
	 * Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	*****
	 * 	******
	 * 	*******
	 * 	********
	 * 	*********
	 * 	**********
	 */
	public static void main(String[] args) {
		yazdir();
	}
	public static void yazdir() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
