// A B C 
// A B 
// A

import java.util.*;

class Pattern15{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern15 obj = new Pattern15();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int n){
        for(int i=1;i<=n;i++){
            char value='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}