class Bun{
	String name="Cream bun";
	double price=25;
	String shape;
	String weight; 
	Bun(){
		System.out.println("Executing Bun");
	}
	public static void main(String[] args){
		Bun ref=new Bun();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}