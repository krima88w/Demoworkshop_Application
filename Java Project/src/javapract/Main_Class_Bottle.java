package javapract;

public class Main_Class_Bottle {

	public static void main(String[] args) 
	{
	Bottle b = new Bottle("RED",1.0,150.0);
	Bottle b1 = new Bottle("yellow",1.2,149.0);
	
	System.out.println(b.getClass());
	System.out.println(b.toString());
	System.out.println(b1.equals(b));
	System.out.println(b1.hashCode());
	
	
	}

}
