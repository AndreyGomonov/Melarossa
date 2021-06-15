public class T1Z7 {
    public static final int PERCENT = 2;

    public static void main(String[] args) {
        int s = 5000;
        int d = 365;
        int y = 730;
        int y2 = 730;
        double j = (s * PERCENT * d / y) / 100;
        System.out.println(j);

    }
}
