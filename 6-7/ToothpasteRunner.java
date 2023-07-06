class ToothpasteRunner {
    public static void main(String[] args){
        System.out.println("Running main in ToothpasteRunner class");
        //inputs for instances
        int[] iCost ={20,40,60,80,100,120,140,160};
        String[] iCompany = {"Colgate","Crest","Sensodyne","Aquafresh","Arm & Hammer","Tom's of Maine","Close-Up","Parodontax"};
        String[] iFlavour = {"Mint", "Cinnamon", "Spearmint", "Peppermint", "Bubblegum", "Strawberry", "Vanilla", "Citrus"};
        double[] iLength ={4.5,1.5,3,4.5,5,7,1,3.5};
        double[] iWidth ={2.5,2.5,6,8.5,10,14,2,6.5};
        double[] iHeight ={1,1.5,1.3,1.4,1.5,1.5,1.6,2};
        int[] iWeight ={20,30,40,50,25,35,45,55};
        boolean[] iEmpty ={true,false,false,true,true,false,true,false};
        //for loop for all instances
        Toothpaste[] Toothpaste = new Toothpaste[8];
        for (int i=0;i<8;i++){
            Toothpaste[i] = new Toothpaste(iCost[i],iCompany[i],iFlavour[i],iLength[i],iWidth[i],iHeight[i],iWeight[i],iEmpty[i]);
            System.out.println("Instance name = Toothpaste "+(i+1)+"\nCost = "+Toothpaste[i].cost+"Rs\nCompany = "+Toothpaste[i].company+"\nFlavour = "+Toothpaste[i].flavour+"\nLength = "+Toothpaste[i].length+" cms\nWidth = "+Toothpaste[i].width+" cms\nHeight = "+Toothpaste[i].height+" cms\nWeight = "+Toothpaste[i].weight+" grams\nIs it empty = "+Toothpaste[i].isEmpty+"\n");
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
