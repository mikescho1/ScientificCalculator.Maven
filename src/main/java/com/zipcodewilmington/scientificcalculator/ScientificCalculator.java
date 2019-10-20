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


    public double inverseSineRad(double arcNumber) {

        // input needs to be between -1 and 1
        return Math.asin(arcNumber);
    }

    public double inverseSineDeg(double arcNumber) {

        // input needs to be between -1 and 1
        return Math.toDegrees(Math.asin(arcNumber));
    }

    public double inverseCosineRad(double arcNumber) {

        // input needs to be between -1 and 1
        return Math.acos(arcNumber);
    }

    public double inverseCosineRDeg(double arcNumber) {

        // input needs to be between -1 and 1
        return Math.toDegrees(Math.acos(arcNumber));
    }

    public double calculateTangentRad(double tanNumber) {

        return Math.tan(tanNumber);
    }

    public double calculateTangentDeg(double tanNumber) {

        return Math.toDegrees(Math.tan(tanNumber));
    }

    public double inverseTangentRad(double tanNumber) {

        return Math.atan(tanNumber);
    }

    public double inverseTangentDeg(double tanNumber) {

        return Math.toDegrees(Math.atan(tanNumber));
    }

    public double calculateLog(double lgNumber) {
        // needs to be greater than zero; base e
        return Math.log(lgNumber);
    }

    public String calculateInverseLog() {
        return null;
    }

    public double calculateNatLogarithm(double numberLG) {

        return Math.log1p(numberLG);
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

