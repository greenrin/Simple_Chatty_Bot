import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int horz = Math.abs(x1 - x2);
        int vert = Math.abs(y1 - y2);
        if (horz == vert || horz == 0 || vert == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}