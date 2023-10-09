package calculator.view;

import calculator.controller.Controller;
import java.util.Scanner;
import java.util.logging.Level;

import static calculator.Main.log;

public class CalcView {
    private final Controller controller;
    public CalcView(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        while (true) {
            try {
                double a1real = promptDouble("Введите действительную часть первого аргумента: ");
                double a1image = promptDouble("Введите мнимую часть первого аргумента: ");

                String cmd = prompt("Введите команду (+, -, *, /) : ");

                switch (cmd) {
                    case "+" -> {
                        double a2real = promptDouble("Введите действительную часть второго аргумента: ");
                        double a2image = promptDouble("Введите мнимую часть второго аргумента: ");
                        log.log(Level.INFO, "Сложение комплексных чисел выполнено!");
                        controller.sum(a1real, a1image, a2real, a2image).print();
                    }
                    case "-" -> {
                        double a2real = promptDouble("Введите действительную часть второго аргумента: ");
                        double a2image = promptDouble("Введите мнимую часть второго аргумента: ");
                        log.log(Level.INFO, "Вычитание комплексных чисел выполнено!");
                        controller.sub(a1real, a1image, a2real, a2image).print();
                    }
                    case "*" -> {
                        double a2real = promptDouble("Введите действительную часть второго аргумента: ");
                        double a2image = promptDouble("Введите мнимую часть второго аргумента: ");
                        log.log(Level.INFO, "Умножение комплексных чисел выполнено!");
                        controller.multi(a1real, a1image, a2real, a2image).print();

                    }
                    case "/" -> {
                        double a2real = promptDouble("Введите действительную часть второго аргумента: ");
                        double a2image = promptDouble("Введите мнимую часть второго аргумента: ");
                        log.log(Level.INFO, "Деление комплексных чисел выполнено!");
                        controller.div(a1real, a1image, a2real, a2image).print();
                    }
                    default -> throw new RuntimeException();
                }
                String message = prompt("Произвести ещё вычисление? (y/n)?");
                if (message.equals("y")) {
                    continue;
                }
                break;
            } catch (RuntimeException e) {
                log.log(Level.WARNING, "Ошибка ввода данных!\n");
                System.out.println("Ошибка ввода данных. Повторите попытку!!!");
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
