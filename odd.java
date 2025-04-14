package mark123;

import java.util.Scanner;

public class odd {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number taken");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
