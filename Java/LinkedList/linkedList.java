package Java.LinkedList;

import java.io.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        } else{
            Node current = head;

            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteNode(int value){
        if(head==null){
            return;
        }
        
        if(head.data == value){
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value){
            current = current.next;
        };

        if (current.next != null){
            current.next = current.next.next;
        };
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public void insertAfterElement(int element, int newData){
        Node newNode = new Node(newData);

        if(head == null){
            return;
        }

        Node current = head;
        while(current != null && current.data != element){
            current = current.next;
        }

        if(current != null){
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void insertBeforeElement(int element, int newData){
        Node newNode = new Node(newData);

        if (head != null && head.data == element) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data != element){
            current = current.next;
        }

        if(current.next != null){
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}


class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Insert some elements at the end of the linked list
        myList.insertAtEnd(1);
        myList.insertAtEnd(2);
        myList.insertAtEnd(3);

        // Print the original list
        System.out.print("Original List: ");
        myList.printList();

        // Insert a new node with data 4 before the element 2
        myList.insertBeforeElement(2, 4);

        // Print the modified list
        System.out.print("List after insertion: ");
        myList.printList();
    }
}