public class Multiples {
    public static void main(String[] args) {
        int N = 1000;
        int i = 1;
        int n = 0;

        while (i <= N){
            if (i % 3 == 0 || i % 5 == 0) {
                n++;
            }
            i++;
        }
        System.out.println(n);
    }
}