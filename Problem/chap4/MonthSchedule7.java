import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) {
            System.out.println("없습니다.");
        } else {
            System.out.println(work + "입니다.");
        }
    }
}

public class MonthSchedule7 {
    Scanner scanner = new Scanner(System.in);
    Day[] month;

    MonthSchedule7(int monthDay) {
        month = new Day[monthDay];
        for (int i = 0; i < month.length; i++) {
            month[i] = new Day();
        }
    }

    void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while (true) {
            System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3)>> ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    input();
                    System.out.println();
                    break;
                case 2:
                    view();
                    System.out.println();
                    break;
                case 3:
                    finish();
                default:
                    System.out.println("잘못 입력했습니다. 1, 2, 3 중에서 입력하세요.");
                    continue;
            }
        }
    }

    void input() {
        while (true) {
            System.out.print("날짜(1~" + month.length + ")?>> ");
            int day = scanner.nextInt();
            if (day > month.length || day < 1) {
                System.out.println("1일부터 " + month.length + "일까지만 입력할 수 있어요.");
                continue;
            }

            System.out.print("할 일(빈 칸 없이 입력하세요.)>> ");
            String inputWork = scanner.next();

            month[day - 1].set(inputWork);
            break;
        }
    }

    void view() {
        while (true) {
            System.out.print("언제의 할 일을 보고 싶은가요? (1~" + month.length + ")>> ");
            int inputDay = scanner.nextInt();
            if (inputDay > month.length || inputDay < 1) {
                System.out.println("1일부터 " + month.length + "일까지만 입력할 수 있어요.");
                continue;
            }

            System.out.print(inputDay + "일의 할 일은 ");
            month[inputDay - 1].show();
            break;
        }
    }

    void finish() {
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
        System.exit(0);
    }

    public static void main(String[] args) {
        MonthSchedule7 april = new MonthSchedule7(30);
        april.run();
    }
}
