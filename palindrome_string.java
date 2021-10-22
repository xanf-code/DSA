import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        String reversed = "";
        boolean palin = true;
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String original = userinput.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reversed.charAt(i)) {
                palin = false;
            }
        }
        if (palin) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a Palindrome");
        }

        userinput.close();
    }
}
