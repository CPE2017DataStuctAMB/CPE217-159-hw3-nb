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
public class SinglyLinkedList {
    Node head;
    String listName;
    
    public SinglyLinkedList(String name){
        head = null;
        this.listName = name;
    }
    
    public void popBack() {
        if (isEmpty()){
            System.out.println("ERROR");
        }else{
            Node tmp = head, tmp2 = tmp;
            while(tmp.next != null)
            {
                //tmp2 takes tmp's previous value, to make sure that we can remove tail and set the new one easily
                tmp2 = tmp;
                tmp = tmp.next;
            }
            //tmp2 is now tmp's previous value
            if(tmp == head)
                head = null;
            else
                tmp2.next = null;//disconnect the tail
        }
    }
    
    public void popFront(){
        if (isEmpty()){
            System.out.println("ERROR");
        }else{//it works in every cases even it has one item in a list (after pop, the list contains no item; null; head.next is null)
            head = head.next;
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List");
        } else {
            return head;
        }
    }
    
    public Node topBack(){ 
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List");
        } else {
            Node tmp = head;
            while(tmp.next != null)//loop through list till the end of the list
                tmp = tmp.next;
            return tmp;
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){
            head = node;
            head.next = null;
        }else{
            node.next = head;
            head = node;
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()){
            head = node;
            head.next = null;
        } else {
            Node tmp = head;
            while(tmp.next != null)
                tmp = tmp.next;
            tmp.next = node;
        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node("Empty List");
        } else {
            Node tmp = head;
            while(tmp != null)//iterate till last element
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
            Node tmp = head, tmp2 = tmp;
            while(tmp != null)
            {
                if(tmp.student_id == id)
                {
                    if(tmp == head)//find at the head
                        popFront();
                    else if(tmp.next == null)//find at the tail
                        popBack();
                    else
                        tmp2.next = tmp.next;
                    return tmp;
                }
                tmp2 = tmp;
                tmp = tmp.next;
            }
            return new Node("Student Not Found!");
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){
        Node tmp = head;
        while(tmp != null){
            if(tmp == node1){
                if(tmp.next == null)
                    pushBack(node2);
                else{
                    node2.next = tmp.next;
                    tmp.next = node2;
                }
            }
            tmp = tmp.next;
        }
    }
    
    public void addNodeBefore(Node node1, Node node2){
        Node tmp = head, tmp2 = tmp;
        while(tmp != null){
            if(tmp == node1){
                if(tmp == head)
                    pushFront(node2);
                else{
                    node2.next = tmp;
                    tmp2.next = node2;
                }
            }
            tmp2 = tmp;
            tmp = tmp.next;
        }
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    public void merge(SinglyLinkedList list){
        if(isEmpty())
            head = list.head;
        else
        {
            Node tmp = head;
            while(tmp.next != null)
                tmp = tmp.next;
            tmp.next = list.head;
        }
    }
    
    public void printStructure(){
        Node current=head;
        System.out.print(listName + ": head -> ");
        while(current!=null){
            System.out.print("{" + current.student_id + "} -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node("Empty List!");
        } else {
            Node tmp = head.next;
            int id = head.student_id;
            double max = head.gpa;
            while(tmp != null){
                if(tmp.gpa >= max){
                    id = tmp.student_id;
                    max = tmp.gpa;
                }
                tmp = tmp.next;
            }
            return findNode(id);
        }
    }
}
