class PotRunner {
    public static void main(String[] args){
        System.out.println("Running main in PotRunner class");
        //inputs for instances
        int[] iCapacity ={10,20,30,40,50,60,70,80};
        String[] iColor ={"Red","Green","Black","White","Brown","Pink","Blue","Yellow"};
        String[] iFilledWith ={"Water","Orange juice","Apple juice","Petrol","Rasam","Soups","Paint","Sambar"};
        double[] iLength ={8.5,20,5,15,7.5,20,12.5,10};
        double[] iWidth ={2.5,1.5,3,4.5,5,7,1,3.5};
        double[] iHeight ={5,6,4,3,3.5,4.5,5.5,6};
        int[] iWeight ={200,300,400,500,250,350,450,550};
        boolean[] iIsFilled ={true,false,false,true,true,false,true,false};
        //for loop for all instances
        Pot[] Pot = new Pot[8];
        for (int i=0;i<8;i++){
            Pot[i] = new Pot(iCapacity[i],iColor[i],iFilledWith[i],iLength[i],iWidth[i],iHeight[i],iWeight[i],iIsFilled[i]);
            System.out.println("Instance name = Pot "+(i+1)+"\nCapacity = "+Pot[i].capacity+" liters\nColor = "+Pot[i].color+"\nFilled with = "+Pot[i].filledWith+"\nLength = "+Pot[i].length+" meters\nWidth = "+Pot[i].width+" meters\nHeight = "+Pot[i].height+" meters\nWeight = "+Pot[i].weight+" kgs\nIs it Filled = "+Pot[i].isFilled+"\n");
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
