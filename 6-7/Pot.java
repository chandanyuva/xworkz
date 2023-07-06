class Pot {
    int capacity;
    String color;
    String filledWith;
    double length;
    double width;
    double height;
    int weight;
    boolean isFilled;

    Pot(int capacity,String color,String filledWith,double length,double width,double height,int weight,boolean isFilled)
    {
        System.out.println("Running instance of Pot with all args...");
        this.capacity=capacity;
        this.color=color;
        this.filledWith=filledWith;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
        this.isFilled = isFilled;
    }

}
