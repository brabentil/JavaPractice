package fibonaccieseries;

import java.util.Scanner;

public class FibonaccieSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, first = 0, next = 1;

        System.out.println("Enter a number:");
        num = input.nextInt();
        
        System.out.print("Fibonacci Series up to " + num + ": ");
        
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            int sum = first + next;
            first = next;
            next = sum;
        }
    }
}
