package calculator.model;

import calculator.model.imp.Calculable;

public class IntCalculator implements Calculable<Integer> {
    private int num;
    public IntCalculator(int num) {
        this.num = num;
    }

    @Override
    public Integer summary(Integer i, Integer y) {
        return null;
    }

    @Override
    public Integer subtraction(Integer i, Integer y) {
        return null;
    }

    @Override
    public Integer multiplication(Integer i, Integer y) {
        return null;
    }

    @Override
    public Integer division(Integer i, Integer y) {
        return null;
    }
}
