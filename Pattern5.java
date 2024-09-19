// * * *
// * *
// *

import java.util.*;

class Pattern5{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern5 obj = new Pattern5();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
}