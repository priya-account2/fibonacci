public class Fibonacci {

    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        // First two terms
        int a = 0, b = 1;

        // Print the first two terms if n > 0
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Compute and print the Fibonacci sequence from the 3rd term
        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            // Update values of a and b for the next iteration
            a = b;
            b = nextTerm;
        }
    }

    // Main method to test the Fibonacci function
    public static void main(String[] args) {
        int n = 10;  // You can change this to generate a different number of terms
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        printFibonacci(n);
    }
}
