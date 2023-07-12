import java.util.Scanner;

public class DividByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend;
        int divisor;

        System.out.print("나뉨수 입력: ");
        dividend = scanner.nextInt();
        System.out.print("나눗수 입력: ");
        divisor = scanner.nextInt();
        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");

        scanner.close();
    }
}
