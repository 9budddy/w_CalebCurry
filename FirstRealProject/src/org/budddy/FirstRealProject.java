package org.budddy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstRealProject {

	List<String> stuff;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("Resources/Students.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while (scan.hasNextLine()) {
			students.add(scan.nextLine());
		}
		
		students.forEach(student -> {
			System.out.println("Name: " + student);
		});
		
		scan.close();
		
		FirstRealProject p = new FirstRealProject();
		p.stuff = new ArrayList<String>();
	}
}
