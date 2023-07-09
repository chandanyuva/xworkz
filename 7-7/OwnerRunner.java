public class OwnerRunner {
    public static void main(String[] args){
        System.out.println("Running main method in OwnerRunner....");
        System.out.println("instance 1 for Owner");
        Owner ref1=new Owner("Julie Sweet",4,26,"Accenture","India");
        ref1.print();
        System.out.println("instance 2 for Owner");
        Owner ref2=new Owner("Kumar Mangalam Birla",80,40,"Aditya Birla Group","India");
        ref2.print();
        System.out.println("instance 3 for Owner");
        Owner ref3=new Owner("Shantanu Narayen",50,25,"Adobe Systems","us");
        ref3.print();
    }
}
