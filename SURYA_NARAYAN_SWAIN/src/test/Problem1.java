package test;

import java.util.Scanner;

public class Problem1 {
    private double a;
    private double b;
    private String operation;

    // Constructor
    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }
 // perform operations
    public void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation. Please use add, subtract, multiply, or divide.");
        }
    }

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        // Create calculator object and perform calculation
        Problem1 calc = new Problem1(a, b, operation);
        calc.calculate();

        scanner.close();
    }   
}
