package com.zipcodewilmington.scientificcalculator;

import com.sun.deploy.security.SelectableSecurityManager;

/**
 * Created by Sandy Pham 10/20/19.
 */
public class MainApplication {
    public static void main(String[] args) {
        double answer;

        CoreFunctions simpleMath = new CoreFunctions();
        Console.println("Welcome to cohort5.2 calculator!");
        //String answerOne = Console.getStringInput("simple calculator (+ , - , *, /, square root, power, square), OR scientific calculator?");

        //while (answerOne == "scientific calculator");




        Double num1 = Console.getDoubleInput("Enter first number:");
        Console.println("First number is %s", num1);

        String operation = Console.getStringInput("Enter second number or an operation (p for power, ^ for square, r for square root) For scientific calculator enter 'science'.");
        Double num2 = Console.getDoubleInput("Enter second number (+, -, *, /, p for power, ^ for square, r for square root) For scientific calculator enter 'science'.");





            switch (operation) {

                    case "+":
                        answer = simpleMath.add(num1, num2);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case "-":
                        answer = simpleMath.subtract(num1, num2);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case "*":
                        answer = simpleMath.multiply(num1, num2);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case "/":
                        if (num2 == 0) {
                            System.out.println("Err");
                        } else {
                            answer = simpleMath.divide(num1, num2);
                            System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                            break;
                        }

                    case "p":
                        answer = simpleMath.power(num1, num2);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case "r":
                        answer = simpleMath.squareRt(num1);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case "^":
                        answer = simpleMath.square(num1);
                        System.out.println("" + num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);
                        break;
                }


            }
        }
