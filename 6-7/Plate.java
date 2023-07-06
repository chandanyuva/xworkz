class Plate {
    int quantity;
    String color;
    String material;
    double length;
    double width;
    double height;
    int weight;
    boolean isClean;

    Plate(int quantity,String color,String material,double length,double width,double height,int weight,boolean isClean)
    {
        System.out.println("Running instance of Plate with all args...");
        this.quantity=quantity;
        this.color=color;
        this.material=material;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
        this.isClean=isClean;
    }

}
