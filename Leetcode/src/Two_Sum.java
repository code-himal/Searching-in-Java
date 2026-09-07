import java.util.Scanner;

public class Two_Sum {
    static void main()
    {
        System.out.println("How many numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1));
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter the target number");
        int target = sc.nextInt();
        boolean isVetyo= false;

        int start=0;
        int end=n-1;
        if(arr[start]+arr[end]==target){
            System.out.println(start);
            System.out.println(end);
            isVetyo=true;
        }
        while(start<=end)
        {
            if(arr[start]+arr[end]==target){
                System.out.println(start);
                System.out.println(end);
                isVetyo=true;
                break;
            }else if(arr[start]+arr[end]>target){
                end--;
            }
            else{
                start++;
            }

        }
        if(isVetyo==false){
            System.out.println("You dont have numbers that add up to the given target.");
        }
    }
}