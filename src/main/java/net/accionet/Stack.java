package net.accionet;

public class Stack<T extends Comparable<T>> {
    LinkedList<T> stack;
    public Stack() {
        stack = new LinkedList<T>();
    }
    public void push(T element){
        this.stack.push(element);
    }
    public T pop(){
        return this.stack.pop();
    }
    public T getTop(){
        return this.stack.getFirst();
    }
    public T getMin(){
        T minElem = this.stack.getFirst();
        for (T element : this.stack
        ) {
            if (element.compareTo(minElem) < 0){
                minElem = element;
            }
        }
        return minElem;
    }
    public T getMax(){
        T maxElem = this.stack.getFirst();
        for (T element : this.stack
        ) {
            if (element.compareTo(maxElem) > 0){
                maxElem = element;
            }
        }
        return maxElem;
    }
}