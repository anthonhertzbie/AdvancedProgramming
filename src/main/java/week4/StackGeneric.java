package week4;

public interface StackGeneric<T> {
    void push(T e);

    String pop();

    boolean isEmpty();

    boolean isFull();

    void show();

}
