class PlateRunner {
    public static void main(String[] args){
        System.out.println("Running main in PlateRunner class");
        //inputs for instances
        int[] iQuantity ={2,4,6,8,10,12,14,16};
        String[] iColor ={"Red","Green","Black","White","Brown","Pink","Blue","Yellow"};
        String[] iMaterial ={"Wood","Stainless steel","Bamboo","Melamine","Glass","Stoneware","Bone china","Porcelain"};
        double[] iLength ={2.5,1.5,3,4.5,5,7,1,3.5};
        double[] iWidth ={2.5,1.5,3,4.5,5,7,1,3.5};
        double[] iHeight ={1,1.5,1.3,1.4,1.5,1.5,1.6,2};
        int[] iWeight ={20,30,40,50,25,35,45,55};
        boolean[] iIsClean ={true,false,false,true,true,false,true,false};
        //for loop for all instances
        Plate[] Plate = new Plate[8];
        for (int i=0;i<8;i++){
            Plate[i] = new Plate(iQuantity[i],iColor[i],iMaterial[i],iLength[i],iWidth[i],iHeight[i],iWeight[i],iIsClean[i]);
            System.out.println("Instance name = plate "+(i+1)+"\nQuantity = "+Plate[i].quantity+"\nColor = "+Plate[i].color+"\nMaterial = "+Plate[i].material+"\nLength = "+Plate[i].length+" inches\nWidth = "+Plate[i].width+" inches\nHeight = "+Plate[i].height+" inches\nWeight = "+Plate[i].weight+" grams\nIs it clean = "+Plate[i].isClean+"\n");
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
