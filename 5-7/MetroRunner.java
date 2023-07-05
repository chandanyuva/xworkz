class MetroRunner{
    public static void main(String[] args){
        System.out.println("Running main in MetroRunner..");
        Metro train1=new Metro("green",5.2,"mejastic","lallbhag",120);
        System.out.println("line = "+train1.line+"\ndistance = "+train1.distance+" kmph"+"\nstart = "+train1.start+"\ndestination = "+train1.destination+"\ncapacity = "+train1.capacity);
    }
}