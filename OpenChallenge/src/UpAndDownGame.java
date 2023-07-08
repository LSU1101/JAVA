import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class UpAndDownGame {
    static Scanner scanner = new Scanner(System.in);

    public static boolean Menu() {
        String inputMenu;
        while (true) {
            System.out.print("다시하시겠습니까? (y/n)>> ");
            inputMenu = scanner.next();

            if (inputMenu.equals("y")) {
                return true;
            } else if (inputMenu.equals("n")) {
                return false;
            } else {
                System.out.println("잘못된 입력.");
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        do {
            int min = 0, max = 99;
            int answer = random.nextInt(max + 1);
            int input, count = 1;

            System.out.println("수를 결정하였습니다. 맞추어 보세요!");

            while (true) {
                try {
                    System.out.println(min + "-" + max);
                    System.out.print(count + ">> ");
                    input = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("입력된 값은 정수가 아닙니다. ");
                    scanner.nextLine(); // 삭제
                    continue;
                }

                if (answer == input) {
                    System.out.println("맞았습니다.");
                    break;
                } else if (answer > input) {
                    System.out.println("더 높게");
                    if (input > min) {
                        min = input;
                    }
                } else {
                    System.out.println("더 낮게");
                    if (input < max) {
                        max = input;
                    }
                }
                count++;
            }

        } while (Menu());
    }

}
