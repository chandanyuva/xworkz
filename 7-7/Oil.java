class Oil {
    String name ;
    double dansity ;
    int quantity ;
    String companyOwner ;
    String producedAt ;

    Oil(String name,double dansity,int quantity,String companyOwner,String producedAt){
        System.out.println("Running Constructor with all args....");
        this.name=name;
        this.dansity=dansity;
        this.quantity=quantity;
        this.companyOwner=companyOwner;
        this.producedAt=producedAt;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Name: "+name+"\n" +
                "dansity: "+dansity+" kg/m\n" +
                "quantity: "+quantity+"liter\n" +
                "companyOwner: "+companyOwner+"\n" +
                "producedAt: "+producedAt+"\n");
        System.out.println("\n");
    }
}
