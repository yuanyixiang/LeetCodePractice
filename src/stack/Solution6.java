package stack;

import java.util.LinkedList;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/1 10:47 下午
 */
public class Solution6 {
    //title:https://leetcode-cn.com/problems/design-circular-deque/
    LinkedList list = new LinkedList();
    int size = 0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public void MyCircularDeque(int k) {
        size = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(list.size() < size){
            list.addFirst(value);
            return true;
        }else {return false;}
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(list.size() < size){
            list.addLast(value);
            return true;
        }else return false;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(list.size() > 0){
            list.removeFirst();
            return true;
        }else return false;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(list.size() > 0){
            list.removeLast();
            return true;
        }else return false;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(list.size() == 0){
            return -1;
        }else{
            return (Integer)list.getFirst();
        }
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(list.size() == 0){
            return -1;
        }else{
            return (Integer)list.getLast();
        }

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(list.size() == this.size){
            return true;
        }else{
            return false;
        }
    }
}
