//package arry;

import java.util.Scanner;

public class Vanya_and_Fence_677A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int arr[] = new int[n];
		int c = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>h) {
				c++;
			}
		}
		System.out.println((n-c)+2*c);
		sc.close();
	}

}
