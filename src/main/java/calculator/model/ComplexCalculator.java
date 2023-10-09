package calculator.model;


import calculator.model.imp.ComplexCalculable;

public class ComplexCalculator implements ComplexCalculable {

    @Override
    public ComplexNum summary(ComplexNum c1, ComplexNum c2) {
        double newReal = c1.getReal() + c2.getReal();
        double newImage = c1.getImage() + c2.getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public ComplexNum subtraction(ComplexNum c1, ComplexNum c2) {
        double newReal = c1.getReal() - c2.getReal();
        double newImage = c1.getImage() - c2.getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public ComplexNum multiplication(ComplexNum c1, ComplexNum c2) {
        double newReal = c1.getReal() * c2.getReal() - c1.getImage() * c2.getImage();
        double newImage = c1.getImage() * c2.getReal() + c1.getReal() * c2.getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public ComplexNum division(ComplexNum c1, ComplexNum c2) {
        double newReal = (c1.getReal() * c2.getReal() + c1.getImage() * c2.getImage()) /
                (c2.getReal()*c2.getReal() + c2.getImage()*c2.getImage());
        double newImage = (c1.getImage() * c2.getReal() - c1.getReal() * c2.getImage()) /
                (c2.getReal()*c2.getReal() + c2.getImage()*c2.getImage());
        return new ComplexNum(newReal, newImage);
    }
}
