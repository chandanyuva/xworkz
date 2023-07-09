class Owner {
    String name ;
    double netWorth ;
    int age ;
    String companyName ;
    String country ;

    Owner(String name,double netWorth,int age,String companyName,String country){
        System.out.println("Running Constructor with all args....");
        this.name=name;
        this.netWorth=netWorth;
        this.age=age;
        this.companyName=companyName;
        this.country=country;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Name: "+name+"\n" +
                "netWorth: "+netWorth+" m\n" +
                "age: "+age+" years\n" +
                "companyName: "+companyName+"\n" +
                "country: "+country+"\n");
        System.out.println("\n");
    }
}
