
package primenumber;

import java.util.InputMismatchException;
import java.util.Scanner;


public class PrimeNumber {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        try {
                 System.out.println("Enter a number:");
        num=input.nextInt();
        
        if(isprime(num)){
        System.out.println(num + " is a prime number");
        }else{
        System.out.println(num + " is not a prime number");
        }        
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number!");
        } finally {
            input.close();
        }
    
    
    }
    
    public static boolean isprime (int num){
    boolean flag = true;
    
    for (int i= 2; i<num/2; i++){
    if(num % i == 0){
    flag = false;
    }
    }
    
    return flag;
    }
}
