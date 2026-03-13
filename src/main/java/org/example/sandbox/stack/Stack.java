package org.example.sandbox.stack;

public interface Stack<E> {

    boolean empty();
    E peek();
    E pop();
    E push(E e);
    int search (E e);


}
