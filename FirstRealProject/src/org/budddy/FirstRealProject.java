package org.budddy;

import java.util.Scanner;

public class FirstRealProject {

	public static void main(String[] args) {
		System.out.println("This is My First Real Project!");
		
		Scanner scan = new Scanner(System.in);
		//String s = scan.nextLine();
		

		int i = 0;
		do {
			System.out.println("i is: " + i);
			i++;
		} while(i < 10);

		
		scan.close();
	}
}
