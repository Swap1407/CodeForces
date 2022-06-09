/*package contest;

import java.util.Arrays;
import java.util.Scanner;

public class PatchoulisMagicalTalisman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int o=0,e=0;
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				if(arr[i] %2 == 0) {
					e++;
				}
				else {
					o++;
				}
			}
			
			if(o==n) {
				System.out.println("0");
			}
			else if(e==n) {
				Arrays.sort(arr);
				int temp = 0,count = 0;
				for(int i=0;i<n;i++) {
					count=0;
					String s = Integer.toBinaryString(arr[i]);
					for(int j=s.length()-1;i>=0;i--) {
						if(s.charAt(j) == '1') {
							break;
						}
						count++;
					}
					arr[i] = count;
					temp = arr[i] / (int) Math.pow(2, count);
					
				}
				System.out.println(count+n-1);
			}
			else {
				System.out.println(e);
			}
			
		}
		sc.close();
	}

}
*/