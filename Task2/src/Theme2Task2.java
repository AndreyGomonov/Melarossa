import java.util.Scanner;

public class Theme2Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        if (number <= 0 || number > 24) {
            System.out.println("Неверное число!");
        } else if (number <= 6) {
            System.out.println("Уже ночь!");
        } else if (number <= 12) {
            System.out.println("Доброе утро!");
        } else if (number <= 18) {
            System.out.println("Добрый день!");
        } else if (number < 24) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Уже ночь!");
        }
    }
}






