package pl.projects.bartek.mystack;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MyStackTest {


    @Test
    public void testPush() {

        Stack<Integer> myStack = new MyStack<>(10, 5, Integer[]::new);

        myStack.push(4);

        assertEquals("[4]", String.valueOf(myStack));
    }

    @Test
    public void testPop() {

        Stack<Integer> myStack = new MyStack<>(10, 5, Integer[]::new);

        myStack.push(4);
        myStack.pop();

        assertEquals("[]", String.valueOf(myStack));
    }

    @Test
    public void testisEmpty() {

        Stack<Integer> myStack = new MyStack<>(10, 5, Integer[]::new);

        myStack.push(4);
        myStack.pop();

        assertTrue(myStack.isEmpty());
    }

}