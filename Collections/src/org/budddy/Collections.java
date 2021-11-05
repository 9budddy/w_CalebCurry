package org.budddy;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		
		Admin a = new Admin();
		people.add(a);
	
		doSomething(a);
		ArrayList<Admin> admins = new ArrayList<>();
		
		ArrayList<Person> adminPerson = new ArrayList<>();
		for (Admin admin : admins) {
			adminPerson.add((Person)admin);
		}
		
		doSomething2(adminPerson);
	}
	
	 static void doSomething(Person p) {
		 System.out.println(p);
	 }
	 
	 static void doSomething2(ArrayList<Person> peeps) {
	 }
}
