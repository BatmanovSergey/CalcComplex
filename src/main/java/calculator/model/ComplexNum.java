package calculator.model;

public class ComplexNum {
    double real;
    double image;

    public ComplexNum(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public void print() {
        if (image > 0) {
            if (real == 0) {
                System.out.println(image + "i");
            } else {
                System.out.println(real + "+" + image + "i");
            }
        } else if (image < 0) {
            if (real == 0) {
                System.out.println(image + "i");
            } else {
                System.out.println(real + "" + image + "i");
            }
        } else {
            System.out.println(real);
        }
    }
}