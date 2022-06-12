import java.io.IOException;
import java.util.Scanner;

/**
 * @author Kondratyeva Lena
 * @see Calculator#calculate() калькулятор с 4 операциями (+, -, *, /).
 * @see Arrays#fillArrayRandomly() заполняет массив рандомными значениями от -10 до 10 и выводит его в консоль.
 * @see Arrays#findMaxMinAndReplace(int[] array) находит минимальный положительный и минимальный отрицательный элементы массива,
 * меняет их местами и выводит получившийся массив в консоль.
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
            // Задание №3 - Массив
        Arrays.findMaxMinAndReplace(Arrays.fillArrayRandomly());
    }
}
