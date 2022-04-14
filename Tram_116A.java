import java.util.Arrays;
import java.util.Scanner;

public class Tram_116A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int entry[] = new int[n];
		int exit[] = new int[n];
		for(int i=0;i<n;i++) {
			exit[i] = sc.nextInt();
			entry[i] = sc.nextInt();
		}
		int cap[] = new int[n];
		cap[0] = entry[0];
		for(int i=1;i<n;i++) {
			cap[i] = entry[i-1]+(entry[i]-exit[i]);
			entry[i] = cap[i];
		}
		Arrays.sort(cap);
		System.out.println(cap[n-1]);
		sc.close();
	}
}
