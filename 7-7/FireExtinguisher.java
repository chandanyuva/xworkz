class FireExtinguisher {
    String type ;
    double capacity ;
    int pressure ;
    String certification ;
    String mounting ;

    FireExtinguisher(String type,double capacity,int pressure,String certification,String mounting){
        System.out.println("Running Constructor with all args....");
        this.type=type;
        this.capacity=capacity;
        this.mounting=mounting;
        this.pressure=pressure;
        this.certification=certification;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Type: "+type+"\n" +
                "Capacity: "+capacity+" liters\n" +
                "Pressure: "+pressure+" psi\n" +
                "Certification: "+certification+"\n" +
                "Mounting: "+mounting);
        System.out.println("\n");
    }
}
