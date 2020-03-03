package com.homework.one;

import java.util.Scanner;

public class questionOne {

	/*
	 * String tipinde sabit bir şifre değişkeni oluşturun. Örneğin: String password
	 * = "12345"; gibi. Ardından, kullanıcıdan klavyeden bir şifre girmesini
	 * isteyin. Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın. Eğer, iki
	 * değer birbirine eşitse ekrana "Giriş Başarılı!", değilse "Giriş Başarısız"
	 * yazdırın.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please Enter The 8-digit Password : ");
			String inpassword = scanner.nextLine();
			boolean result2 = checkDigitPassword(inpassword);
			if (result2 == true) {				
				boolean result = checkPassword(inpassword);
				if (result == true) {
					System.out.println("Login successful!");
					break;
				} else {
					System.out.println("Login Failed");
				}
			}else if(checkDigitPassword(inpassword) == false) {
				System.out.println("Please Enter 8 Digits : ");
			}
		}
	}	

	public static boolean checkPassword(String pass) {
		boolean result = false;
		String password = "18811938";
		if (pass.equals(password)) {
			result = true;
		}
		return result;
	}
	
	public static boolean checkDigitPassword(String pass) {
		boolean result = false;
		int[] arr = new int[pass.length()];
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 8) {
				result = true;
			}
		}
		return result;
	}
}
