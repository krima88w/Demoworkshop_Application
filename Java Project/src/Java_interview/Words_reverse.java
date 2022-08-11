package Java_interview;

public class Words_reverse {
	public static void main(String[] args) {

		String string = "Java Programming Language";
		String reverse_string = "";
		String words[]= string.split("\\s");

		for (int i = 0; i < words.length; i++) {

			String words1 = words[i];
			System.out.println(words1);
			//-----------//
			String word_reverse="";

			for (int j= words1.length()-1; j >=0; j--) {
				word_reverse = word_reverse + words1.charAt(j);
			}
			reverse_string = reverse_string+" "+ word_reverse;
		}
		System.out.println(reverse_string);
	}
}



