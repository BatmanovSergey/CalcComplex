package calculator.model;

import calculator.model.imp.ComplexCalculable;

public class IntCalculator implements ComplexCalculable {
    private int num;

    public IntCalculator(int num) {
        this.num = num;
    }


    @Override
    public ComplexNum summary(ComplexNum comp1, ComplexNum comp2) {
        return null;
    }

    @Override
    public ComplexNum multiplication(ComplexNum comp1, ComplexNum comp2) {
        return null;
    }

    @Override
    public ComplexNum division(ComplexNum comp1, ComplexNum comp2) {
        return null;
    }
}
