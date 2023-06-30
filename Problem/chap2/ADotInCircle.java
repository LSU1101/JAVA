import java.util.Scanner;
public class ADotInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>> ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double radius = scanner.nextDouble();

        System.out.print("점 입력>> ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2)); // sqrt = 루트, pow = 제곱

        if (radius > distance) {
            System.out.println("점 (" + x2 + ", " + y2 + ")는 원 안에 있습니다.");
        } else {
            System.out.println("점 (" + x2 + ", " + y2 + ")는 원 밖에 있습니다.");
        }

        scanner.close();
    }
}
