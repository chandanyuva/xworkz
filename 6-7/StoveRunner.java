class StoveRunner {
    public static void main(String[] args){
        System.out.println("Running main in StoveRunner class");
        //inputs for instances
        int[] iBurners ={2,4,6,8,10,12,14,16};
        String[] iColor ={"Red","Green","Black","White","Brown","Pink","Blue","Yellow"};
        String[] iMaterial ={"Soapstone","Copper","Aluminum","Glass-ceramic","Ceramic","Porcelain enamel","Cast iron","Stainless steel"};
        double[] iLength ={2.5,2.5,6,8.5,10,14,2,6.5};
        double[] iWidth ={4.5,1.5,3,4.5,5,7,1,3.5};
        double[] iHeight ={1,1.5,1.3,1.4,1.5,1.5,1.6,2};
        int[] iWeight ={20,30,40,50,25,35,45,55};
        boolean[] iConnected ={true,false,false,true,true,false,true,false};
        //for loop for all instances
        Stove[] Stove = new Stove[8];
        for (int i=0;i<8;i++){
            Stove[i] = new Stove(iBurners[i],iColor[i],iMaterial[i],iLength[i],iWidth[i],iHeight[i],iWeight[i],iConnected[i]);
            System.out.println("Instance name = Stove "+(i+1)+"\nBurners = "+Stove[i].burners+"\nColor = "+Stove[i].color+"\nMaterial = "+Stove[i].material+"\nLength = "+Stove[i].length+" inches\nWidth = "+Stove[i].width+" inches\nHeight = "+Stove[i].height+" inches\nWeight = "+Stove[i].weight+" kgs\nIs it connected to gas = "+Stove[i].isConnected+"\n");
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
