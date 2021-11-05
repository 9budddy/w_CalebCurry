package org.budddy;

import java.util.HashMap;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		HashSet<Person> people = new HashSet<Person>();

		
		Person p = new Person("email@email.com", "Jones");
		Position pos1 = new Position(10,10);
		p.position = pos1;
		Person q = new Person("email@email.com", "Jones");
		Position pos2 = new Position(10,10);
		q.position = pos2;
		
		people.add(p);
		people.add(q);
		
		System.out.println(people.contains(p));
		
		HashMap<String, Person> peeps = new HashMap<String, Person>();
		peeps.put("email@email.com", p);
		System.out.println("HashMap: " + peeps.containsKey("email@email.com"));
	}
}
