package springcoresetterinjection;

public class Bike2 
{
	private int cc;
	private String name;
	private int price;
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void bikeDetails2()
	{
		System.out.println("Bike Cc:-"+cc);
		System.out.println("Bike Name:-"+name);
		System.out.println("Bike Price:-"+price);
		
	}
	
}
