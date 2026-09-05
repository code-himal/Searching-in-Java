import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {

    public static void main(String[] args) {

        System.out.println("Enter the numbers to be sorted:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: " + Arrays.toString(arr));

        // Insertion Sort
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key into its correct position
            arr[j + 1] = key;
        }

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}