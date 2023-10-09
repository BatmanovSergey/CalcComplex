package calculator.controller;

import calculator.model.ComplexCalculator;
import calculator.model.ComplexNum;

public class Controller {
    private final ComplexCalculator complexCalculator;

    public Controller(ComplexCalculator complexCalculator) {

        this.complexCalculator = complexCalculator;
    }

    public ComplexNum sum(double a1real, double a1image, double a2real, double a2image) {

        ComplexNum comp1 = new ComplexNum(a1real, a1image);
        ComplexNum comp2 = new ComplexNum(a2real, a2image);
        return complexCalculator.summary(comp1, comp2);
    }

    public ComplexNum sub(double a1real, double a1image, double a2real, double a2image) {
        ComplexNum comp1 = new ComplexNum(a1real, a1image);
        ComplexNum comp2 = new ComplexNum(a2real, a2image);
        return complexCalculator.subtraction(comp1, comp2);
    }

    public ComplexNum multi(double a1real, double a1image, double a2real, double a2image) {
        ComplexNum comp1 = new ComplexNum(a1real, a1image);
        ComplexNum comp2 = new ComplexNum(a2real, a2image);
        return complexCalculator.multiplication(comp1, comp2);
    }

    public ComplexNum div(double a1real, double a1image, double a2real, double a2image){
        ComplexNum comp1 = new ComplexNum(a1real, a1image);
        ComplexNum comp2 = new ComplexNum(a2real, a2image);
        return complexCalculator.division(comp1, comp2);
    }
}
