import java.util.Random;

public class sortandlargest {

    static int[] generateArray() {
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1000);
        }

        return array;
    }

    static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        // Generate a random array
        int[] arr = generateArray();

        // Sort the generated array
        int[] sortedArray = sortArray(arr);

        // Print the sorted array
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }

        // Print the first and second largest element
        System.out.println("Largest Element : " + sortedArray[sortedArray.length - 1]);
        System.out.println("2nd largest Element : " + sortedArray[sortedArray.length - 2]);
    }
}
