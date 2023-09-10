package springcoresetterinjection;

public class Bike 
{
	private int id;
	private String name;
	private double price;
	
	public Bike(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void bikeDetails()
	{
		System.out.println("Id :-"+id);
		System.out.println("Name :-"+name);
		System.out.println("Price :-"+price);
	}
	
}
