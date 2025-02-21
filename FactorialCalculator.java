import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();
        while (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            System.out.print("Enter a non-negative integer: ");
            number = input.nextInt();
        }
        input.close();
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}