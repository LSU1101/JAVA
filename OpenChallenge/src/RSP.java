import java.util.Scanner;
public class RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winner = -1; // 1 = A win, 2 = B win, 0 = draw, -1 = error
        String playerA, playerB;
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");

        System.out.print("철수 >> ");
        playerA = scanner.next();
        System.out.print("영희 >> ");
        playerB = scanner.next();

        if (playerA.equals("가위")) {
            switch (playerB) {
                case "가위": // k
                    winner = 0; // draw
                    break;
                case "바위":
                    winner = 2; // B win
                    break;
                case "보":
                    winner = 1; // A win
                    break;
                default:
                    winner = -1; // error
                    break;
            }
        } else if (playerA.equals("바위")) {
            switch (playerB) {
                case "가위":
                    winner = 1; // A win
                    break;
                case "바위":
                    winner = 0; // draw
                    break;
                case "보":
                    winner = 2; // B win
                    break;
                default:
                    winner = -1; // error
                    break;
            }
        } else if (playerA.equals("보")) {
            switch (playerB) {
                case "가위":
                    winner = 2; // B win
                    break;
                case "바위":
                    winner = 1; // A win
                    break;
                case "보":
                    winner = 0; // draw
                    break;
                default:
                    winner = -1; // error
                    break;
            }
        }

        if (winner == 1) {
            System.out.println("철수가 이겼습니다.");
        } else if (winner == 2) {
            System.out.println("영희가 이겼습니다.");
        } else {
            System.out.println("에러");
        }

        scanner.close();
    }
}
