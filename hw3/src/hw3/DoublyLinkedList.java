/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author Patiwet
 */
public class DoublyLinkedList {
    Node head;
    Node tail;
    String listName;
    
    public DoublyLinkedList(String name){
        this.listName = name;
        head = tail = null;
    }
    
    public void popBack() {
      if (isEmpty()){
            System.out.println("ERROR");
        }else{
            this.tail = this.tail.prev;
            if(tail == null)//check if list contains just one element
                this.head = this.tail;
            else
                this.tail.next = null;
        }
    }
    
    public void popFront(){
        if (isEmpty()){
            //list is empty, cannot pop
            System.out.println("ERROR");
        }else{
            this.head = this.head.next;
            if(head == null)//check if list contains just one element
                this.tail = this.head;
            else
                this.head.prev = null;
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List");
        } else {
            return this.head;
        }
    }
    
    public Node topBack(){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List");
        } else {
            return this.tail;
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){
            //empty list, just add it anyway
            this.head = node;
            this.tail = this.head;
        }else{
            this.head.prev = node;
            this.head.prev.next = this.head;//make 'node' above fully connect to the list
            this.head = this.head.prev;
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()) {
            //empty list, just add it anyway
            this.head = node;
            this.tail = this.head;
        } else {
            this.tail.next = node;
            this.tail.next.prev = this.tail;//make 'node' above fully connect to the list
            this.tail = this.tail.next;
        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node("Empty List");
        } else {
            Node tmp = this.head;
            while(tmp != null)
            {
                if(tmp.student_id == id)
                    return tmp;
                tmp = tmp.next;
            }
            return new Node("Student Not Found!");
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List");
        } else {
            Node tmp = head;
            while(tmp != null)
            {
                if(tmp.student_id == id)
                {
                    if(tmp.prev == null)//means that we find id at the head
                        popFront();
                    else if(tmp.next == null)//means that we find id at the tail
                        popBack();
                    else
                    {
                        tmp.next.prev = tmp.prev;//connect next node to previous node
                        tmp.prev.next = tmp.next;//connect previous node to next node
                    }
                    return tmp;
                }
                tmp = tmp.next;
            }
            return new Node("Student Not Found!");
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){
        Node tmp = head;
        while(tmp != null)
        {
            if(tmp == node1)
            {
                if(tmp.next == null)//node1 is at the tail
                    pushBack(node2);
                else//somewhere at the middle or even at the head
                {
                    node2.next = tmp.next;
                    node2.next.prev = node2;
                    node2.prev = tmp;
                    tmp.next = node2;
                }
            }tmp = tmp.next;
        }
    }
    
    public void addNodeBefore(Node node1, Node node2){
        //same concept as above method but instead, we add a node before 'node2'
        Node tmp = head;
        while(tmp != null)
        {
            if(tmp == node1){
                if(tmp.prev == null)//node1 is at the head
                    pushFront(node2);
                else//somewhere at the middle or even at the tail
                {
                    node2.prev = tmp.prev;
                    node2.prev.next = node2;
                    node2.next = tmp;
                    tmp.prev = node2;
                }
            }tmp = tmp.next;
        }
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    public void merge(DoublyLinkedList list){
        if(isEmpty())
        {//this list is empty, set head and tail to the given list's head and tail
            this.head = list.head;
            this.tail = list.tail;
        }
        else
        {
            this.tail.next = list.head;//connect tail with the given list's head
            list.head.prev = this.tail;//connect the given list's head with tail
            this.tail = list.tail;//change tail's position
        }
    }
    
    public void printStructure(){
        Node current=head;
        System.out.print(listName + ": head <-> ");
        while(current!=null){
            System.out.print("{" + current.student_id + "} <-> ");
            current = current.next;
        }
        System.out.println("tail");
    }
    
    // This may be useful for you for implementing printStructure()
    public void printStructureBackward(){ 
        Node current=tail;
        System.out.print(listName + ": tail <-> ");
        while(current!=null){
            System.out.print("{" + current.student_id + "} <-> ");
            current = current.prev;
        }
        System.out.println("head");
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node("Empty List!");
        } else {
            //we simply compare first 2 elements at the very first loop, but, sure we also check if it has only one element in a list
            Node tmp = head.next;
            int id = head.student_id;
            double max = head.gpa;
            while(tmp != null)
            {
                if(tmp.gpa >= max)
                {
                    max = tmp.gpa;
                    id = tmp.student_id;
                }
                tmp = tmp.next;
            }
            return findNode(id);
        }
    }
}
