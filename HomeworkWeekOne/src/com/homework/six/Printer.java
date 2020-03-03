package com.homework.six;

public class Printer {

	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println(pdf.getBody());
	}
	public static void printWordDocument(WordDocument word) {
		System.out.println(word.getBody());
	}
}
