package javapract;

import java.util.Objects;

public class Bottle 
{
	private String color;
	private double quantity;
	private double price;
	
	public Bottle(String color, double quantity, double price) 
	{
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Bottle [color=" + color + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return (int) price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bottle other = (Bottle) obj;
		return this == obj;
	}
	
	
	
}
