class Kebab{
    String name;
    double price;
    String hotelName;
    int noOfPieces;
    boolean takeAway;
	
	
	Kebab()
    {
        System.out.println("running Kebab const with no-arg ");
    }
	
    Kebab(String name)
    {
        System.out.println("running Kebab const with String ");
        this.name=name;
    }
	
     Kebab(String name,double price)
    {
        System.out.println("running Kebab const with String and double ");
        this.name=name;
        this.price=price;
    }
	
     Kebab(String name,double price,String hotelName)
    {
        System.out.println("running Kebab const with String,double and String ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
    }
	
     Kebab(String name,double price,String hotelName,int noOfPieces)
    {
        System.out.println("running Kebab const with String,double,String and int ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
        this.noOfPieces=noOfPieces;
    }
	
     Kebab(String name,double price,String hotelName,int noOfPieces,boolean takeAway)
    {
        System.out.println("running Kebab const with String,double,String,int and boolean ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
        this.noOfPieces=noOfPieces;
        this.takeAway=takeAway;
    }
}