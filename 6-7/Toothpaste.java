class Toothpaste {
    int cost;
    String company;
    String flavour;
    double length;
    double width;
    double height;
    int weight;
    boolean isEmpty;

    Toothpaste(int cost,String company,String flavour,double length,double width,double height,int weight,boolean isEmpty)
    {
        System.out.println("Running instance of Toothpaste with all args...");
        this.cost=cost;
        this.company=company;
        this.flavour=flavour;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
        this.isEmpty = isEmpty;
    }

}
