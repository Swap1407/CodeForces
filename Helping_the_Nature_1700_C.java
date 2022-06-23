import java.util.Scanner;

public class Helping_the_Nature_1700_C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long arr[] = new long[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextLong();
			}
		
			int diff[] = new int[n-1];
			long sum = 0;
			for(int i=0;i<n-1;i++) {
				diff[i] = (int) Math.abs(arr[i+1]-arr[i]);
				sum += diff[i];
				if(arr[i]>arr[i+1]) {
					arr[0] += (arr[i+1]-arr[i]);
				}
			}
			sum += Math.abs(arr[0]);
			System.out.println(sum);
		}
		
		sc.close();
	}

}
