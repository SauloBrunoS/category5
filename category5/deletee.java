package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class deletee {
	public static ArrayList <Integer> deletee(int x, ArrayList<Integer> l) {
		
        for (int i = 0; i < l.size(); i++) {
			if(l.get(i) == x) {
			l.remove(l.get(i));
			break;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type a number:");
		int y = var.nextInt();
		System.out.println("Type the list's size:");
		int size = var.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Type an element of the list: ");
			list.add(var.nextInt());
		}
		
		ArrayList <Integer> m = deletee(y, list);
		System.out.print("[");
		for (int i = 0; i < m.size(); i++) {
		      if(i + 1 < m.size())
		    	  System.out.print(m.get(i)+",");
		      else
		    	  System.out.print(m.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
