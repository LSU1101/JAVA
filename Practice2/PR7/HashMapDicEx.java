import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        while (true) {
            System.out.print("찾고 싶은 단어는?: ");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("종료...");
                break;
            }
            String kor = dic.get(eng);
            if (kor == null) {
                System.out.println(eng + "는 없는 단어입니다.");
            } else {
                System.out.println(kor);
            }
        }
        scanner.close();
    }
}
