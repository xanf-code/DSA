import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println("Enter n :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            int result = a + b;
            a = b;
            b = result;
            System.out.println(result);
        }

        input.close();
    }
}
