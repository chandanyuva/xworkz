class MoneyRunner{
	public static void main(String[] money){
		System.out.println("Running main...");
		Money country = new Money("India","Rupees","1,2,5,10,20,50,100,500,2000","Coin");
		System.out.println("Country :"+country.country);
		System.out.println("Currency :"+country.currency);
		System.out.println("Denomination :"+country.denomination);
		System.out.println("Type :"+country.type);
		
	}
}	