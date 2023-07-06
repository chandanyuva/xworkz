class Stove {
    String color;
    int burners;
    String material;
    double length;
    double width;
    double height;
    int weight;
    boolean isConnected;

    Stove(int Burners,String color,String material,double length,double width,double height,int weight,boolean isConnected)
    {
        System.out.println("Running instance of Stove with all args...");
        this.burners=Burners;
        this.color=color;
        this.material=material;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
        this.isConnected = isConnected;
    }

}
