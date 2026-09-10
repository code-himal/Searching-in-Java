import java.util.Arrays;
import java.util.Scanner;
public class Remove_Dubli {
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

        if(arr.length==0){
            System.out.println("The array is empty");
        }
        else{
            System.out.println("The array"+ Arrays.toString(arr));
        }


        int p1=0;
        for(int p2=p1+1;p2<arr.length;p2++){
            if(arr[p1]!=arr[p2]){
                p1+=1;
                arr[p1]=arr[p2];
            }
        }

        System.out.println("There are"+(p1+1)+"unique elements in the array");

        int sum=0;
        for(int i=0;i<=p1;i++){
            System.out.println("UniqueElement");
            System.out.println(arr[i]);
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}