package Java_interview;

import java.util.HashMap;

public class Count_the_num_of_each_Chart {
	public static void main(String[] args) {
		String string = "manjunath";
		HashMap<Character,Integer> charcount = new HashMap<Character, Integer>();
		for (int i = 0; i <=string.length()-1; i++) {
			if (charcount.containsKey(string.charAt(i))) {
				Integer count = charcount.get(string.charAt(i));
				//System.out.println(count);
				charcount.put(string.charAt(i),++ count);
			} else {
				charcount.put(string.charAt(i),1);
			}
		}
		System.out.println(charcount);
	}
}

