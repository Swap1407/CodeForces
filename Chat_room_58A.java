//package string;

import java.util.Scanner;

public class Chat_room_58A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		String word = "hello";
	   
	    int count = 0, point = 0;
	    for (int i = 0; i < word.length(); i++){
	        for (int j = point; j < s.length(); j++){
	            if ( word.charAt(i) == s.charAt(j) ){
	                count++;
	                point = j + 1;
	                break;
	            }
	        }
	    }
	    if (count == 5){
	        System.out.println("YES");
	    }
	    else{
	    	System.out.println("NO");
	    }
		sc.close();
	}

}
