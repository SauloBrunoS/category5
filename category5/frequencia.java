package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class frequencia {
	public static int frequencia(int x, ArrayList<Integer> l) {

     int counter = 0;
     
     for (int i = 0; i < l.size(); i++) {
    	 if(l.get(i) == x) counter++;
     }
		
     return counter;
		
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
		int frequency = frequencia(n, list);
		
		System.out.println(frequency);
		var.close();
	}

}
