class IceCream{
	String name="Gud bud";
	double price=50;
	String shape;
	String weight; 
	IceCream(){
		System.out.println("Executing IceCream");
	}
	public static void main(String[] args){
		IceCream ref=new IceCream();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}