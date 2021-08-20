import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int current;
        for (int i = 0; i < n; i++) {
            current = in.nextInt();
            if (current == 2){
                d ++;
            }
            if (current == 3){
                c++;
            }
            if (current == 4){
                b++;
            }
            if (current == 5){
                a++;
            }
        }
        System.out.println(d+" "+c+" "+b+" "+a);
    }
}