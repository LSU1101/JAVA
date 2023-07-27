import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

abstract class GameObject {
    protected int diatance;
    protected int x, y;

    public GameObject(int startX, int startY, int diatance) {
        this.x = startX;
        this.y = startY;
        this.diatance = diatance;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public boolean collide(GameObject p) {
        if (this.x == p.getX() && this.y == p.getY()) {
            return true;
        } else {
            return false;
        }
    }
    protected abstract void move();
    protected abstract char getShape();
}

class Bear extends GameObject {
    Scanner scanner = new Scanner(System.in);
    public Bear(int startX, int startY, int diatance) {
        super(startX, startY, diatance);
    }

    @Override
    protected void move() {
        String input;

        while (true) {
            System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d)>> ");
            input = scanner.next();

            if (input.equals("a")) {
                x-= diatance;
                break;
            } else if (input.equals("s")) {
                y+= diatance;
                break;
            } else if (input.equals("w")) {
                y-= diatance;
                break;
            } else if (input.equals("d")) {
                x+= diatance;
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}

class Fish extends GameObject {
    Random random = new Random();
    private int count = 0;

    public Fish(int startX, int startY, int diatance) {
        super(startX, startY, diatance);
    }

    @Override
    protected void move() {
        count++;
        if (count == 4 || count == 5) {
            int r = random.nextInt(4);

            if (r == 1) { // move right
                x++;
            } else if (r == 2) { // move left
                x--;
            } else if (r == 3) { // move up
                y++;
            } else {
                y--;
            }
        }

        if (count == 5) {
            count = 0;
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}

public class BearFishGame {
    public static void main(String[] args) {
        Bear bear = new Bear(0, 0, 1);
        Fish fish = new Fish(5, 5, 1);
        char[][] board = new char[10][20];

        System.out.println("게임 시작");
        while (true) {
            for (int y = 0; y < board.length; y++) {
                for (int x = 0; x < board[y].length; x++) {
                    if (y == bear.getY() && x == bear.getX()) {
                        board[y][x] = bear.getShape();
                    } else if (y == fish.getY() && x == fish.getX()) {
                        board[y][x] = fish.getShape();
                    } else {
                        board[y][x] = '-';
                    }
                }
            }

            for (int y = 0; y < board.length; y++) {
                for (int x = 0; x < board[y].length; x++) {
                    System.out.print(board[y][x]);
                }
                System.out.println();
            }

            fish.move();
            bear.move();

            if (bear.collide(fish)) {
                System.out.println("Bear Wins!");
                break;
            }
        }
    }
}
