import java.util.Scanner; // импорт сканера

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // добавляет модуль сканера, чтобы вводить с клавиатуры
        final int second = scanner.nextInt(); // считывает ввод с клавиатуры
        int days = second / 86400;
        int hours = (second % 86400) / 3600;
        int mins = (second % 3600) / 60;
        System.out.println(("Дни " + days + " Часы " + hours + " Минуты " + mins + " Секунды " + second % 60));

    }
}
