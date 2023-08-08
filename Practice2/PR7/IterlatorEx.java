import java.util.*;

public class IterlatorEx {
    public static void main(String[] args) {
        var v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        var it = v.iterator();
        while (it.hasNext()) {
            var n = it.next();
            System.out.println(n);
        }

        var sum = 0;
        it = v.iterator();
        while (it.hasNext()) {
            var n = it.next();
            sum += n;
        }
        System.out.println("벡터에 있는 정수의 합: " + sum);
    }
}
