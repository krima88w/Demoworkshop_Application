package Java_interview;

import java.util.Iterator;

public class Stringcount1 
{
	public static void main(String[] args) {

		String a = "manjunath";
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			char chaa = a.charAt(i);
			 count ++;
		}


		
		System.out.println(count);

	}


}
