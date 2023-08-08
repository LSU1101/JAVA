import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Name: ");
            String s = scanner.next();
            a.add(s);
        }

        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
        }

        var longestIndex = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(longestIndex).length() < a.get(i).length()) {
                longestIndex = i;
            }
        }
        System.out.println("\nLongest name is " + a.get(longestIndex));
        scanner.close();
    }
}
