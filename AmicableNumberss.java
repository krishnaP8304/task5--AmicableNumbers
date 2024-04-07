import java.util.Scanner;

public class AmicableNumberss {
    // Function to find the sum of proper divisors of a number
    public static int sumOfDivisors(int number) {
        int sum = 1; // 1 is a divisor of all numbers
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum;
    }

    // Function to check if two numbers are amicable
    public static boolean areAmicable(int num1, int num2) {
        return sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1;
    }

    // Function to calculate the product of two numbers and check if it's a palindrome
    public static boolean isPalindromeProduct(int num1, int num2) {
        int product = num1 * num2;
        String productStr = String.valueOf(product);
        StringBuilder reversedProductStr = new StringBuilder(productStr).reverse();
        return productStr.equals(reversedProductStr.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        scanner.close();

        if (areAmicable(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers");

            if (isPalindromeProduct(num1, num2)) {
                System.out.println("Their Product " + (num1 * num2) + " produces a Palindrome");
            } else {
                System.out.println("Their Product " + (num1 * num2) + " does not produce a Palindrome");
            }
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }
    }
}
