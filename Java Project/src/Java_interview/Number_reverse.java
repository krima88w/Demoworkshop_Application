package Java_interview;

import java.util.Iterator;

public class Number_reverse {
	public static void main(String[] args) {
		int number = 123456 ;
		//int num = number.nextInt();
		int rev= 0;

		while (number!=0) {
			
			rev = rev*10 + number%10;
			number=number/10;
			
		}

		System.out.println(rev);


	}
}

