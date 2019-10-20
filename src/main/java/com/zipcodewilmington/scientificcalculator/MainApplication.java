package com.zipcodewilmington.scientificcalculator;

/**
 * Created by Sandy Pham 10/20/19.
 */
public class MainApplication {
    public static void main(String[] args) {
        double answer;

        CoreFunctions simpleMath = new CoreFunctions();
        Console.println("Welcome to cohort5.2 calculator!");
        Double num1 = Console.getDoubleInput("Enter first number:");
        Console.println("First number is %s", num1);

        Double num2 = Console.getDoubleInput("Enter second number or an operation (+, -, *, /, ^ for square, x for square root) For scientific calculator enter 'science'.");
        String operation = Console.getStringInput("What operation? (+, -, *, /, ^ for square, x for square root) For scientific calculator enter 'science'.");
        char cases = operation.charAt(0);
       while (num2 == cases) {
            do switch (cases) {
                if (num2 != cases) {


                continue;
                //Console.println("Your numbers are %s", num1 + " " + "and" + " " + num2);


            } switch (cases) {

                case '+':
                    answer = simpleMath.add(num1, num2);
                    System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                    break;

                case '-':
                    answer = simpleMath.subtract(num1, num2);
                    System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                    break;

                case '*':
                    answer = simpleMath.multiply(num1, num2);
                    System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Err");
                    } else {
                        answer = simpleMath.divide(num1, num2);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;
                    }

            }

        }

    }