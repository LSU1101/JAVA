import java.util.Stack;

class GStack<T> {
    int topOfStack;
    Object[] stack;
    public GStack() {
        topOfStack = 0;
        stack = new Object[10];
    }

    public void push(T item) {
        if (topOfStack == 10) {
            return;
        }
        stack[topOfStack] = item;
        topOfStack++;
    }

    public T pop() {
        if (topOfStack == 0) {
            return null;
        }
        topOfStack--;
        return (T)stack[topOfStack];
    }
}

public class MyStack {
    public static void main(String[] args) {
        var stringStack = new GStack<String>();

        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for (int n = 0; n < 3; n++) {
            System.out.println(stringStack.pop());
        }

        var intStack = new Stack<Integer>();

        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for (int n = 0; n < 3; n++) {
            System.out.println(intStack.pop());
        }
    }
}
