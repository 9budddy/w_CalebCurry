package org.budddy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FirstRealProject {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
