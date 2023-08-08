import java.util.Vector;

class Point7 {
    private int x, y;

    public Point7(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point7> v = new Vector<Point7>();

        v.add(new Point7(2, 3));
        v.add(new Point7(-5, 20));
        v.add(new Point7(30, -8));

        v.remove(1);

        for (int i = 0; i < v.size(); i++) {
            Point7 p = v.get(i);
            System.out.println(p);
        }
    }
}
