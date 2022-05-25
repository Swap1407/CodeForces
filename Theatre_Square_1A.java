//package matrix;

import java.util.Scanner;

public class Theatre_Square_1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long a = sc.nextInt();
		
		//double ans = Math.ceil(n/a) * Math.ceil(m/a);
		long ans = ((m+a-1)/a)*((n+a-1)/a);
		System.out.println(ans);
		sc.close();
	}

}
