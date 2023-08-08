import java.util.*;

public class NationsHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var nations = new HashMap<String, Integer>();
        String country, search;
        int population;
        Integer searchResult;

        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000");
        while (true) {
            System.out.print("나라이름, 인구>> ");
            country = scanner.next();
            if (country.equals("그만")) {
                break;
            }
            population = scanner.nextInt();
            nations.put(country, population);
        }

        while (true) {
            System.out.print("인구 검색>> ");
            search = scanner.next();

            if (search.equals("그만")) {
                break;
            }

            searchResult = nations.get(search);
            if (searchResult == null) {
                System.out.println(search + " 나라는 없습니다.");
                continue;
            } else {
                System.out.println(search + "의 인구는 " + searchResult);
            }
        }
    }
}
