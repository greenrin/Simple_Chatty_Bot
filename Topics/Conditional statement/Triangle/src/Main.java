import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        if (a >= b && a >= c){
            System.out.println((b + c) > a ? "YES" : "NO");
        }
        else if (b >= a && b >= c){
            System.out.println((a + c) > b ? "YES" : "NO");
        }
        else if (c >= a && c >= b){
            System.out.println((b + a) > c ? "YES" : "NO");
        }

    }
}