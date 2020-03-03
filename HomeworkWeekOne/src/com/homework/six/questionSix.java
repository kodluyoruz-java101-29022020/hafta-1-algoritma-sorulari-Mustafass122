package com.homework.six;

public class questionSix {

	/*
	 * PDFDocument isminde bir sınıf yaratın. 
	 * Ardından, WordDocument isminde bir sınıf tasarlayın. 
	 * Bu iki sınıf içinde String body = ""; isminde bir tane nesne değişkeni tanımlayın. 
	 * Tanımlanan bu "body" isimli değişkeninin tutacağı veriyi kurucu metot vasıtasıyla gönderin. 
	 * Sınıfın içinde "body" değişkenine ait değeri dışarıya döndürecek "getBody" isimli bir metot yazın.
	 * Yukarıdaki işlemlerin ardından Printer isminde bir sınıf tanımlayın. 
	 * "printPDFDocument" isminde PDF dokümanına ait "body" bilgisini konsol ekrana yazdıran bir metot tanımlayın. 
	 * Aynı şekilde "printWordDocument" isminde Word dokümanını konsol ekrana yazdıran bir metot tanımlayın. 
	 * Bu metotları "static" tanımlamanız gerekmektedir.
	 * Ardından main fonksiyonu içinde PDFDocument ve WordDocument nesneleri oluşturun. 
	 * Bu nesnelere ait body bilgisini ekrana yazdırmak için "Printer" sınıfının metotlarını kullanın.
	 * Not: Print sınıfı içinde niçin statik metot kullandığımızı kısaca açıklayın.
	 */
	public static void main(String[] args) {
		
		PDFDocument pdf = new PDFDocument("MyPdf");
		WordDocument word = new WordDocument("MyWord");
		Printer.printPDFDocument(pdf);
		Printer.printWordDocument(word);
		
		//NEDEN PRINTER SINIFI METHODLARI STATIC TANIMLANDI??
		
		/* Oluşturduğumuz Printer sınıfı bize iki method ile çıktı vermektedir.
		 * Bu methodlar yine yaratmış olduğumuz PDFDocument ve WordDocument tiplerinde veriler almaktadır.
		 * Biz bu iki tipteki veriden (PDFDocument ve WordDocument) nesler oluşturduk.
		 * Printer sınıfından ise nesne oluşturmamıza gerek olmadan sadece Printer sınıfının methodlarını kullanmak istiyoruz.
		 * Printer sınıfındaki methodları objeye özgü değilde sınıfa özgü tanımlamamız gerekiyor.
		 * Yani methodlar Printer sınıfından obje oluşturulmadan kullanılması gerekiyr.
		 * Bu sebeple Printer sınıfındaki methodları static olarak tanımladık.
		 */
		
	}
}
