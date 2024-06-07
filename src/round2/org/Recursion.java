package round2.org;

public class Recursion {
	public static void main(String[] args) {
        int number = 5;
        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static int factorial(int n) {
        // Base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: Multiply n by factorial of (n - 1)
        else {
            return n * factorial(n - 1);
        }
    }

}
