class Metro{
    String line;
    double distance;
    String start;
    String destination;
    int capacity;
    Metro(String line){
        System.out.println("running Metro with string as args");
        this.line=line;
    }
    Metro(String line, double distance){
        this(line);
        System.out.println("running Metro with string , double as args");
        this.distance=distance;
    }
    Metro(String line, double distance, String start){
        this(line,distance);
        System.out.println("running Metro with string , double, string as args");
        this.start=start;
    }
    Metro(String line, double distance, String start,String destination){
        this(line,distance,start);
        System.out.println("running Metro with string , double, string, string as args");
        this.destination=destination;
    }
    Metro(String line, double distance, String start,String destination,int capacity){
        this(line,distance,start,destination);
        System.out.println("running Metro with string , double, string, string, int as args");
        this.capacity=capacity;
    }
}