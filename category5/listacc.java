package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class listacc {
	public static ArrayList <Integer> listacc(ArrayList<Integer> l) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i < l.size(); i++) {
			int sum = 0;
			for(int j = i; j >= 0; j--) {
				sum += l.get(j);
			}
			l1.add(sum);
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
		
		ArrayList <Integer> listacc = listacc(list);
		System.out.print("[");
		for (int i = 0; i < listacc.size(); i++) {
		      if(i + 1 < listacc.size())
		    	  System.out.print(listacc.get(i)+",");
		      else
		    	  System.out.print(listacc.get(i));
		}
		System.out.print("]");
		var.close();
	}
}
