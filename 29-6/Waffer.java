class Waffer{
	String name="Lays";
	double price=5;
	String shape;
	String weight; 
	Waffer(){
		System.out.println("Executing Waffer");
	}
	public static void main(String[] args){
		Waffer ref=new Waffer();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}