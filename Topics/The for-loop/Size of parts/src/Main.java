import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zero = 0;
        int unit = 0;
        int negativeUnit = 0;
        int current;
        for (int i = 0; i < n; i++) {
            current = in.nextInt();
            if (current == 0){
                zero ++;
            }
            if (current == 1){
                unit++;
            }
            if (current == -1){
                negativeUnit++;
            }
        }
        System.out.println(zero+" "+unit+" "+negativeUnit);

    }
}