package ArraysAndStrings.implementation.dynamicarray;

public class TwoDArrayImpl {
    public static void main(String[] args){
        int[][] data = new  int[3][3];
        data[0][0] = 1;
        data[0][1] = 2;
        data[0][2] = 5;
        data[1][0] = 5;
        data[1][1] = 8;
        data[1][2] = 12;
        data[2][0] = 0;
        data[2][1] = 0;
        data[2][2] = 0;

        //printing with index
        System.out.println("printing with index: \n");
        for(int rowIndex=0;rowIndex<3;rowIndex++){
            for(int colIndex=0;colIndex<3;colIndex++){
                System.out.print("["+rowIndex+"]["+colIndex+"]"+data[rowIndex][colIndex]+"\t");
            }
            System.out.println("\n");
        }


        //printing without index
        System.out.println("printing without index\n");
        for(int rowIndex=0;rowIndex<3;rowIndex++){
            for(int colIndex=0;colIndex<3;colIndex++){
                System.out.print(data[rowIndex][colIndex]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("Printing diagonal elements: \n");
        for(int rowIndex=0;rowIndex<3;rowIndex++){
            for(int colIndex=0;colIndex<3;colIndex++){
                if(rowIndex==colIndex) System.out.print(data[rowIndex][colIndex]+"\t");
            }
        }

    }
}
