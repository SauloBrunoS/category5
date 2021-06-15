package category5;

import java.util.Scanner;

public class fibonacci {
	public static int fibonacci(int n) {
		if (n == 0) return 0;
		if(n==1) return 1;
		return fibonacci(n - 1) + fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		int result = fibonacci(n);
		System.out.println(result);
		var.close();
	}
}
