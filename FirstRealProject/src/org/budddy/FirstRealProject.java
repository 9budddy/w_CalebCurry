package org.budddy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FirstRealProject {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}
}
