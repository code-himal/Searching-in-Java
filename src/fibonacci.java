public class fibonacci {

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibonacci Series upto" + n + "Terms:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n){
        if(n <=1) {
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
}
