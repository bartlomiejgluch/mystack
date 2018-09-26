package pl.projects.bartek.mystack;

import java.util.function.Function;

public class MyStack<Type> implements Stack<Type> {

    private Function<Integer, Type[]> provider;
    private Type[] array;
    private int lenght;
    private int sizeIncrase;

    public MyStack(int size, int sizeIncrase, Function<Integer, Type[]> provider) {

        this.provider = provider;
        array = provider.apply(size);
        this.sizeIncrase = sizeIncrase;
        lenght = 0;

    }


    @Override
    public void push(Type a) {

    }

    @Override
    public Type pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
