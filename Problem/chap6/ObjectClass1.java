class MyPoint {
    private int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return ("Point(" + x + ", " + y + ")");
    }

    @Override
    public boolean equals(Object obj) {
        MyPoint q = (MyPoint)obj;
        if (x == q.x && y == q.y) {
            return true;
        } else  {
            return false;
        }
    }
}

public class ObjectClass1 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);

        System.out.println(p);
        if (p.equals(q)) {
            System.out.println("같은 점");
        } else {
            System.out.println("다른 점");
        }
    }
}
