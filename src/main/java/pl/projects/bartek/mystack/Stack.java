package pl.projects.bartek.mystack;

public interface Stack<Type> {

    void push(Type a);

    Type pop();

    boolean isEmpty();

}
