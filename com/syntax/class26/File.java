package com.syntax.class26;

public abstract class File {
	
	abstract void open();
	void edit () {
		System.out.println("Editing file");
	}
	void close () {
		System.out.println("Closing file");
	}
}

class JavaFile extends File{
	public void open() {
		System.out.println("You need Java Development Kit (JDK) installed to open .java file");
	}
}

class WordFile extends File{
	public void open() {
		System.out.println("You need MS Word installed to open .doc file");
	}
}

class PdfFile extends File{
	public void open() {
		System.out.println("You need Acrobat Reader installed to open .pdf file");
	}
}
