import java.util.*;

class Nation {
    private String country, capital;
    public Nation(String country, String capital) {
        this.capital = capital; this.country = country;
    }

    String getCountry() { return country; }
    String getCapital() { return capital; }
}

public class CapitalVector {
    Scanner scanner = new Scanner(System.in);
    Vector<Nation> nationVector = new Vector<>();

    public void run() {

        nationVector.add(new Nation("한국", "서울"));
        nationVector.add(new Nation("일본", "도쿄"));
        nationVector.add(new Nation("프랑스", "파리"));
        nationVector.add(new Nation("중국", "베이징"));
        nationVector.add(new Nation("영국", "런던"));
        nationVector.add(new Nation("호주", "캔버라"));

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

        System.out.println("현재 " + nationVector.size() + "개의 나라와 수도가 입력되어 있습니다.");
        while (true) {
            System.out.print("나라와 수도 입력 " + (nationVector.size() + 1) + ">> ");

            country = scanner.next();
            if (country.equals("그만")) {
                break;
            }
            capital = scanner.next();
            if (isDuplicate(country)) {
                System.out.println(country + "은(는) 이미 있습니다!");
                continue;
            }

            Nation nation = new Nation(country, capital);
            nationVector.add(nation);
        }
    }

    boolean isDuplicate(String country) {
        var it = nationVector.iterator();
        String writtenCountry;

        while (it.hasNext()) {
            writtenCountry = it.next().getCountry();
            if (country.equals(writtenCountry)) {
                return true;
            }
        }
        return false;
    }

    void quiz() {
        Random random = new Random();
        int num;
        String quiz, answer, input;
        while (true) {
            num = random.nextInt(nationVector.size());
            quiz = nationVector.get(num).getCountry();
            answer = nationVector.get(num).getCapital();

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
