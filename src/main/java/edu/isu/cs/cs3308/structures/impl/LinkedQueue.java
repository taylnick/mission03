package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Queue;
import java.lang.*;

public class LinkedQueue<E> implements Queue {


    private SinglyLinkedList sll = new SinglyLinkedList();

    /**
     * @return The number of elements in the queue
     */
    @java.lang.Override
    public int size() {
        return sll.size();
    }

    /**
     * @return tests whether the queue is empty.
     */
    @java.lang.Override
    public boolean isEmpty() {
        return sll.isEmpty();
    }

    /**
     * Inserts an element at the end of the queue.
     *
     * @param element Element to be inserted.
     */
    @java.lang.Override
    public void offer(java.lang.Object element) {
        sll.addLast(element);
    }

    /**
     * @return The value first element of the queue (with out removing it), or
     * null if empty.
     */
    @java.lang.Override
    public java.lang.Object peek() {
        return sll.first();
    }

    /**
     * @return The value of the first element of the queue (and removes it), or
     * null if empty.
     */
    @java.lang.Override
    public java.lang.Object poll() {
        return sll.removeFirst();
    }

    /**
     * Prints the contents of the queue starting at top, one item per line. Note
     * this method should not empty the contents of the queue.
     */
    @java.lang.Override
    public void printQueue() {
        sll.printList();
    }

    /**
     * Tranfers the contents of this queue into the provided queue. The contents
     * of this queue are to found in reverse order at the top of the provided
     * queue. This queue should be empty once the transfer is completed. Note
     * that if the provided queue is null, nothing is to happen.
     *
     * @param into The new queue onto which the reversed order of contents from
     *             this queue are to be transferred to the top of, unless the provided queue
     *             is null.
     */
    @java.lang.Override
    public void transfer(Queue into) {
        if(into == null) return;

        LinkedStack tempStack = new LinkedStack();
        while(!this.isEmpty()) {
            tempStack.push(this.poll());
        }
        while(!tempStack.isEmpty()){
            into.offer(tempStack.pop());
        }


    }

    /**
     * Reverses the contents of this queue.
     */
    @java.lang.Override
    public void reverse() {
//        LinkedQueue tempQueue1 = new LinkedQueue();
//        LinkedQueue tempQueue2 = new LinkedQueue();
//
//        while(!this.isEmpty()){
//            tempQueue1.offer(this.poll());
//        }
//
//        while(!tempQueue1.isEmpty()){
//            tempQueue2.offer((tempQueue1.poll()));
//        }
//
//        while(!tempQueue2.isEmpty()){
//            this.offer(tempQueue2.poll());
//        }
    }

    /**
     * Merges the contents of the provided queue onto the bottom of this queue.
     * The order of both queues must be preserved in the order of this queue
     * after the method call. Furthermore, the provided queue must still contain
     * its original contents in their original order after the method is
     * complete. If the provided queue is null, no changes should occur.
     *
     * @param from Queue whose contents are to be merged onto the bottom of
     *             this queue.
     */
    @java.lang.Override
    public void merge(Queue from) {
        if(from == null) return;

        LinkedQueue tempQueue1 = new LinkedQueue();

    }
}
