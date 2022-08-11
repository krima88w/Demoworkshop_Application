package Java_interview;

public class Reverse_String12 
{
	public static void main(String[] args) {
		String a= "Welcome to Automation";
		String b= "";
		char ca;
		

		for (int i = 0; i < a.length(); i++) {
			ca = a.charAt(i);
			b = ca+b;
		}
		System.out.println(b);
	}
}








