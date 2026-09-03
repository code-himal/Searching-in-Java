//# 1. Move into your specific GitHub folder
//cd Github-Java
//
//# 2. Stage your updated files
//git add .
//
//        # 3. Commit the changes
//git commit -m "Updated recursion file"
//
//        # 4. Push the changes to GitHub
//git push origin main

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

