package com.syntax.class26;

public abstract class Phone {
	
	void makeCall() {//defined/implemented method
		System.out.println("Phone makes call");
	}
	public void sendText() {//defined/implemented method
		System.out.println("Phone sends text");
	}
	
	public abstract void navigate();//undefined/un-implemented method
	
	public abstract void playMusic();//undefined/un-implemented method
	
	public abstract void takePicture();
}
class Samsung extends Phone {

	@Override
	public void navigate() {
		System.out.println("Samsung navigates...");
	}
	@Override
	public void playMusic() {
		System.out.println("Samsung plays music from google store");
	}
	public void takePicture() {
		System.out.println("Phone takes pictures");
	}
}

class IPhone extends Phone {

	@Override
	public void navigate() {
		System.out.println("iPhone navigates...");
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone plays music from google store");
	}
	public void takePicture() {
		System.out.println("Phone takes pictures");
	}
}
