import java.util.Scanner;

class Player {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private String word;

    public String getName() { return name; }
    public String getWordFromUser() {
        System.out.print(name + ">> ");
        word = scanner.next();
        return word;
    }

    public boolean checkSuccess(char lastCharacterFromPreviousPlayer) {
        char firstChar = word.charAt(0);
        if (lastCharacterFromPreviousPlayer == firstChar) { // 이전 사람의 끝 문자와 현재 사람의 첫 문자가 같으면.
            return true;
        } else {
            scanner.close();
            return false;
        }
    }

    Player(String name) {
        this.name = name;
    }
}

public class WordGameApp {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WordGameApp gameApp = new WordGameApp();
        gameApp.run();
    }

    void run() {
        int numberOfPlayers;            // 선
        int currentPlayer = 0;

        String playerName;              // 언
        String previousWord = "아버지";
        String word;

        Player[] players;               // 부


        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.print("게임에 참가하는 인원은 몇 명인가요?>> ");
        numberOfPlayers = scanner.nextInt();

        players = new Player[numberOfPlayers]; // 객체 배열 선언.
        for (int i = 0; i < players.length; i++) {
            System.out.print("참가자의 이름을 입력하세요>> ");
            playerName = scanner.next();
            players[i] = new Player(playerName); // 생성.
        }

        System.out.println("\n시작하는 단어는 " + previousWord + "입니다.");
        while (true) { // 끝말잇기 시작.
            int lastIndex = previousWord.length() - 1;
            char lastChar = previousWord.charAt(lastIndex); // 이전 문자의 마지막 문자 알아내기.

            word = players[currentPlayer].getWordFromUser(); // 입력 받기

            if (!players[currentPlayer].checkSuccess(lastChar)) { // 현재 플레이어에게 입력 받은 단어의 첫 문자와 이전 플레이어에게 입력받은 단어의 마지막 문자 비교.
                System.out.print(players[currentPlayer].getName() + "이 졌습니다."); // 두 문자가 서로 다르다면 패배.
                scanner.close();
                break;
            } else {
                currentPlayer++; // 같다면 통과.
                previousWord = word; // 현재 플레이어에게 입력받은 단어와 다음 플레이어가 입력할 단어를 비교하기 위해 previousWord를 변경.
            }

            if (currentPlayer == numberOfPlayers) { // 마지막 플레이어까지 왔다면
                currentPlayer = 0; // 첫 번째 플레이어로 다시 돌아가기.
            }
        }
    }
}
