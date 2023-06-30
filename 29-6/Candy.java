class Candy{
	String name="Cotton Candy";
	double price=30;
	String shape;
	String weight; 
	Candy(){
		System.out.println("Executing Candy");
	}
	public static void main(String[] args){
		Candy ref=new Candy();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}