package com.zipcodewilmington.scientificcalculator;

/**
 * Created by Valentin on 10/19/19.
 *
 * This will contain all the logic for the scientific part of the calculator
 */

public class ScientificCalculator {

    public double calculateSineRad(double nrSine) {

        return Math.sin(nrSine);
    }

    public double calculateSineDeg(double nrSine) {

        return Math.sin(Math.toRadians(nrSine));
    }

    public double calculateCosineRad(double nrCosine) {

        return Math.cos(nrCosine);
    }

    public double calculateCosineDeg(double nrCosine) {

        return Math.cos(Math.toRadians(nrCosine));
    }

    public double inverseSine(double arcNumber) {

        // input needs to be between -1 and 1
        return Math.asin(arcNumber);
    }

    public double inverseCosine(double arcNumber) {

        // input needs to be between -1 and 1
        return Math.acos(arcNumber);
    }

    public double calculateTangent(double tanNumber) {

        return Math.tan(tanNumber);
    }

    public double inverseTangent(double tanNumber) {

        return Math.atan(tanNumber);
    }



    public double calcLog(double lgNumber) {
        // needs to be greater than zero; base e
        /* If the argument is NaN or less than zero, then the result is NaN.
If the argument is positive infinity, then the result is positive infinity.
If the argument is positive zero or negative zero, then the result is negative infinity.*/
        return Math.log10(lgNumber);
    }

    public double calculateInverseLog(double lgNumber) {
        return 1 / (calcLog(lgNumber));
    }
    //I think inverse log is the same as number to the power of x;

    public double calculateNatLogarithm(double lgNumber) {

        return Math.log(lgNumber);
    }

    public double calculateInverseNaturalLog(double lgNumber)   {
        return 1 / (calculateNatLogarithm(lgNumber));
    }

    public double calculateExponent(double baseNumber, double expNumber) {

        return Math.pow(baseNumber, expNumber);
    }

    public int calculateFactorial(int factNumber) {
        int calcNumber = 1;
        for (int i=1; i<=factNumber; i++){
            calcNumber = calcNumber * i;
        }
        return calcNumber;
    }


}

