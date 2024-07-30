
package numberofeven;

import java.util.Scanner;


public class NumberOfEven {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num,evenCount=0,digit;
      
        System.out.println("Enter a number");
        num = input.nextInt();
        int newNum=num;
        
        while(num>0){
        digit = num%10;
        
        if(digit%2==0){
        evenCount++;
        }
        num/=10;
        }
        
        System.out.println("Number of even digits in "+newNum+" : " + evenCount);
    }
    
}
