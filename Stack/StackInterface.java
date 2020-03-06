package jedi;

public interface StackInterface<E>  {

    boolean push(E item);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
    void clear();
}
