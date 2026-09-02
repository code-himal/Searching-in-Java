public class binarySearch {

        public static void main(String[] args) {
            int[] arr = {-18,-12,4,6,8,9,12,15};
            // int[] arr = {89,77,65,55,45,32,21};
            int target = 9;
            int ans = binarySearch(arr, target);
            System.out.println(ans);
        }

        //returns the index
        // returns -1 if it does not exist
        static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end  = arr.length - 1;
            while (start <= end) {
                // int has fixed size so might be possible that start + end exceeds the range of integer in java
                int mid = start + ( end - start ) / 2;
                if (target == arr[mid]) {
                    return mid;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return -1;
        }
}

