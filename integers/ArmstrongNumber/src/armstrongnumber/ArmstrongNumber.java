
package armstrongnumber;

import java.util.Scanner;

/**
 *
 * @author nbens
 */
public class ArmstrongNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num, total =0, i=0, newNum;
        try (Scanner input = new Scanner(System.in)) {
          System.out.println("Enter a number");
          num = input.nextInt();
        }
        
        newNum= num;
        
        while(newNum>0){
        i++;
        newNum/=10;
        }
        newNum = num;
        
        while(newNum>0){
        total+=(Math.pow(newNum%10, i));
        newNum/=10;
        }
        
        if(total == num){
        System.out.println(num+" is an armstrong number");
        }else{
          System.out.println(num+" is an armstrong number");
        }
        
    }
    
}
