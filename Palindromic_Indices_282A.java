package string;

import java.util.Scanner;

public class Palindromic_Indices_282A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int t = sc.nextInt();
		int count=0;
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			count=0;
			for(int i=0;i<n;i++) {
				String temp = s.substring(0, i) + s.substring(i+1, n);
				if(palindrome(temp)) {
					count++;
				}
			}
			System.out.println(count);
		}*/
		
		int t = sc.nextInt();
		while(t-->0) {
			int count=0;
			int n = sc.nextInt();
			String s = sc.next();
			int temp = (n-1)/2;
			for(int i=temp;i>=0;--i) {
				if(s.charAt(i) == s.charAt(temp)) {
					++count;
				}
				else {
					break;
				}
			}
			System.out.println(2*count - (n&1));
		}
		sc.close();
	}

	 /*public static boolean palindrome(String temp) {
		int i = 0, j = temp.length()-1;
		while(i<j) {
			if(temp.charAt(i) != temp.charAt(j) ) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}*/

}
