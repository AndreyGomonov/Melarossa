public class T1Z5 {
    public static void main(String[] args) {
        final int Radius = 5; // это константа (неизменная переменная)
        double s = Math.PI * Math.pow(Radius, 2); // задаём s, где s - площадь окружности
        double l = 2 * Math.PI * Radius; // задаём l, где l - длина окружности
        System.out.println(s);
        System.out.println(l);
    }
}
