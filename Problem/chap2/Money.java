import java.util.Scanner;
public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money, yellow = 0, green = 0, blue = 0, hundred = 0, fifty = 0, ten = 0, one = 0;

        System.out.print("금액을 입력하세요>> ");
        money = scanner.nextInt();

        if ((money / 50000) >= 1) {
            yellow = money / 50000;
            money %= 50000;
        }

        if ((money / 10000) >= 1) {
            green = money / 10000;
            money %= 10000;
        }

        if ((money / 1000) >= 1) {
            blue = money / 1000;
            money %= 1000;
        }

        if ((money / 100) >= 1) {
            hundred = money / 100;
            money %= 100;
        }

        if ((money / 50) >= 1) {
            fifty = money / 50;
            money %= 50;
        }

        if ((money / 10) >= 1) {
            ten = money / 10;
            one = money % 10;
        }

        System.out.println("오만원권 " + yellow + "매");
        System.out.println("만원권 " + green + "매");
        System.out.println("천원권 " + blue + "매");
        System.out.println("백원 " + hundred + "개");
        System.out.println("오십원 " + fifty + "개");
        System.out.println("십원 " + ten + "개");
        System.out.println("일원 " + one + "개");

        scanner.close();
    }
}
