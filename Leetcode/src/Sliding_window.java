//missing numbers from 0 1 2 3 5 6 7
public class Sliding_window {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 5, 6, 7};

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}

//Index Method
//public class MissingNumber {
//
//    public static void main(String[] args) {
//
//        int[] arr = {0, 1, 2, 3, 5, 6, 7};
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != i) {
//                System.out.println("Missing number is: " + i);
//                break;
//            }
//        }
//    }
//}