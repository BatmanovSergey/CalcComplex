package calculator.model.imp;

import calculator.model.ComplexNum;

public interface ComplexCalculable {
    ComplexNum summary(ComplexNum comp1, ComplexNum comp2);
    ComplexNum  subtraction (ComplexNum comp1, ComplexNum comp2);
    ComplexNum  multiplication(ComplexNum comp1, ComplexNum comp2);
    ComplexNum  division(ComplexNum comp1, ComplexNum comp2);
}
