package org.budddy;

import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		Exceptions exceptions = new Exceptions();
		exceptions.doSomething();
		
	}
	
	void doSomething() {
		try {
			throw new IOException();
		} catch (IOException | IndexOutOfBoundsException e) {
			System.out.println("more specific");
		}
		catch (Exception e) {
			System.out.println("Caught ya!");
			e.printStackTrace();
		}
		
	}
}
