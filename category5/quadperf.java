package category5;

import java.util.Scanner;

public class quadperf {
	public static boolean quadperf(int n) {
	
		int i = 0;
		while(i*i <=n) {
		if(i * i == n) return true;
		i++;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		boolean result = quadperf(n);
		System.out.println(result);
		var.close();
	}
}
