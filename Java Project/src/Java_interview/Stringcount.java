package Java_interview;

import java.util.Iterator;

public class Stringcount 
{
	public static void main(String[] args) {

		String s  = "Welcome to AUtoMation" ;
		int count=0;
		int count1 =0;
		String uppr="";
		String lppr="";
		for (int i = 0; i < s.length(); i++) 
		{
			char arr = s.charAt(i);
			if (arr>=65 && arr<=90) 
			{
				uppr=uppr+arr;
				count++;

			} else {

				lppr=lppr+arr;
				//	System.out.println(count);
				count1++;

			}	

		}
		System.out.println(uppr);
		System.out.println(lppr);
		System.out.println(count1);
		System.out.println(count);
	}


}
