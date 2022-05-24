package string;

import java.util.Scanner;

public class Word_Capitalization_281A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = s.substring(0,1);
		s1 = s1.toUpperCase();
		String s2 = s.substring(1);
		System.out.println(s1+s2);
		sc.close();
	}

}
