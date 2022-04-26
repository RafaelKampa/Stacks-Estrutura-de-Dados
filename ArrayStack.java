package Pacote1;

import java.util.Arrays;

public class ArrayStack {
    public int top = -1;
    public int[] elements;
    public float growthRate;

    public ArrayStack() {
    }

    public ArrayStack (int capacity){
        this.elements = new int[capacity];
    }

    public ArrayStack (int capacity, int growthRate){
        new ArrayStack(capacity);
        this.growthRate = growthRate;
    }

    public void push (int element){
        int[] elements2 = new int[(int)(this.elements.length * this.growthRate)]; // cria um array temporário maior
        for (int i = 0; i <= this.elements.length; i++){ // copia os elementos do primeiro array pro array maior
            elements2[i] = this.elements[i];
        }
        this.elements = new int [elements2.length]; // altera o tamanho para o array maior
        for (int i = 0; i <= elements2.length; i++){ // copia o array maior para o array correto
            this.elements[i] = elements2[i];
        }

        if (this.top <= this.elements.length){
            this.top ++;
            this.elements[top] = element;
        } else {
            System.out.println("Valor excede o tamanho do array!");
        }
    }

    public int pop(){
        int pop = this.elements[top];
        if (this.elements[top] >= 0){
            this.elements[top] = 0;
            this.top --;
        } else{
            System.out.println("Não existem mais elementos no array!");
        }
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

    public void trimToSize(){
        this.elements = Arrays.copyOf(this.elements, getSize());
    }
}
