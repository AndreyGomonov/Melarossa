public class Main {
    public static void main(String args[]) {

        int a = 2;
        int b = 4;
        double c = 3.2;
        double d = 5.5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        double g = (4 * Math.pow(Math.PI, 2) * Math.pow(a, 3)) / (Math.pow(Math.PI, 2) * (c + d));
        System.out.println(g);
    }
}

