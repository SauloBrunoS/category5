package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class triangle {
	
	public static ArrayList<Integer> line(int n) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
	   
		if(n==0) return l1;
		if(n == 1) {
			l1.add(1);
			return l1;
		}
		int firstelement = 1;
		for(int i = 1; i < n; i++) {
			firstelement += i;
		}
		
		for(int i = firstelement; i < firstelement+n; i++) {
			l1.add(i);
		}
		
		
		return l1;

	}	
	
	public static ArrayList <ArrayList<Integer>> triangle(int a) {
		ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>();
		
		if(a == 0) return l1;
		for (int i = 1; i <= a; i++) {
			l1.add(line(i));
		}

		return l1;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number:");
		int p = var.nextInt();
		ArrayList <ArrayList<Integer>> m = triangle(p);
		System.out.print("[");
		for(int i = 0; i < m.size(); i++) {
			System.out.print("[");
			for(int j = 0; j < m.get(i).size(); j++) {
				if(j + 1 < m.get(i).size())
			    	  System.out.print(m.get(i).get(j)+",");
			      else
			    	  System.out.print(m.get(i).get(j));
			}
			System.out.print("]");
			if(i+1 < m.size()) System.out.print(",");
		}
		System.out.print("]");
		var.close();
	}
}
