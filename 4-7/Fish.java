class Fish{
    String name;
    String type;
    int price;
    String location;
	
	Fish()
	{
		System.out.println("Running with no-args");
	}
	
    Fish(String name)
    {
        System.out.println("running Fish const with String ");
        this.name=name;
    }
	
     Fish(String name,String type)
    {
        System.out.println("running Fish const with String and String ");
        this.name=name;
        this.type=type;
    }
	
     Fish(String name,String type,int price)
    {
        System.out.println("running Fish const with String, string and double ");
        this.name=name;
        this.type=type;
        this.price=price;
    }
	
     Fish(String name,String type,int price,String location)
    {
        System.out.println("running Fish const with String, string, double and String");
        this.name=name;
        this.type=type;
        this.price=price;
        this.location=location;
    }
}