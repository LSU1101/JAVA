import java.util.Scanner;

public class StringArrayEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String intput;
        System.out.print(">> ");
        intput = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(intput);

        while (true) {
            String command;
            System.out.print("명령: ");
            command = scanner.nextLine();
            if (command.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }

            String[] splitCommand = command.split("!");
            if (splitCommand.length != 2) {
                System.out.println("잘못된 명령입니다!!!!!!!!!!");
                continue;
            }
            if (splitCommand[0].length() == 0 || splitCommand[1].length() == 0) {
                System.out.println("잘못된 명령입니다!!!!!!!!!!");
                continue;
            }

            int index = stringBuffer.indexOf(splitCommand[0]);
            if (index == -1) {
                System.out.println("찾을 수 없습니다!!!!!!!!!!!");
                continue;
            }

            stringBuffer.replace(index, index + splitCommand[0].length(), splitCommand[1]);
            System.out.println(stringBuffer);

        }
        scanner.close();
    }
}
