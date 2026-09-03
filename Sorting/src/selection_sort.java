import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

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

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            // Find the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // Swap after finding minimum
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}