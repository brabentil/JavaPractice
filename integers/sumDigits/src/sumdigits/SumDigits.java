
package sumdigits;

import java.util.Scanner;


public class SumDigits {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num,total=0;
        
        System.out.println("Enter a number: ");
        num= input.nextInt();
        
        while(num>0){
        total+=(num%10);
        num/=10;
        }
        
        System.out.println("Sum of digits: "+total);
        
    }
    
}
