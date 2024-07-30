
package factorialnumber;

import java.util.Scanner;


 
public class FactorialNumber {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num, factorial = 1;
      
        System.out.println("Enter a number:");
        num = input.nextInt();
        
        for (int i =1; i<=num; i++){
        factorial*=i;
        }
        System.out.println("The factorial is "+ factorial);
    }
    
}
