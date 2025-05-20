package test;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scanner.nextInt();

        // print the series
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            if (i != a - 1) {
                System.out.print(oddNumber + ", ");
            } else {
                System.out.print(oddNumber); // no comma at the end
            }
        }

        scanner.close();
    }
}

