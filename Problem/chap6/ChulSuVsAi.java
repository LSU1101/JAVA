import java.util.Scanner;

public class ChulSuVsAi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input;
            int computer = (int)(Math.random() * 3 + 1);
            String chulsu, computerInput = "null";
            boolean chulsuWin = true;

            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>> ");
            input = scanner.nextInt();

            if (input == 1) {
                chulsu = "가위";
                if (computer == 1) {
                    computerInput = "가위";
                    System.out.println("철수(" + chulsu + ") : 컴퓨터(" + computerInput + ")\n비겼습니다.");
                    continue;
                }
                if (computer == 2) {
                    computerInput = "바위";
                    chulsuWin = false;
                } else if (computer == 3) {
                    computerInput = "보";
                    chulsuWin = true;
                }
            } else if (input == 2) {
                chulsu = "바위";
                if (computer == 1) {
                    computerInput = "가위";
                    chulsuWin = true;
                } else if (computer == 2) {
                    computerInput = "바위";
                    System.out.println("철수(" + chulsu + ") : 컴퓨터(" + computerInput + ")\n비겼습니다.");
                    continue;
                } else if (computer == 3) {
                    computerInput = "보";
                    chulsuWin = false;
                }
            } else if (input == 3) {
                chulsu = "보";
                if (computer == 1) {
                    computerInput = "가위";
                    chulsuWin = false;
                } else if (computer == 2) {
                    computerInput = "바위";
                    chulsuWin = true;
                } else if (computer == 3) {
                    computerInput = "보";
                    System.out.println("철수(" + chulsu + ") : 컴퓨터(" + computerInput + ")\n비겼습니다.");
                    continue;
                }
            } else if (input == 4) {
                break;
            } else {
                System.out.println("다시 입력");
                continue;
            }

            if (chulsuWin) {
                System.out.println("철수(" + chulsu + ") : 컴퓨터(" + computerInput + ")\n철수가 이겼습니다.");
            } else {
                System.out.println("철수(" + chulsu + ") : 컴퓨터(" + computerInput + ")\n컴퓨터가 이겼습니다.");
            }
        }
        scanner.close();
    }
}
