// * * * *             * * * 
// * * * *             * * * 
// * * * *             * * * 
// * * * *             * * *

import java.util.*;

class Pattern1{
    public static void main(String args[]){

        int row, column;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
        System.out.println("Enter the number of columns");
        column=sc.nextInt();

        //if rows and columns are equal 
        //column=row
       
        //to create an object for the class
        Pattern1 obj = new Pattern1();

        //to call the function
        obj.pattern(row,column);

        // for (int i = 0; i < row; i++) {
        //     for(int j=0;j<column ;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

    }

    public void pattern(int row, int column){
        for (int i = 0; i < row; i++) {
            for(int j=0;j<column ;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    
    }
}
