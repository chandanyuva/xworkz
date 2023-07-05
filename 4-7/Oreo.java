class Oreo{
	double price;
	int quantity;
	boolean small;
	
	Oreo()
	{
		System.out.println("Running with no-args");
	}
	
	Oreo(double price)
	{
		System.out.println("Running Oreo with double");
		this.price=price;
	}
	
	Oreo(double price,int quantity)
	{
		System.out.println("Running Oreo with double and int ");
		this.price=price;
		this.quantity=quantity;
	}
	
	Oreo(double price,int quantity,boolean small)
	{
		System.out.println("Running Oreo with double, int and boolean");
		this.price=price;
		this.quantity=quantity;
		this.small=small;
	}
}