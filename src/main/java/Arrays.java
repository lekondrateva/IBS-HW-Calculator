import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void findTheLongestElement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        // считываем перевод строки
        in.nextLine();
        String[] myArray = new String[size];
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение элемента массива №" + (i + 1));
            myArray[i] = in.nextLine();
            if (myArray[i].length() > maxLength) {
                maxLength = myArray[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное слово в массиве: " + myArray[index] + " элемент массива № " + (index + 1));
        in.close();
    }

    public static int[] fillArrayRandomly() {
        int[] myArray = new int[20];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(21) - 10;
            System.out.print(myArray[i] + "  ");
        }
        return myArray;
    }

    public static void findMaxMinAndReplace(int[] array) {
        int posMin = 10;
        int negMax = -10;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] > negMax) {
                    negMax = array[i];
                    indexMax = i;
                }
            } else if (array[i] > 0) {
                if (array[i] < posMin) {
                    posMin = array[i];
                    indexMin = i;
                }
            }
        }
        System.out.println("\nМаксимальный отрицательный элемент массива = " + negMax + " с индексом: " + indexMax);
        System.out.println("Минимальный положительный элемент массива = " + posMin + " с индексом: " + indexMin);
        // перестановка значений
        int buf = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = buf;
        System.out.println("Массив после перестановки значений: ");
        for (int i : array) System.out.print(i + "  ");
    }
}
