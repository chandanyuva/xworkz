class Bread{
	String name="whole eheat bread";
	double price=25;
	String shape;
	String weight; 
	Bread(){
		System.out.println("Executing Bread");
	}
	public static void main(String[] args){
		Bread ref=new Bread();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}