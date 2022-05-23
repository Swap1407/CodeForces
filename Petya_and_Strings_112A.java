package string;

import java.util.Arrays;
import java.util.Scanner;

public class Petya_and_Strings_112A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[2];
		for(int i=0;i<2;i++) {
			arr[i] = sc.nextLine();
		}
		
		String[] rarr = new String[2];
		rarr[0] = arr[0].toLowerCase();
		rarr[1] = arr[1].toLowerCase();
		Arrays.sort(rarr);
		
		if(arr[0].equalsIgnoreCase(arr[1])) {
			System.out.println("0");
		}
		else if(rarr[0].equalsIgnoreCase(arr[0])) {
			System.out.println("-1");
		}
		else {
			System.out.println("1");
		}
		sc.close();
	}

}
