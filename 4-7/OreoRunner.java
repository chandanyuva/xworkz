class OreoRunner{
	public static void main(String[] args) 
    {
        System.out.println("running main of OreoRunner");
		
		Oreo ref=new Oreo();
        System.out.println("Name: "+ref.price);
        System.out.println("quality: "+ref.quality);
        System.out.println("small: "+ref.small);
		
		Oreo ref1=new Oreo(45.00);
        System.out.println("Name: "+ref1.price);
        System.out.println("quality: "+ref1.quality );
        System.out.println("small: "+ref1.small);
        
		
		Oreo ref2=new Oreo(45.00,2);
        System.out.println("Name: "+ref2.price);
        System.out.println("quality: "+ref2.quality );
        System.out.println("small: "+ref2.small);
        
		
		Oreo ref3=new Oreo(45.00,2,true);
        System.out.println("Name: "+ref3.price);
        System.out.println("quality: "+ref3.quality );
        System.out.println("small: "+ref3.small);
	}   
}