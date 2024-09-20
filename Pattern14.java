// A
// A B
// A B C

import java.util.*;

class Pattern14{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern14 obj = new Pattern14();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int n){
        for(int i=1;i<=n;i++){
            char value='A';
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}