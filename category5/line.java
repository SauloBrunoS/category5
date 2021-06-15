package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class line {
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

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type a integer:");
		int y = var.nextInt();
		ArrayList<Integer> l1 = line(y);
		
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
