
package oddoreven;

import java.util.InputMismatchException;
import java.util.Scanner;


public class OddOrEven {

   
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int num;
        boolean even;
        
        try {
            System.out.println("Enter a number:");
            num = input.nextInt();

            even = (num % 2 == 0);

            if(even) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            input.close();
        }
    }
    
}
