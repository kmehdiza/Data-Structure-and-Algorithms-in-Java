package com.java.priorityqueueandheaps;

public class BinaryHeap {
}

/*
The Binary heap is a data structure that helps us in implementing Priority Queue operations efficiently. A binary heap
is a complete binary tree in which each node value is >= (or<=) than the values of its children.

- Complete Binary Tree
A complete binary tree is a binary tree where all levels are completely filled except last level and last level has nodes in
such a way that left side is never empty.

- Representation of a Binary Heap
Binary heaps usually are implemented using arrays
The first entry of array is taken as empty
As Binary Heaps are complete binary tree, the values are stored in array by traversing tree level by level from left to right.

- Max Binary Heap
A Max heap is a complete binary tree in which each node value is >= than the values of its children.
The Maximum value is a the top which is root of complete binary tree. For its array representation its at index 1
* */