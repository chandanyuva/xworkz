class Sofa {
    int capacity;
    String color;
    String material;
    double length;
    double width;
    double height;
    int weight;
    boolean isConvertible;

    Sofa(int capacity,String color,String material,double length,double width,double height,int weight,boolean isConvertible)
    {
        System.out.println("Running instance of sofa with all args...");
        this.capacity=capacity;
        this.color=color;
        this.material=material;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
        this.isConvertible=isConvertible;
    }

}
