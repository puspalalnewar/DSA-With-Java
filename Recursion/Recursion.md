# Recursion 

Recursion in Java is a process in which a method calls itself continuously until it reaches a base condition, which terminates the recursive calls. Recursion is commonly used for solving problems that can be broken down into smaller subproblems of the same type.

### Key Concepts of Recursion:

1. **Base Case (Termination Condition)**: Every recursive method must have at least one base case. This prevents the function from calling itself indefinitely. Once the base case is reached, the recursion stops.

2. **Recursive Case**: This is where the function continues calling itself with modified arguments to approach the base case.

3. **Stack Memory**: Recursion relies on the call stack. Each recursive call is stored in the stack, and it is popped out once the call is completed.

4. **Direct vs Indirect Recursion**: 
   - **Direct Recursion**: A method directly calls itself.
  - **Indirect Recursion**: A method calls another method, which eventually leads to the original method being called again.

### Example of Basic Recursion in Java:

#### 1. Factorial Calculation
Factorial is a classic example of recursion. The factorial of `n` (denoted as `n!`) is the product of all positive integers less than or equal to `n`.

```java
public class RecursionExample {

    // Method to calculate factorial recursively
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

// - Base Case: When n == 0 or n == 1, the function returns 1.
// - Recursive Case: The function keeps calling itself with n-1 until the base case is reached.

```
#### 2.  Fibonacci Sequence

```Java
public class FibonacciRecursion {

    // Method to calculate nth Fibonacci number recursively
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

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
```
