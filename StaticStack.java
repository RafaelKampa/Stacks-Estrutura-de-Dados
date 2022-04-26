package Pacote1;

import java.util.Arrays;

public class StaticStack {
    public int top;
    public int[] elements;

    public StaticStack (int capacity){
        if(capacity <= 0) {
            System.out.println("A Capacidade precisa ser acima de zero!");
        } else {
            this.top = -1;
            this.elements = new int[capacity];
        }
    }

    public void push(int element){
        if (isFull()) {
            System.out.println("Fila cheia!");
        }
            this.top = top + 1;
            this.elements[top] = element;
            System.out.println("Elemento: " + element + " adicionado a posição: " + top);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("A pilha está vazia!");
        }
        int pop = this.elements[top];
        this.top = this.top - 1;
        return pop;
    }

    public int getSize(){
        return this.top + 1;
    }

    public int getCapacity(){
        return this.elements.length;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public boolean isFull() {
        return top >= getCapacity() - 1;
    }

    @Override
    public String toString() {
        return "StaticStack{" +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
