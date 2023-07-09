public class WorkerRunner {
    public static void main(String[] args){
        System.out.println("Running main method in WorkerRunner....");
        System.out.println("instance 1 for Worker");
        Worker ref1=new Worker("Rama",5,24,"Intern","R204");
        ref1.print();
        System.out.println("instance 2 for Worker");
        Worker ref2=new Worker("Shama",2.5,26,"Trainee","R211");
        ref2.print();
        System.out.println("instance 3 for Worker");
        Worker ref3=new Worker("Bhama",10,25,"Engineer","R221");
        ref3.print();
    }
}
