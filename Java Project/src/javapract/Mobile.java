package javapract;

public class Mobile 
{

	 String name;
	 String color;
	 double price;



	public Mobile(String name, String color, double price)
	{

		this.name=name;
		this.color = color;
		this.price = price;



	}



	/*
	 * public String getName() { return name; }
	 * 
	 * 
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * 
	 * public String getColor() { return color; }
	 * 
	 * 
	 * 
	 * public void setColor(String color) { this.color = color; }
	 * 
	 * 
	 * 
	 * public double getPrice() { return price; }
	 * 
	 * 
	 * 
	 * public void setPrice(double price) { this.price = price; }
	 */	//@override
	@Override
	public String toString()
	{
		return name+" "+color+" "+price;
	}
	public int hashcode()
	{
		return (int) price;
	}
	@Override
	public boolean equals(Object obj)
	{
		
		return this == obj;

	}
	
}