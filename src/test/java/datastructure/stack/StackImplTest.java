package datastructure.stack;

import org.junit.Test;

public class StackImplTest {

    @Test
    public void isEmpty() {
        StackImpl<Integer> stack = new StackImpl<>();
        System.out.println(stack.isEmpty()); // true
        stack.push(1);
        System.out.println(stack.isEmpty()); // false
    }

    @Test
    public void getSize() {
        StackImpl<Integer> stack = new StackImpl<>();
        System.out.println(stack.getSize()); // 0
        stack.push(1);
        System.out.println(stack.getSize());  // 1
    }

    @Test
    public void push() {
        StackImpl<Integer> stack = new StackImpl<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.getSize());
        stack.traverse();
    }

    @Test
    public void pop() {
        StackImpl<Integer> stack = new StackImpl<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.pop();
        stack.traverse();
    }

    @Test
    public void getTop() {
        StackImpl<Integer> stack = new StackImpl<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.getTop());
        stack.traverse();
    }

    @Test
    public void contains() {
        StackImpl<Integer> stack = new StackImpl<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.contains(1));
    }
}