import java.util.*;

class Student {
    private String name, dept, number;
    private double score;

    public Student(String name, String dept, String number, double score) {
        this.name = name; this.dept = dept; this.number = number; this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getNumber() {
        return number;
    }

    public double getScore() {
        return score;
    }
}

public class StudentArrayList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();
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
            students.add(student);
        }
    }

    void printStudent() {
        System.out.println("--------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println("이름: " + students.get(i).getName());
            System.out.println("학과: " + students.get(i).getDept());
            System.out.println("학년: " + students.get(i).getNumber());
            System.out.println("학점: " + students.get(i).getScore());
            System.out.println("--------------------------");
        }
    }

    void search() {
        var it = students.iterator();
        String search;
        while (true) {
            System.out.print("학생 이름>> ");
            search = scanner.next();
            if (search.equals("그만")) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                if (search.equals(students.get(i).getName())) {
                    System.out.println(students.get(i).getName() + ", " + students.get(i).getDept() + ", " + students.get(i).getNumber() + ", " + students.get(i).getScore());
                    break;
                }
                if (i == 3) {
                    System.out.println(search + " 학생은 없습니다.");
                }
            }
        }
    }

    public static void main(String[] args) {
        var manager = new StudentArrayList();
        manager.run();
    }
}
