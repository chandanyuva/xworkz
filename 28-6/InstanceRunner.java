class InstanceRunner{
	public static void main(String[] specs){
		
		System.out.println("Running main..");
		
		System.out.println("\nclass1 Mobile instances\n");
		
		Model model1 = new Model("MI");
		Model model2 = new Model("nokiya");
		Model model3 = new Model("oppo");
		Model model4 = new Model("vivo");
		Model model5 = new Model("pixel");
		Model model6 = new Model("oneplus");
		Model model7 = new Model("htc");
		Model model8 = new Model("apple");
		Model model9 = new Model("samsung");
		Model model10 = new Model("moto");
		
		System.out.println("\nclass2 Fruit instances\n");
		String[] fruits={"apple","mango","bananna","chikku","orange","pineapple","grapes","watermellon","straberry","blueberry"};
		Fruit[] fruit = new Fruit[10];
		for(int i=0;i<10;i++)
		{
			String item=fruits[i];
			fruit[i]=new Fruit(item);
		}
		
		System.out.println("\nclass3 Veggietable instances\n");
		
		String[] vegies={"Potato","Cabbage","Tomato","Cauliflower","Spinach","Asparagus","Brinjal","Carrot","Peas","Celery"};
		Veggies[] vegitable= new Veggies[10];
		for(int i=0;i<10;i++)
		{
			String item=vegies[i];
			vegitable[i]=new Veggies(item);
		}
		
		System.out.println("\nclass4 Bikes instances\n");
		String[] bikes={"Piaggio","Suzuki","Yamaha","Eicher","TVS","Honda","Hero","KTM","Bajaj","Kavasaki"};
		Bikes[] bike= new Bikes[10];
		for(int i=0;i<10;i++)
		{
			String item=bikes[i];
			bike[i]=new Bikes(item);
		}
		
		System.out.println("\nclass5 Books instances\n");
		String[] books={"Bicycle: The History","The Dancing Chain","Full Tilt","Joyride","Ghost Trails","Major Taylor","Need for the Bike","Park Tool Big Blue Book of Bike Repair","Slaying the Badger","The Wonderful Ride"};
		Books[] book= new Books[10];
		for(int i=0;i<10;i++)
		{
			String item=books[i];
			book[i]=new Books(item);
		}
		
		System.out.println("\nclass6 Teams instances\n");
		String[] teams={"RCB","CSK","GT","DC","KKR","LSG","MI","RR","SRH","PK"};
		Teams[] team= new Teams[10];
		for(int i=0;i<10;i++)
		{
			String item=teams[i];
			team[i]=new Teams(item);
		}
		
		System.out.println("\nclass7 Heros instances\n");
		String[] heros={"Superman","Batman","Wonder Woman","Spider-Man","Iron Man","Captain America","Black Widow","Hulk","Thor","Black Panther"};
		Heros[] hero= new Heros[10];
		for(int i=0;i<10;i++)
		{
			String item=heros[i];
			hero[i]=new Heros(item);
		}
		
		System.out.println("\nclass8 Animes instances\n");
		String[] animes={"Attack on Titan","Naruto","One Piece","Death Note","Fullmetal Alchemist: Brotherhood","Dragon Ball Z","Sword Art Online","My Hero Academia","Demon Slayer: Kimetsu no Yaiba","Hunter x Hunter"};
		Animes[] anime= new Animes[10];
		for(int i=0;i<10;i++)
		{
			String item=animes[i];
			anime[i]=new Animes(item);
		}
		
		System.out.println("\nclass9 Movies instances\n");
		String[] movies={"The Shawshank Redemption","The Godfather","Pulp Fiction","The Dark Knight","Fight Club","Inception","The Matrix","Goodfellas","The Silence of the Lambs","Schindler's List"};
		Movies[] movie= new Movies[10];
		for(int i=0;i<10;i++)
		{
			String item=movies[i];
			movie[i]=new Movies(item);
		}
		
		System.out.println("\nclass10 VedioGames instances\n");
		String[] vedioGames={"The Legend of Zelda: Breath of the Wild","Red Dead Redemption 2","God of War","The Last of Us Part II","Super Mario Odyssey","Persona 5","Final Fantasy VII Remake","Minecraft","Assassin's Creed Valhalla","Cyberpunk 2077"};
		VedioGames[] game= new VedioGames[10];
		for(int i=0;i<10;i++)
		{
			String item=vedioGames[i];
			game[i]=new VedioGames(item);
		}
	}
	
}
class Model{
	public Model(String name){
		System.out.println("Brand = "+name);
	}
}

class Fruit{
	public Fruit(String name){
		System.out.println("Fruit = "+name);
	}
}

class Veggies{
	public Veggies(String name){
		System.out.println("vegitable = "+name);
	}
}

class Bikes{
	public Bikes(String name){
		System.out.println("Bikes = "+name);
	}
}

class Books{
	public Books(String name){
		System.out.println("Books = "+name);
	}
}

class Teams{
	public Teams(String name){
		System.out.println("Teams = "+name);
	}
}

class Heros{
	public Heros(String name){
		System.out.println("Heros = "+name);
	}
}

class Animes{
	public Animes
	(String name){
		System.out.println("Anime = "+name);
	}
}

class Movies{
	public Movies(String name){
		System.out.println("Movies = "+name);
	}
}

class VedioGames{
	public VedioGames(String name){
		System.out.println("VedioGames = "+name);
	}
}