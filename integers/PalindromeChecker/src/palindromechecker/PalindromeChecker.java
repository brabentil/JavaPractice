
package palindromechecker;

import java.util.Scanner;


public class PalindromeChecker {

    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.println("Enter a number: ");
        num= input.nextInt();
        
        if(isPalindrom(num)){
            System.out.println(num+ " is palindrome");
        }else{
        System.out.println(num + "is not palindrome");
        }
    }
    public static int reverseNum(int num){
     int rev = 0;
         while (num > 0) {
            int digit = num % 10; 
            rev = rev * 10 + digit; 
            num /= 10; 
        }
         
         return rev;
    }
    
    public static boolean isPalindrom(int num){
    boolean flag = false;
    
    if(num == reverseNum(num)){
    flag = true;
    }
    
    return flag;
    
    }
}
