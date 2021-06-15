package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class sequencia {
public static ArrayList<Integer> sequencia(int a, int b) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
       
		for(int i = b; i < a +b; i++) {
			l1.add(i);
		}
		
		return l1;

	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type a integer:");
		int y = var.nextInt();
		System.out.println("Type another integer:");
		int v = var.nextInt();
		
		ArrayList<Integer> l1 = sequencia(y, v);
		
		System.out.print("[");
		for (int i = 0; i < l1.size(); i++) {
		      if(i + 1 < l1.size())
		    	  System.out.print(l1.get(i)+",");
		      else
		    	  System.out.print(l1.get(i));
		}
		System.out.print("]");
		
		var.close();
	}
}
