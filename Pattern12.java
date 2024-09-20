// 1         1
// 1 2     2 1
// 1 2 3 3 2 1

import java.util.*;

class Pattern12{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern12 obj = new Pattern12();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int n){
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //space
            for(int j=1;j<=(2*n)-(2*i);j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j<=i&&j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}