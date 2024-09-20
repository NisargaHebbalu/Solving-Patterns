// 1
// 0 1
// 1 0 1

import java.util.*;

class Pattern11{
    public static void main(String args[]){

        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
       
        //to create an object for the class
        Pattern11 obj = new Pattern11();

        //to call the function
        obj.pattern(row);

    }

    public void pattern(int n){
        int start=1;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start =0;
            }
            
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    
    }
}