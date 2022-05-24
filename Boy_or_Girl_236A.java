package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boy_or_Girl_236A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		String s = sc.next();
		int n = s.length();
		for(int i=0;i<n;i++) {
			if(list.contains(s.charAt(i)) == false ) {
				list.add(s.charAt(i));
			}
		}
		n = list.size();
		if(n%2 == 0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
		sc.close();
	}

}
