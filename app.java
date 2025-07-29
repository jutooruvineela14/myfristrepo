Here are three simple examples in Java to add two numbers, suitable for beginners:

1. Using Scanner for User Input
Copy the code
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}

2. Using Command-Line Arguments
Copy the code
public class AddTwoNumbers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}

3. Using Hardcoded Values
Copy the code
public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}


These examples demonstrate different ways to perform addition in Java, from user input to hardcoded values. Perfect for beginners to practice!

