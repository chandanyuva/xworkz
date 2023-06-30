class Sweet{
	String name="Mysorepak";
	double price=25;
	String shape;
	String weight; 
	Sweet(){
		System.out.println("Executing Sweet");
	}
	public static void main(String[] args){
		Sweet ref=new Sweet();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}