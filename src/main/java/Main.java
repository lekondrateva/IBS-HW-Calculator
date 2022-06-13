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
        in.close();
        // Задание №3 - Массив
        Arrays.findMaxMinAndReplace(Arrays.fillArrayRandomly());
        // Задание №3 - Сладкий подарок
        Candy candy1 = new Candy("Mars", 20.5, 50, "Belgium");
        Candy candy2 = new Candy();
        candy2.setCountry("USA");
        candy2.setPrice(10.1);
        candy2.setBrand("Skittles");
        candy2.setWeight(30);
        Jellybean jellybean1 = new Jellybean("Oreo", 65.6, 105, "Apple");
        Jellybean jellybean2 = new Jellybean();
        jellybean2.setWeight(30);
        jellybean2.setBrand("M&Ms");
        jellybean2.setPrice(10.5);
        jellybean2.setTaste("Lemon");
        Cake cake1 = new Cake("Mirrel", 100.20, 700, 400);
        Cake cake2 = new Cake();
        cake2.setWeight(400);
        cake2.setBrand("AlpenGold");
        cake2.setPrice(70.63);
        cake2.setCcal(352);
        Sweets[] box = {candy1, candy2, jellybean1, jellybean2, cake1, cake2};
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
