class Money{
	String country;
	String currency;
	String denomination;
	String type;
	
	Money(String country) {
		System.out.println(" Money running with String argument :");
		this.country=country;
	}
	
	Money(String country, String currency) {
		this(country);
		System.out.println(" Money running with String and String argument :");
		this.currency=currency;
	}

	Money(String country, String currency, String denomination) {
		this(country,currency);
		System.out.println(" Money running with String, String and String argument :");
		this.denomination=denomination;
	}
	
	Money(String country, String currency, String denomination, String type) {
		this(country,currency,denomination);
		System.out.println(" Money running with String, String, String and String argument ");
		this.type=type;
	}
	
}

		