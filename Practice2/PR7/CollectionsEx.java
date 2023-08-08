import java.util.*;

public class CollectionsEx {
    static void printList(LinkedList<String> l) {
        var iterlator = l.iterator();

        while (iterlator.hasNext()) {
            String e = iterlator.next();
            String separator;
            if (iterlator.hasNext()) {
                separator = " -> ";
            } else {
                separator = "\n";
            }
            System.out.print(e + separator);
        }
    }
    public static void main(String[] args) {
        var myList = new LinkedList<String>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        Collections.sort(myList);
        printList(myList);

        Collections.reverse(myList);
        printList(myList);

        var index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.println("아바타는 " + index + "번째 요소입니다.");
    }
}
