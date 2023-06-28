import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1, side2, side3;

        System.out.print("정수 3개를 입력하세요>> ");
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        side3 = scanner.nextInt();

        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
            System.out.println("삼각형이 됩니다.");
        } else {
            System.out.println("삼각형이 되지 않습니다.");
        }

        scanner.close();
    }
}
