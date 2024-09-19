// 1
// 1 2 
// 1 2 3

import java.util.*;

class Pattern3{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern3 obj = new Pattern3();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    
    }
}