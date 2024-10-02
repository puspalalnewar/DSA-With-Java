package Recursion;

public class basic {

    // Calculating factorial using Recursion
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n) {

        // F(0) = 0
        // F(1) = 1
        // F(n) = F(n-1) + F(n-2)

        // Base case: F(0) = 0, F(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]){
        System.out.println(fibonacci(10));
        // System.out.println(factorial(4));
    }
}
