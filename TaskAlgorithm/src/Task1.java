public class Task1 {

    public static void main(String[] args) {

        int[] someEquals = new int[] {1, -2, 10, 17, -7, 0, 3, -4, -2, 4, 10};
        boolean flag = false;
        int sum = 0;

        System.out.println(someEquals.length);

        for (int i = 0; i < someEquals.length; i++){
            if (someEquals[i] == 0){
                flag = true;
            }
            if (flag & someEquals[i] > 0){
                sum += someEquals[i];
            }
        }
        System.out.println(sum);



    }
}
