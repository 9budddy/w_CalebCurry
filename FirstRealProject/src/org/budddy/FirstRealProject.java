package org.budddy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class FirstRealProject {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		names.add(2, "Susan");
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
