import java.util.*;

public class ScholarshipStudent {
    Scanner scanner = new Scanner(System.in);

    HashMap<String, Double> students = new HashMap<>();
    public void run() {
        input();
        selection();

        scanner.close();
    }

    void input() {
        String name;
        double score;

        System.out.println("미래장학금 관리 시스템입니다.");
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>> ");
            name = scanner.next();
            score = scanner.nextDouble();
            students.put(name, score);
        }
    }

    void selection() {
        Set<String> keys = students.keySet();
        Iterator<String> it = keys.iterator();
        String studentName;
        double cutLine;

        System.out.print("장학생 선발 학점 기준 입력>> ");
        while (true) {
            cutLine = scanner.nextDouble();
            if (cutLine < 0.0 || cutLine > 4.5) {
                System.out.println("4,5점 만점입니다.");
                continue;
            }
            break;
        }

        System.out.print("장학생 명단: ");
        while (it.hasNext()) {
            studentName = it.next();
            if (students.get(studentName) >= cutLine) {
                System.out.print(studentName + " ");
            }
        }
    }

    public static void main(String[] args) {
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent();
        scholarshipStudent.run();
    }
}
