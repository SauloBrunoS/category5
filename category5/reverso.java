package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class reverso {
	public static ArrayList <Integer> reverso(ArrayList<Integer> l) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = l.size() - 1; i >= 0; i--) {
			l1.add(l.get(i));
		}
		return l1;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		
		ArrayList <Integer> rever = reverso(list);
		System.out.print("[");
		for (int i = 0; i < rever.size(); i++) {
		      if(i + 1 < rever.size())
		    	  System.out.print(rever.get(i)+",");
		      else
		    	  System.out.print(rever.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
