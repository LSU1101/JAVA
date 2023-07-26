import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfPhrasesUsingTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int NumberOfPhrases;
            String input;

            System.out.print(">> ");
            input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }

            StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
            NumberOfPhrases = stringTokenizer.countTokens();

            System.out.println("어절 개수는 " + NumberOfPhrases);
        }
        System.out.println("종료합니다!!!!!!!!!!!!!!!");
    }
}
