package SpringCoreDependancyInjection;

public class Car 
{
	private int id;
	private String brand;
	private int price;
	private Engine e;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public void carDetails()
	{
		System.out.println("Car Id :-"+id);
		System.out.println("Car Brand :-"+brand);
		System.out.println("Car Price :-"+price);
		System.out.println("---------------------");
		System.out.println("Engine Id :-"+e.getId());
		System.out.println("Engine cc :-"+e.getCc());
	}
	
	
}
