import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void calculate() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x с плавающей запятой");
        double x = in.nextDouble();
        System.out.println("Введите число y с плавающей запятой");
        double y = in.nextDouble();
        System.out.println("Введите операцию");
        char operand = (char) System.in.read();
        switch (operand) {
            case '+':
                System.out.printf("Результат %.4f", (x + y));
                break;
            case '-':
                System.out.printf("Результат %.4f", (x - y));
                break;
            case '*':
                System.out.printf("Результат %.4f", (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.printf("Результат %.4f", (x / y));
                } else {
                    System.out.println("Нельзя разделить на 0");
                }
                break;
        }
    }
}