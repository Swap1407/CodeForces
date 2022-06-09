package contest;

import java.util.Scanner;

public class RestoringtheDurationofTasks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] ta = new int[n];
			int[] tc = new int[n];
			for(int i=0;i<n;i++) {
				ta[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				tc[i] = sc.nextInt();
			}
			int[] time = new int[n];
			time[0] = tc[0] - ta[0];
			System.out.print(time[0]+" ");
 			for(int i=1;i<n;i++) {
				if(tc[i-1]<=ta[i]) {
					time[i] = tc[i]-ta[i];
				}
				else{
					time[i] = tc[i] - tc[i-1];
				}
				System.out.print(time[i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
