package com.syntax.class26;

public class FileTest {
	
	public static void main(String[] args) {
		
		JavaFile a = new JavaFile();
		a.open();
		a.edit();
		a.close();
		System.out.println("---------------------");
		WordFile b = new WordFile();
		b.open();
		b.edit();
		b.close();
		System.out.println("---------------------");
		PdfFile c = new PdfFile();
		c.open();
		c.edit();
		c.close();
		System.out.println("---------------------");
		
		File[] files = {new JavaFile(), new WordFile(), new PdfFile()};
		
		for (File file:files) {
			file.open();
		}
	}
}
