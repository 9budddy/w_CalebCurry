package org.budddy;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair<>();
		pair.setX(26);
		pair.setY("Favorite number");
		
		Pair<Integer, String> pair2 = new Pair<>();
		pair2.setX(10);
		pair2.setY("number of pears");
		
		ArrayList<Pair<Integer,String>> pears = new ArrayList<>();
		pears.add(pair);
		pears.add(pair2);
	}
}
