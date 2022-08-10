package javapract;

public class Object2 
{

	public static void main(String[] args) 
	{

		Mobile m = new Mobile("samsung", "red", 22000.00);
		Mobile m2 = new Mobile("Noikia","yello",14000.00 );
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m.hashcode());
		System.out.println(m2.hashcode());
		System.out.println(m.equals(m2));
		System.out.println(m2.equals(m2));
		
		
		


	}
}


