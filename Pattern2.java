// *                   * 
// * *                 * * 
// * * *               * * * 
// * * * *             

import java.util.*;

class Pattern2{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern2 obj = new Pattern2();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int row){
        for (int i = 0; i < row; i++) {
            for(int j=0; j<= i ;j++){ //for(int j=0;j<i+1;j++)
                System.out.print("* ");
            }
            System.out.println("");
        }
    
    }
}
