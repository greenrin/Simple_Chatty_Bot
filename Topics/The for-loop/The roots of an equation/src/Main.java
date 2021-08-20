import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int i = 0;
        for (int x = 0; x <= 1000 ; x++) {
            if ((a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d) == 0){
                System.out.println(x);
                i++;
                if (i == 3){
                    break;
                }
            }
        }

    }
}