package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class intercal {

	public static ArrayList<Integer> intercal(ArrayList<Integer> l, ArrayList<Integer> l2) {

		ArrayList<Integer> l3 = new ArrayList<Integer>();
		int smaller;
		int bigger;
		if (l.size() > l2.size()) {
			smaller = l2.size();
			bigger = l.size();
		}
		else { 
			smaller = l.size();
			bigger = l2.size();
		}
		for (int i = 0; i < smaller; i++) {
			l3.add(l.get(i));
			l3.add(l2.get(i));
		}

		for (int i = smaller; i < bigger; i++) {
		    if(l.size() == bigger)
			l3.add(l.get(i));
		    else 
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
		ArrayList<Integer> intercal = intercal(list, list2);
		
		System.out.print("[");
		for (int i = 0; i < intercal.size(); i++) {
		      if(i + 1 < intercal.size())
		    	  System.out.print(intercal.get(i)+",");
		      else
		    	  System.out.print(intercal.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
