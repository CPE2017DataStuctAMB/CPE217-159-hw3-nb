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
            this.tail.next = null;
        }
    }
    
    public void popFront(){
        if (isEmpty()){
            System.out.println("ERROR");
        }else{
            this.head = this.head.next;
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
            this.head = node;
            this.tail = this.head;
        }else{
            this.head.prev = node;
            this.head.prev.next = this.head;
            this.head = this.head.prev;
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()) {
            this.head = node;
            this.tail = this.head;
        } else {
            this.tail.next = node;
            this.tail.next.prev = this.tail;
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
                    if(tmp.prev == null)
                        popFront();
                    else if(tmp.next == null)
                        popBack();
                    else
                    {
                        //Kuy not ggez
                        tmp.next.prev = tmp.prev;
                        tmp.prev.next = tmp.next;
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
                if(tmp.next == null)
                    pushBack(node2);
                else
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
        Node tmp = head;
        while(tmp != null)
        {
            if(tmp == node1)
            {
                if(tmp.prev == null)
                    pushFront(node2);
                else
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
        {
            this.head = list.head;
            this.tail = list.tail;
        }
        else
        {
            this.tail.next = list.head;
            list.head.prev = this.tail;
            this.tail = list.tail;
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
