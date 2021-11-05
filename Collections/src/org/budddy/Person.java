package org.budddy;

import java.util.Objects;

public class Person {
	String email;
	String lastName;
	Position position;
	
	Person(String email, String lastName) {
		this.email = email;
		this.lastName = lastName;
	}

	Person() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, lastName, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return (Objects.equals(lastName, other.lastName) &&
				Objects.equals(email, other.email) &&
				Objects.equals(position, other.position));
	}	
	
	
}
