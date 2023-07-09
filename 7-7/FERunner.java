public class FERunner {
    public static void main(String[] args){
        System.out.println("Running main method in FERunner....");
        System.out.println("instance 1 for FireExtinguisher");
        FireExtinguisher ref1=new FireExtinguisher("Water-based",5,150,"UL Listed","Wall-mounted");
        ref1.print();
        System.out.println("instance 2 for FireExtinguisher");
        FireExtinguisher ref2=new FireExtinguisher("Dry powder",2.5,100,"NFPA certified","Portable");
        ref2.print();
        System.out.println("instance 3 for FireExtinguisher");
        FireExtinguisher ref3=new FireExtinguisher("Carbon dioxide (CO2)",10,250,"UL Listed","Vehicle-mounted");
        ref3.print();
    }
}
