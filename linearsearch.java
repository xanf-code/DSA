public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Index of " + key + " is " + index);
        }
    }
}
