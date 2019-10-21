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
        do {
            Integer answerOne = Console.getIntegerInput("Simple or science calculator? \n" +
                    "1.) Simple\n" +
                    "2.) Science\n" +
                    "3.) Turn off calculator\n");
            Integer operation;

            if (answerOne == 1) {


                operation = Console.getIntegerInput("Enter the number corresponding to the operation:\n" +
                        "1.) Addition \n" +
                        "2.) Subtraction \n" +
                        "3.) Multiplication \n" +
                        "4.) Division \n" +
                        "5.) Power of\n" +
                        "6.) Square of\n" +
                        "7.) Square Root\n" +
                        "8.) Invert\n" +
                        "9.) Inverse\n" +
                        "10.) go back!\n");


                switch (operation) {

                    case 1:
                        Double num1 = Console.getDoubleInput("Enter first number:");
                        Double num2 = Console.getDoubleInput("Enter second number:");
                        answer = simpleMath.add(num1, num2);
                        System.out.println("" + num1 + " " + "+" + " " + num2 + " " + "=" + " " + answer);

                        break;

                    case 2:
                        num1 = Console.getDoubleInput("Enter first number:");
                        num2 = Console.getDoubleInput("Enter second number:");
                        answer = simpleMath.subtract(num1, num2);
                        System.out.println("" + num1 + " " + "-" + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case 3:
                        num1 = Console.getDoubleInput("Enter first number:");
                        num2 = Console.getDoubleInput("Enter second number:");
                        answer = simpleMath.multiply(num1, num2);
                        System.out.println("" + num1 + " " + "*" + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case 4:
                        num1 = Console.getDoubleInput("Enter first number:");
                        num2 = Console.getDoubleInput("Enter second number:");
                        if (num2 == 0) {
                            System.out.println("Err");
                        } else {
                            num1 = Console.getDoubleInput("Enter first number:");
                            num2 = Console.getDoubleInput("Enter second number:");
                            answer = simpleMath.divide(num1, num2);
                            System.out.println("" + num1 + " " + "/" + " " + num2 + " " + "=" + " " + answer);
                            break;
                        }

                    case 5:
                        num1 = Console.getDoubleInput("Enter first number:");
                        num2 = Console.getDoubleInput("Enter second number:");
                        answer = simpleMath.power(num1, num2);
                        System.out.println("" + num1 + " " + "^" + " " + num2 + " " + "=" + " " + answer);
                        break;

                    case 6:
                        num1 = Console.getDoubleInput("Enter first number:");
                        answer = simpleMath.squareRt(num1);
                        System.out.println("Square root of " + num1 + " " + "=" + " " + answer);
                        break;

                    case 7:
                        num1 = Console.getDoubleInput("Enter first number:");
                        answer = simpleMath.square(num1);
                        System.out.println(num1 + " " + "squared " + " " + "=" + " " + answer);
                        break;

                    case 8:
                        num1 = Console.getDoubleInput("Enter first number:");
                        answer = simpleMath.invertSign(num1);
                        System.out.println(answer);
                        break;

                    case 9:
                        num1 = Console.getDoubleInput("Enter first number:");
                        answer = simpleMath.inverse(num1);
                        System.out.println("Inverse of " + num1 + " " + "is " + answer);
                        break;

                    case 10:
                        if (operation == 10) ;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                }

            } else if (answerOne == 2) {
                ScientificCalculator scientific = new ScientificCalculator();
                Integer degreeOrRadian = Console.getIntegerInput("1.) Degree\n" + "2.) Radian\n");
                operation = Console.getIntegerInput("Enter the number corresponding to the operation:\n" +
                        "1.) Sine \n" +
                        "2.) Cosine \n" +
                        "3.) Tangent \n" +
                        "4.) Inverse Sine \n" +
                        "5.) Inverse Cosine\n" +
                        "6.) Inverse Tangent\n" +
                        "7.) Log\n" +
                        "8.) Inverse Log\n" +
                        "9.) Natural Log\n" +
                        "10. Inverse Natural Log\n" +
                        "11.) Exponent\n" +
                        "12.) Factorial\n" +
                        "13.) go back!");


                switch (operation) {

                    case 1:
                        double num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calculateSineDeg(num1) : scientific.calculateSineRad(num1));
                        break;

                    case 2:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calculateCosineDeg(num1) : scientific.calculateCosineRad(num1));
                        break;

                    case 3:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calculateTangentDeg(num1) : scientific.calculateTangentRad(num1));
                        break;

                    case 4:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.inverseSineDeg(num1) : scientific.inverseSineRad(num1));
                        break;


                    case 5:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.inverseCosineRDeg(num1) : scientific.inverseCosineRad(num1));
                        break;

                    case 6:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.inverseTangentDeg(num1) : scientific.inverseTangentRad(num1));
                        break;

                    case 7:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calcLogDegree(num1) : scientific.calcLog(num1));
                        break;

                    case 8:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calculateInverseLogDegree(num1) : scientific.calculateInverseLog(num1));
                        break;

                    case 9:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calculateNatLogarithmDegree(num1) : scientific.calculateNatLogarithm(num1));
                        break;

                    case 10:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(degreeOrRadian == 1 ? scientific.calculateInverseNaturalLogDegree(num1) : scientific.calculateInverseNaturalLog(num1));
                        break;

                    case 11:
                        num1 = Console.getDoubleInput("Enter first number:");
                        double num2 = Console.getDoubleInput("Enter second number:");
                        System.out.println(scientific.calculateExponent(num1, num2));
                        break;
                    case 12:
                        num1 = Console.getDoubleInput("Enter first number:");
                        System.out.println(scientific.calculateFactorial(num1));
                        break;


                }
            }else if(answerOne == 3){
                break;
            }
            else {
                System.out.println("Error! Enter another option! :(");
            }
        }while(true);


        // String radianOrDegree = Console.getStringInput("1.) Radian \n" + "2.) Degrees\n");
        //if (radianOrDegree.equals("1")){


        // Console.println("1.) ")

        // }
        // else

        // String answerTwo = Console.getStringInput("")
    }
}







