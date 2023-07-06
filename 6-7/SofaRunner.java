class SofaRunner {
    public static void main(String[] args){
        System.out.println("Running main in SofaRunner class");
        //inputs for instances
        int[] iCapacity ={2,3,4,5,6,7,8,9};
        String[] iColor ={"Red","Green","Black","White","Brown","Pink","Blue","Yellow"};
        String[] iMaterial ={"Leather","Fabric","Microfiber","Velvet","Suede","Synthetic Leather","Chenille","Linen"};
        double[] iLength ={8.5,20,5,15,7.5,20,12.5,10};
        double[] iWidth ={2.5,1.5,3,4.5,5,7,1,3.5};
        double[] iHeight ={5,6,4,3,3.5,4.5,5.5,6};
        int[] iWeight ={20,30,40,50,25,35,45,55};
        boolean[] iIsConvertible ={true,false,false,true,true,false,true,false};
        //for loop for all instances
        Sofa[] sofa = new Sofa[8];
        for (int i=0;i<8;i++){
            sofa[i] = new Sofa(iCapacity[i],iColor[i],iMaterial[i],iLength[i],iWidth[i],iHeight[i],iWeight[i],iIsConvertible[i]);
            System.out.println("Instance name = sofa "+(i+1)+"\nCapacity = "+sofa[i].capacity+" People\nColor = "+sofa[i].color+"\nMaterial = "+sofa[i].material+"\nLength = "+sofa[i].length+" feats\nWidth = "+sofa[i].width+" feats\nHeight = "+sofa[i].height+" feats\nWeight = "+sofa[i].weight+" kgs\nIs it convertible = "+sofa[i].isConvertible+"\n");
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
