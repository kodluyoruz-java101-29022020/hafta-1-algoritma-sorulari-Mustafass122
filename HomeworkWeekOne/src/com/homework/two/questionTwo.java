package com.homework.two;

import java.util.Scanner;

public class questionTwo {

	/*
	 * Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor. 
	 * Program aşağıdaki özellikleri sağlamalıdır.

		- Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
		- Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama, 2-Çıkarma vb...
		- Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin. Bu girilen iki sayıyı değişkenlerde saklayın.
		- Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		while(true) {
			action();		
			System.out.print("Lütfen İşlemi Seçiniz : ");
			int islem = scanner.nextInt();
			if (islem != 0) {			
				System.out.print("Birinci Sayıyı Giriniz : ");
				int sayibir = scanner.nextInt();
				System.out.print("İkinci Sayıyı Giriniz : ");
				int sayiiki = scanner.nextInt();		
				switch (islem) {				
				case 1:
					System.out.println("İki Sayının Toplamı : " + toplama(sayibir, sayiiki));
					System.out.println(" ");
					break;
				case 2:
					System.out.println("İki Sayının Farkı : " + cikarma(sayibir, sayiiki));
					System.out.println(" ");
					break;
				case 3:
					System.out.println("İki Sayının Çarpımı : " + carpma(sayibir, sayiiki));
					System.out.println(" ");
					break;
				case 4:
					System.out.println("İki Sayının Bölümü : " + bölme(sayibir, sayiiki));
					System.out.println(" ");
					break;		
				default:
					System.out.println("Hatalı Bir Tuşa Bastınız. Lütfen Tekrar Deneyiniz : ");
					System.out.println(" ");
					break;
				}
			}
			if (islem == 0) {
				System.out.println("Çıkılıyor..");
				break;
			}
		}	
	}
	public static void action() {
		System.out.println("Çıkış için    0 a Basınız");
		System.out.println("Toplama için  1 e Basınız");
		System.out.println("Çıkartma için 2 a Basınız");
		System.out.println("Çarpma için   3 a Basınız");
		System.out.println("Bölme için    4 a Basınız");
		System.out.println(" ");
	}
	public static int toplama(int a, int b) {
		return a+b;
	}
	public static int cikarma(int a, int b) {
		return a-b;
	}
	public static int carpma(int a, int b) {
		return a*b;
	}
	public static int bölme(int a, int b) {
		return a/b;
	}
}
