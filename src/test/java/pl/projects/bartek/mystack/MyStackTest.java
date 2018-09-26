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

    @Test
    public void testPeek1() {

        Stack<Integer> myStack = new MyStack<>(10, 5, Integer[]::new);

        myStack.push(4);
        myStack.push(56);
        myStack.push(45);


        assertEquals("45", String.valueOf(myStack.pop()));
    }

    @Test
    public void testPeek2() {

        Stack<Integer> myStack = new MyStack<>(10, 5, Integer[]::new);

        myStack.push(4);
        myStack.push(56);
        myStack.push(45);
        myStack.pop();

        assertEquals("56", String.valueOf(myStack.pop()));
    }

}