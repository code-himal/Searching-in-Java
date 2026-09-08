import java.util.ArrayList;

public class max_sum {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(1);
        arr.add(8);
        arr.add(2);
        arr.add(9);

        int k = 3;
        int N = arr.size();

        long result = max_sum(k, arr, N);

        System.out.println("Maximum sum = " + result);
    }

    public static long max_sum(int k, ArrayList<Integer> Arr, int N) {

        long maxSum = 0;
        long sum = 0;

        int index = 0;

        while (index < N && index < k) {
            sum += Arr.get(index);
            index++;
        }

        maxSum = sum;

        for (int i = 1; i < N - k + 1; i++) {
            int prevElement = Arr.get(i - 1);
            int nextElement = Arr.get(i + k - 1);

            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}