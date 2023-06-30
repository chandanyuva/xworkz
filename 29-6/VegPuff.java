class VegPuff{
	String name="Veg Puff";
	double price=25;
	String shape;
	String weight; 
	VegPuff(){
		System.out.println("Executing VegPuff");
	}
	public static void main(String[] args){
		VegPuff ref=new VegPuff();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}