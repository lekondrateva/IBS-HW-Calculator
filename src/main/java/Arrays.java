import java.util.Scanner;

public class Arrays {
    public static void findTheLongestElement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        //считываем перевод строки
        in.nextLine();
        String[] myArray = new String[size];
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение элемента массива №" + (i + 1));
//            String buf = in.nextLine();
            myArray[i] = in.nextLine();
            if (myArray[i].length() > maxLength) {
                maxLength = myArray[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное слово в массиве: " + myArray[index] + " элемент массива № " + (index + 1));
    }
}
