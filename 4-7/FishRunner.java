class FishRunner {
    public static void main(String[] args) {
        System.out.println("running main of FishRunner");
		
		Fish ref=new Fish();
        System.out.println("fish name: "+ref.name);
        System.out.println("fish name: "+ref.type );
        System.out.println("fish name: "+ref.price);
        System.out.println("fish name: "+ref.location);
		
        Fish ref1=new Fish("Bangde");
        System.out.println("fish name: "+ref1.name);
        System.out.println("fish name: "+ref1.type );
        System.out.println("fish name: "+ref1.price);
        System.out.println("fish name: "+ref1.location);


        Fish ref2=new Fish("Bangde","Temperate");
        System.out.println("fish name: "+ref2.name);
        System.out.println("fish name: "+ref2.type );
        System.out.println("fish name: "+ref2.price);
        System.out.println("fish name: "+ref2.location);


        Fish ref3=new Fish("Bangde","Temperate",250);
        System.out.println("fish name: "+ref3.name);
        System.out.println("fish name: "+ref3.type );
        System.out.println("fish name: "+ref3.price);
        System.out.println("fish name: "+ref3.location);

        Fish ref4=new Fish("Bangde","Temperate",250,"Temperate");
        System.out.println("fish name: "+ref4.name);
        System.out.println("fish name: "+ref4.type );
        System.out.println("fish name: "+ref4.price);
        System.out.println("fish name: "+ref4.location);
    }
}