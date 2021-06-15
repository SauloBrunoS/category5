package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class concatena {

	public static ArrayList<Integer> concatena(ArrayList<Integer> l, ArrayList<Integer> l2) {

		ArrayList<Integer> l3 = new ArrayList<Integer>();

		for (int i = 0; i < l.size(); i++) {
			l3.add(l.get(i));
		}

		for (int i = 0; i < l2.size(); i++) {
		    l3.add(l2.get(i));
		}
		return l3;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Type the first list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		System.out.println("Type the second list's size:");
		int size2 = var.nextInt();
		for (int i = 0; i < size2; i++) {
			System.out.print("Type an element of the list: ");
			list2.add(var.nextInt());
		}
		ArrayList<Integer> concatenation = concatena(list, list2);
		
		System.out.print("[");
		for (int i = 0; i < concatenation.size(); i++) {
		      if(i + 1 < concatenation.size())
		    	  System.out.print(concatenation.get(i)+",");
		      else
		    	  System.out.print(concatenation.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
