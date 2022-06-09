package contest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDecrements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				b[i] = sc.nextInt();
			}
			
			if(dec(a,b,n)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}

	public static boolean dec(int[] a, int[] b, int n) {
		int temp = 0; 
		int[] sub1 = new int[n];
		int[] sub2 = new int[n];
		for(int i=0;i<n;i++) {
			sub1[i] = a[i]-b[i];
			sub2[i] = sub1[i];
			if(sub1[i]<0) {
				return false;
			}
		}
		Arrays.sort(sub2);
		temp = sub2[n-1];
		for(int i=0;i<n;i++) {
			if((a[i]-temp) < b[i] && b[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
