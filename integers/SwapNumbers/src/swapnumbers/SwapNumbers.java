
package swapnumbers;

import java.util.Scanner;


public class SwapNumbers {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Enter the first number:");
        num1 = input.nextInt();
        System.out.println("Enter the second number:");
        num2 = input.nextInt();
        
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        
        System.out.println("After Swapping \nFirst number: "+num1+"\nSecond number: "+num2);
       
    }
    
}
