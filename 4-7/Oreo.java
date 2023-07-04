class Oreo{
	double price;
	int quality;
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
	
	Oreo(double price,int quality)
	{
		System.out.println("Running Oreo with double and int ");
		this.price=price;
		this.quality=quality;
	}
	
	Oreo(double price,int quality,boolean small)
	{
		System.out.println("Running Oreo with double, int and boolean");
		this.price=price;
		this.quality=quality;
		this.small=small;
	}
}