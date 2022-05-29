package arry;
import java.util.Arrays;
import java.util.Scanner;

public class Circular_Local_MiniMax_1685A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int list[] = new int[n];
			
			for(int i=0;i<n;i++) {
				list[i] = sc.nextInt();
			}
			if(n%2 == 1) {
				System.out.println("NO");
			}
			else {
				Arrays.sort(list);
				int m = n/2,j=0,k=0;
				int ll1[] = new int[n];
				for(int i=0;i<n;i++) {
					if(i%2==0) {
						ll1[i] = list[j];
						j++;
					}
					else {
						ll1[i] = list[m+k];
						k++;
					}
				}
				int flag=0;
				for(int i=0;i<n-1;i++) {
					if(i%2==0 && ll1[i] < ll1[i+1]) {
						continue;
					}
					else if(i%2==1 && ll1[i] > ll1[i+1]) {
						continue;
					}
					else {
						System.out.println("NO");
						flag=1;
						break;
					}
				}
				if(flag == 0) {
					System.out.println("YES");
					for(int i=0;i<n;i++) {
						System.out.print(ll1[i]+" ");
					}
					System.out.println();
				}
				
			}
		}
		sc.close();
	}

}
