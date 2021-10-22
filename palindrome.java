
/**
 * palindrome
 */
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        int res = 0, rem, q;

        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = userinput.nextInt();

        q = n;
        while (q != 0) {
            rem = q % 10;
            res = res * 10 + rem;
            q = q / 10;
        }

        if (res == n) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }

        userinput.close();
    }
}