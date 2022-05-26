package contest;

import java.util.Scanner;

public class Everything_Everywhere_All_But_One {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			int m = 0;
			//Arrays.sort(arr);
			if(sum%n == 0) {
				m = sum/n;
				if(contains(arr,m)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}

	static boolean contains(int[] arr, int m) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == m) {
				return true;
			}
		}
		return false;
	}

}
