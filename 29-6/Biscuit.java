class Biscuit{
	String name="oreo";
	double price=10;
	String manufacture;
	String expiryDate; 
	Biscuit(){
		System.out.println("Executing biscuit");
	}
	public static void main(String[] args){
		Biscuit ref=new Biscuit();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("MFD: "+ref.manufacture);
		System.out.println("EXD: "+ref.expiryDate);
	}
}