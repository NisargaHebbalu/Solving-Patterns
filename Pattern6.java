// 1 2 3
// 1 2
// 1

import java.util.*;

class Pattern6{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern6 obj = new Pattern6();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int row){
        for(int i=0;i<row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    
    }
}