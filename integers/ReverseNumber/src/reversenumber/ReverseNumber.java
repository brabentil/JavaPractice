package reversenumber;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, rev = 0;

        System.out.println("Enter a number:");
        num = input.nextInt();

        while (num > 0) {
            int digit = num % 10; 
            rev = rev * 10 + digit; 
            num /= 10; 
        }

        System.out.println("The reverse is: " + rev);
    }
}
