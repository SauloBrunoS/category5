package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class unico {
	public static boolean unico(int x, ArrayList<Integer> l) {
	     int counter = 0;
	     for (int i = 0; i < l.size(); i++) {
	    	 if(l.get(i) == x) counter++;
	     }
	     if(counter == 1) return true;
	     return false;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type the element:");
		int n = var.nextInt();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		boolean unique = unico(n, list);
		
		System.out.println(unique);
		var.close();
	}
}
