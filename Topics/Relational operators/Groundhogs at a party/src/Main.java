import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean weekendResult = 15 <= count && count <= 25 && isWeekend;
        boolean regularResult = 10 <= count && count <= 20 && !isWeekend;
        System.out.println(weekendResult || regularResult);
    }
}