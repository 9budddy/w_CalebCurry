package org.budddy;

public class Collections {

	public static void main(String[] args) {
		Item<Person> item = new Item<Person>();
		Person p = new Person("hello", "hello");
		item.setX(p);
		
		Person p2 = item.getX();
		System.out.println(p2.email);
	}
}
