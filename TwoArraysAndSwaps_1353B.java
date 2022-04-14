import java.util.*;

public class TwoArraysAndSwaps_1353B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> a = new ArrayList<Integer> (n);
			List<Integer> b = new ArrayList<Integer> (n);
			for(int i=0;i<n;i++) {
				a.add(sc.nextInt());
			}
			for(int i=0;i<n;i++) {
				b.add(sc.nextInt());
			}
			Collections.sort(a);
			Collections.sort(b, Collections.reverseOrder()); 
			int sum=0;
			for(int i=0;i<k;i++) {
				for(int j=k-1;j>=0;j--) {
					if(a.get(i) < b.get(j)) {
						int temp = a.get(i);
						a.set(i, b.get(j));
						b.set(j, temp);
					}
				}
			}
			for(int i=0;i<n;i++) {
				sum = sum + a.get(i);
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
