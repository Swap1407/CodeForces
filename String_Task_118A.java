//package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_Task_118A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		ArrayList<Character> vow = new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u','Y','y')) ;
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			char c = s.charAt(i);
			if(vow.contains(c)) {
				continue;
			}
			else {
				c = Character.toLowerCase(c);
				list.add('.');
				list.add(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Character ans : list){
		    sb.append(ans);
		}

		System.out.println(sb.toString());
		sc.close();
	}

}
