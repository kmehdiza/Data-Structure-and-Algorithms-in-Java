package com.java.priorityqueueandheaps;

public class MaxPQ {
    Integer[] heap;
    int n;

    public MaxPQ(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int x){
        if(n == heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int n){
        while (n>1 && heap[n/2] < heap[n]){
            int temp = heap[n];
            heap[n] = heap[n/2];
            heap[n/2] = temp;
            n=n/2;
        }
    }

    private void resize(int capacity){
        Integer[] newHeap = new Integer[capacity];
        for (int i =0; i<heap.length;i++){
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    public void printMaxHeap(){
        for (int i =1; i<=n;i++){
            System.out.print(heap[i] + " --> ");
        }
    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        maxPQ.insert(4);
        maxPQ.insert(5);
        maxPQ.insert(2);
        maxPQ.insert(6);
        maxPQ.insert(1);
        maxPQ.insert(3);
        System.out.println(maxPQ.size());
        maxPQ.printMaxHeap();


    }
}
