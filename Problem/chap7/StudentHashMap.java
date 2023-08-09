import java.util.*;

public class StudentHashMap {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Student> students = new HashMap<String, Student>();
    public void run() {
        input();
        printStudent();
        search();
        scanner.close();
    }

    void input() {
        String input, name, dept, number;
        double score;

        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");

        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            input = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(input, ", ");
            name = st.nextToken().trim(); dept = st.nextToken().trim(); number = st.nextToken().trim();
            score = Double.parseDouble(st.nextToken().trim());

            Student student = new Student(name, dept, number, score);
            students.put(name, student);
        }
    }

    void printStudent() {
        Set<String> keys = students.keySet();
        Iterator<String> it = keys.iterator();
        String name;

        System.out.println("--------------------------");
        while (it.hasNext()) {
            name = it.next();
            System.out.println("이름: " + name);
            System.out.println("학과: " + students.get(name).getDept());
            System.out.println("학년: " + students.get(name).getNumber());
            System.out.println("학점: " + students.get(name).getScore());
            System.out.println("--------------------------");
        }
    }

    void search() {
        String search;
        while (true) {
            System.out.print("학생 이름>> ");
            search = scanner.next();
            if (search.equals("그만")) {
                break;
            }
            if (students.get(search) == null) {
                System.out.println(search + " 학생은 없습니다.");
                continue;
            }

            System.out.println(students.get(search).getName() + ", " + students.get(search).getName() + ", " + students.get(search).getName() + ", " + students.get(search).getName());
        }
    }
    public static void main(String[] args) {
        var manager = new StudentArrayList();
        manager.run();
    }
}
