package eleven;

import org.junit.Test;

import java.util.LinkedList;

public class Exercise15 {

    //我的代码
    @Test
    public void test1() {
        Stack<String> stack = new Stack<>();
        stack.push("U");
        stack.push("n");
        stack.push("c");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push("e");
        stack.push("r");
        stack.push("t");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push("a");
        System.out.print(stack.pop());
        stack.push("i");
        System.out.print(stack.pop());
        stack.push("n");
        stack.push("t");
        stack.push("y");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push(" ");
        System.out.print(stack.pop());
        stack.push("r");
        stack.push("u");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push("l");
        stack.push("e");
        stack.push("s");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
    }

    //答案代码
    @Test
    public void test2() {
        Stack<Character> stack = new Stack<>();
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;) {
            switch (charArr[i++]) {
                case '+':
                    stack.push(charArr[i++]);
                    break;
                case '-':
                    System.out.print(stack.pop());
            }
        }
    }
}

class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T v) {
        linkedList.addFirst(v);
    }

    public T peek() {
        return linkedList.getFirst();
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public String toString() {
        return linkedList.toString();
    }
}