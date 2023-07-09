public class OilRunner {
    public static void main(String[] args){
        System.out.println("Running main method in OilRunner....");
        System.out.println("instance 1 for Oil");
        Oil ref1=new Oil("Indian Oil",820,10,"Mr Shrikant Madhav Vaidya","India");
        ref1.print();
        System.out.println("instance 2 for Oil");
        Oil ref2=new Oil("Shell",800,12,"Shell plc","Netherlands");
        ref2.print();
        System.out.println("instance 3 for Oil");
        Oil ref3=new Oil("Total",850,25,"Patrick Pouyanné","Middle East");
        ref3.print();
    }
}
