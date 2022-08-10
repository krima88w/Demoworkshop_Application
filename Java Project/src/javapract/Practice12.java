package javapract;

public class Practice12 
{

	int a;
	String b;
	
	public Practice12(int a, String b) 
	{
	
		this.a = a;
		this.b = b;
	}
	
	public String toString() 
	{
		return b;
	
		
	}
	
	public int hashcode()
	{
		return (int) a;
	}
	
	
	public static void main(String[] args) 
	{
	
		Practice12 pra = new Practice12(12, "sql");
		String str = pra.toString();
		System.out.println(str);
		int has = pra.hashcode();
		System.out.println(has);
			
	}
	
	
	
	
	
}
