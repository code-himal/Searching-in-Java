public class orderAgnostic {

    public static void main(String[] args) {

        int[] arr = {-18,-12,4,6,8,9,12,15};
        int target = 12;

        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //to find  whether the array is in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end-start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
