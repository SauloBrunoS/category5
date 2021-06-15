package category5;

import java.util.ArrayList;
import java.util.Scanner;

public class alter {
public static ArrayList<Integer> alter(int n) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
       
		for(int i = 1; i <= n; i++) {
			int temp = i;
			l1.add(temp);
			l1.add(-temp);
		}
		
		return l1;

	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type a integer:");
		int y = var.nextInt();
		ArrayList<Integer> l1 = alter(y);
		
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
