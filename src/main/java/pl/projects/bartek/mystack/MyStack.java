package pl.projects.bartek.mystack;

import java.util.EmptyStackException;
import java.util.function.Function;

public class MyStack<Type> implements Stack<Type> {

    private Function<Integer, Type[]> provider;
    private Type[] array;
    private int length;
    private int sizeIncrease;

    public MyStack(int size, int sizeIncrease, Function<Integer, Type[]> provider) {

        this.provider = provider;
        array = provider.apply(size);
        length = 0;
        this.sizeIncrease = sizeIncrease;

    }


    @Override
    public void push(Type a) {
        if (length == array.length) {

            increase(sizeIncrease);
        }
        array[length] = a;
        ++length;
    }

    private void increase(int sizeIncrease) {
        Type[] temp = provider.apply(length + sizeIncrease);
        System.arraycopy(array, 0, temp, 0, array.length);

        array = temp;
    }

    @Override
    public Type pop() {
        if (length <= 0) {
            throw new EmptyStackException();
        }
        Type temp = array[length - 1];
        --length;
        return temp;
    }


    @Override
    public boolean isEmpty() {

        return length <= 0;
    }


}
