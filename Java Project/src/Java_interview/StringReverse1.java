package Java_interview;

import java.util.Iterator;

public class StringReverse1 {
	public static void main(String[] args) {
		String str = "manjunath";
		int len = str.length();
		String rev = "" ;

		for (int i = len-1; i >= 0; i--) {

			rev = rev+str.charAt(i);



		}

		System.out.println(rev);


	}
}

