public class T1Z3 {
    public static void main(String args[]) {
        double n = 345.49;
        double x = Math.round(n); // округляет математически и только к целому числу
        double y = Math.floor(n); // округляет к низшему числу
        double g = Math.ceil(n); // округляет к высшему числу (например из 345 выбррал 346)
        System.out.println(x);
        System.out.println(y);
        System.out.println(g);

    }
}
