import java.util.*;

public class CapitalHashMap {

    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> nationHash = new HashMap<>();

    public void run() {

        nationHash.put("한국", "서울");
        nationHash.put("일본", "도쿄");
        nationHash.put("프랑스", "파리");
        nationHash.put("중국", "베이징");
        nationHash.put("영국", "런던");
        nationHash.put("호주", "캔버라");

        int input;
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    write();
                    break;
                case 2:
                    quiz();
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("1, 2, 3 중 입력하세요.");
            }
        }
    }

    void write() {

        String country, capital;

        System.out.println("현재 " + nationHash.size() + "개의 나라와 수도가 입력되어 있습니다.");
        while (true) {
            System.out.print("나라와 수도 입력 " + (nationHash.size() + 1) + ">> ");

            country = scanner.next();
            if (country.equals("그만")) {
                break;
            }
            capital = scanner.next();
            if (isDuplicate(country)) {
                System.out.println(country + "은(는) 이미 있습니다!");
                continue;
            }

            nationHash.put(country, capital);
        }
    }

    boolean isDuplicate(String country) {
        if (nationHash.get(country) == null) {
            return false;
        } else {
            return true;
        }
    }

    void quiz() {
        Set<String> keys = nationHash.keySet();
        Object[] Array = (keys.toArray());

        Random random = new Random();
        int num;
        String quiz, answer, input;
        while (true) {
            num = random.nextInt(nationHash.size());
            quiz = Array[num].toString();
            answer = nationHash.get(quiz);

            System.out.print(quiz + "의 수도는? ");
            input = scanner.next();
            if (input.equals(answer)) {
                System.out.println("정답!!");
            } else if (input.equals("그만")){
                break;
            } else {
                System.out.println("땡!!!!!!!!!!!!!!!");
            }
        }
    }

    public static void main(String[] args) {
        CapitalVector capitalVector = new CapitalVector();
        capitalVector.run();
    }
}
