package category5;

import java.util.Scanner;

public class rotEsq {
	static String rotE(int d, String str)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number:");
		int y = var.nextInt();
		var.nextLine();
		System.out.println("Type a string:");
		String str = var.nextLine();
		String m = rotE(y, str);
		System.out.println(m);
		
		var.close();
	}
}
