import java.util.Scanner;

public class Histogram {
    String readString() {
        Scanner scanner = new Scanner(System.in);

        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals(";")) {
                break;
            }
            stringBuffer.append(line);
        }
        scanner.close();
        return stringBuffer.toString();
    }

    int[] count(String input) {
        int[] alphabetCount = new int[26];

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabetCount.length; j++) {
                if (input.charAt(i) == j + 65 || input.charAt(i) == j + 97) { //대문자 또는 소문자
                    alphabetCount[j]++;
                }
            }
        }
        return alphabetCount;
    }

    void printHistogram(int[] count) {
        System.out.println("히스토그램을 그립니다.");
        for (int i = 0; i < count.length; i++) {
            System.out.print((char)('A' + i));
            for (int j = 0; j < count[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    void run() {
        String input = readString();

        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");

        int[] alphabetCount = count(input);
        printHistogram(alphabetCount);
    }

    public static void main(String[] args) {
        Histogram his = new Histogram();
        his.run();
    }
}
