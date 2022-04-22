public class Fibonacchi {
    public static void main(String[] args) {
        int n = 15;
        int[] fib = new int [n];
        fib[0] = 0;
        fib[1] = 1;
        System.out.println(fib[0]);
        System.out.println(fib[1]);

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
    }
}
