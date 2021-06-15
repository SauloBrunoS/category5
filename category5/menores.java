package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class menores {
	
	public static int menor(ArrayList<Integer> l) {
		int min = l.get(0);
		int minindex = 0;
		for (int i = 1; i < l.size(); i++) {
			if (l.get(i) < min) {
				min = l.get(i);
			    minindex = i;
			}
		}
		return min;
	}
	
	public static int menorindex(ArrayList<Integer> l) {
		int min = l.get(0);
		int minindex = 0;
		for (int i = 1; i < l.size(); i++) {
			if (l.get(i) < min) {
				min = l.get(i);
			    minindex = i;
			}
		}
		return minindex;
	}
	
	public static ArrayList <Integer> menores(int x, ArrayList<Integer> l) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int counter = x;
			for(int j = 0; j < l.size(); j++) {
				ArrayList<Integer> l2 = new ArrayList<Integer>(l);
				if(counter == 0) break;
				while(l2.size() > l.size() - x) {
				if (l.get(j) == menor(l2)) {
					l1.add(l.get(j));
				    counter = counter - 1;
					break;
				}
				else {
					l2.remove(menorindex(l2));			
				}
				}
			}
		
		
		return l1;
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
		
		ArrayList <Integer> m = menores(y, list);
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
