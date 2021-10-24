package DSA;

import java.util.Scanner;

public class factorial {
    // Factorial of 5 = 5 * 4 * 3 * 2 * 1 or 5(n) * factorial(n-1)

    public static int factcursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factcursion(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factcursion(n));
        input.close();
    }
}