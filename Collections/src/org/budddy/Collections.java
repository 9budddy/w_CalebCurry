package org.budddy;

public class Collections {

	public static void main(String[] args) {
		Person p = new Person("email@email.com", "Jones");
		Position pos1 = new Position(10,10);
		p.position = pos1;
		Person q = new Person("email@email.com", "Jones");
		Position pos2 = new Position(10,10);
		q.position = pos2;
		
		System.out.println(p.equals(q));
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());

	}
}
