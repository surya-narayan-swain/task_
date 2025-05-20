package test;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = scanner.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        //print the series
        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            if (i != count - 1) {
                System.out.print(oddNumber + ", ");
            } else {
                System.out.print(oddNumber);
            }
        }

        scanner.close();
    }
}

