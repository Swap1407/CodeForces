package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Digit_Minimization_1684A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		while(t-->0) {
			List<Integer> list = new ArrayList<>();
			int n = sc.nextInt();
			while(n!=0) {
				list.add(n%10);
				n = n/10;
			}
			//Collections.sort(list);
			int s = list.size();
			if(s==1) {
				System.out.println(n);
			}
			else if(s==2) {
				System.out.println(list.get(0));
			}
			else {
				Collections.sort(list);
				System.out.println(list.get(0));
			}
		}
		
		
		
		sc.close();
	}

}
