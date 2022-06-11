import java.io.IOException;
import java.util.Scanner;

/**
 * @author Kondratyeva Lena
 * @see Calculator#calculate()
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи: (1 - калькулятор, 2 - поиск наибольшего слова в массиве)");
        int task = in.nextInt();
        if (task == 1) {
            // Задание №1 - Калькулятор
            Calculator.calculate();
        } else if (task == 2) {
            Arrays.findTheLongestElement();
        } else System.out.println("Не удается распознать номер задачи, допустимы значения 1 или 2");
    }
}
