package com.company.myCompany.InterviewCamp.LinkedHashTable;

import java.util.HashMap;

public class LRUCache<K, V> {
    //MAps the keys to the nodes
    HashMap<K, Node<K, V>> map;

    //Linked List variables.
    Node<K, V> head;
    Node<K, V> tail;

    //Max capacity the cache can hold
    int capacity;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
    }

    //read a value from cache
    public V read(K key) {
        Node<K, V> node = map.get(key);
        if (node == null) return null;

        remove(key); //removes from the linked hash table
        add(node.getKey(), node.getValue()); // add back to front of the linked list
        return node.getValue();
    }

    //write a value to cache
    public void write(K key, V value) {
        if (map.size() == capacity) { // when the cache if full, evict the head.
            remove(head.getKey());
        }
        add(key, value);
    }

    private void add(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        appendToLinkedList(newNode);
        map.put(key, newNode);
    }

    public void remove(K key) {
        if(!map.containsKey(key)) return;

        Node<K, V> toRemove = map.get(key);
        removeFromLinkedList(toRemove);
        map.remove(key);
     }

     //append to the Linked list
     public void appendToLinkedList(Node<K, V> toAdd) {
        if (head == null) {
            head = toAdd;
        } else {
            tail.next = toAdd;
            toAdd.setPrev(tail);
        }
        tail = toAdd;
     }
     public void removeFromLinkedList(Node<K, V> toRemove) {
        if (toRemove.getPrev() != null) toRemove.getPrev().setNext(toRemove.getNext());

        if (toRemove.getNext() != null) toRemove.getNext().setPrev(toRemove.getPrev());

        if (toRemove == head) head = toRemove.getNext();

        if(toRemove == tail) tail = toRemove.getPrev();

     }
 

}

class Node<K, V> {
    Node<K, V> next;
    Node<K, V> prev;
    K key;
    V value;

    public Node(K key, V value){
        super();
        this.key = key;
        this.value = value;
    }

    public Node<K, V> getNext() {
        return next;
    }
    public Node<K, V> getPrev() {
        return prev;
    }

    public void setNext(Node<K, V> next){
        this.next = next;
    }

    public void setPrev(Node<K, V> prev) {
        this.prev = prev;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
