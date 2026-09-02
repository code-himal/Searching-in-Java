public class recursion {

    public static void main(String[] args) {

        int arr[] = {1,2,44,55,66,77};
        int target = 44;
        System.out.println(recursion(arr,target,0, arr.length-1));
    }

    static int recursion(int[] arr, int target, int s, int e){
        if ( s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if (target == arr[m]){
            return m;
        }

        if(target<arr[m]){
            return recursion(arr, target, s, m-1);
        }

        return recursion(arr, target, m+1, e);
    }
}

