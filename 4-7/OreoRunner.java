class OreoRunner{
	public static void main(String[] args) 
    {
        System.out.println("running main of OreoRunner");
		
		Oreo ref=new Oreo();
        System.out.println("Price: "+ref.price);
        System.out.println("quantity: "+ref.quantity);
        System.out.println("small: "+ref.small);
		
		Oreo ref1=new Oreo(45.00);
        System.out.println("Price: "+ref1.price);
        System.out.println("quantity: "+ref1.quantity );
        System.out.println("small: "+ref1.small);
        
		
		Oreo ref2=new Oreo(45.00,2);
        System.out.println("Price: "+ref2.price);
        System.out.println("quantity: "+ref2.quantity );
        System.out.println("small: "+ref2.small);
        
		
		Oreo ref3=new Oreo(45.00,4,true);
        System.out.println("Price: "+ref3.price);
        System.out.println("quantity: "+ref3.quantity );
        System.out.println("small: "+ref3.small);
	}   
}