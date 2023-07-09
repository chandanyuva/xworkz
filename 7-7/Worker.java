class Worker {
    String name ;
    double salary ;
    int age ;
    String position ;
    String ssn ;

    Worker(String name,double salary,int age,String position,String ssn){
        System.out.println("Running Constructor with all args....");
        this.name=name;
        this.salary=salary;
        this.age=age;
        this.position=position;
        this.ssn=ssn;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Name: "+name+"\n" +
                "Salary: "+salary+" LPA\n" +
                "Age: "+age+"\n" +
                "Position: "+position+"\n" +
                "SSN: "+ssn+"CMP2013\n");
        System.out.println("\n");
    }
}
