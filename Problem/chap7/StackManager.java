import jdk.jfr.Percentage;

import java.util.*;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
    Vector<T> stack = new Vector<>();
    int topOfStack = 0;

    @Override
    public T pop() {
        if (topOfStack == 0) {
            return null;
        }
        topOfStack--;
        return stack.get(topOfStack);
    }

    @Override
    public boolean push(T ob) {
        stack.add(topOfStack, ob);
        topOfStack++;
        return true;
    }
}

public class StackManager {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (true) {
            Integer n = stack.pop();
            if (n == null) {
                break;
            }
            System.out.print(n + " ");
        }
    }
}
