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
            // Задание №3 - Сладкий подарок
        Candy candy1 = new Candy("Mars", 20.5, 50);
        Candy candy2 = new Candy();
        candy2.setWeight(40);
        candy2.setPrice(10.1);
        candy2.setBrand("Skittles");
        Jellybean jellybean1 = new Jellybean("Oreo", 65.6, 105);
        Jellybean jellybean2 = new Jellybean();
        jellybean2.setWeight(30);
        jellybean2.setBrand("M&Ms");
        jellybean2.setPrice(10.5);
        Sweets[] box = {candy1, candy2, jellybean1, jellybean2};
        System.out.println("В подарке собрано: ");
        double priceSum = 0;
        int weightSum = 0;
        for (Sweets someSweets : box) {
            System.out.println(someSweets.toString());
            priceSum += someSweets.getPrice();
            weightSum += someSweets.getWeight();
        }
        System.out.printf("Стоимость подарка: %.2f \nВес подарка: %d", priceSum, weightSum);
    }
}
