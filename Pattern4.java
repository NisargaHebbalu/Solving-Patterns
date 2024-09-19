// 1
// 2 2 
// 3 3 3

import java.util.*;

class Pattern4{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern4 obj = new Pattern4();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    
    }
}