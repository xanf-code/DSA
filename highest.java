import java.util.Random;

public class highest {

    static int large() {
        Random rd = new Random();
        int[] arr = new int[10];
        int largest = 0;

        // assigning random elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000);
            System.out.println(arr[i] + " ");
        }

        // traversing
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[largest])
                largest = i;
        return arr[largest];
    }

    public static void main(String[] args) {
        System.out.println("Largest Element : " + large());
    }
}
