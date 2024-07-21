package com.tripathi.main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean continueCalculation = true;
        System.out.println("Hey there Good Morning ");
        System.out.println("What kind of help i can do for you ?");
        System.out.println("Please Enter 1 for `Add` 2 for `Subtract` 3 for `Multiplication` 4 for `Division` ");
        Scanner scanner = new Scanner(System.in);

        while (continueCalculation) {
            System.out.println("Choose an operation: add, subtract, multiply, divide, or exit to quit");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit") || operation.equalsIgnoreCase("")) {
                continueCalculation = false;
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            else {
                int user_input= Integer.parseInt(operation);
                System.out.println("Please Enter the first Number :");
                int num1 = scanner.nextInt();
                System.out.println("Please Enter the second Number :");
                int num2 = scanner.nextInt();
                int result = 0;

                switch (user_input) {
                    case 1:
                        result = sum(num1, num2);
                        System.out.println("Resulted Sum :" + result);
                        break;

                    case 2:
                        result = subtraction(num1, num2);
                        System.out.println("Resulted Subtraction :" + result);
                        break;

                    case 3:
                        result = multiplication(num1, num2);
                        System.out.println("Resulted Multiplication :" + result);
                        break;

                    case 4:
                        result = divsion(num1, num2);
                        System.out.println("Resulted Division :" + result);
                        break;

                    default:
                        System.out.println("Please provide valid inputs");

                }
            }
        }
    }

    public static int sum(int num1, int num2) {
        int result = 0;
        return result = num1 + num2;
    }

    public static int multiplication(int num1, int num2) {
        int result = 0;
        return result = num1 * num2;
    }

    public static int subtraction(int num1, int num2) {
        int result = 0;
        return result = num1 - num2;
    }

    public static int divsion(int num1, int num2) {
        int result = 0;
        return result = num1 / num2;
    }

}
