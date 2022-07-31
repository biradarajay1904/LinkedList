package com.LinkedList;
/**
* ajay biradar


*/

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    void push(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    void print(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
    }
}