package org.budddy;

import java.util.Scanner;

public class FirstRealProject {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give us a size.");
		int size = scan.nextInt();

		int[] grades = new int[size];

		System.out.println("Enter " + size + " numbers. Press enter after each.");
		for(int i = 0; i < size; i++) {
			grades[i] = scan.nextInt();
		}
		
		scan.close();
		
		for(int i = 0; i < size; i++) {
			System.out.println(grades[i]);
		}
	}
}
