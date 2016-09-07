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
public class Main {
        public static void main(String[] args) {
        // TODO code application logic here
        Node node;
        SinglyLinkedList list0;
        DoublyLinkedList listd0;
        node = new Node();
        list0 = new SinglyLinkedList("Hello World!");
        listd0 = new DoublyLinkedList("Hello World!");
        
        //TestCast
        DoublyLinkedList list1 = new DoublyLinkedList("list1");
        node = new Node(5806001, "Matthew", 3.50);
        list1.pushFront(node);
        node = new Node(5806002, "Mark", 2.75);
        list1.pushFront(node);
        node = new Node(5806003, "Luke", 3.00);
        list1.pushFront(node);
        node = new Node(5806004, "John", 3.75);
        list1.pushFront(node);
        list1.printStructure();
        DoublyLinkedList list2 = new DoublyLinkedList("list2");
        list2.pushBack(new Node(5806005, "James", 3.25));
        list2.pushBack(new Node(5806006, "Peter", 2.85));
        list2.pushBack(new Node(5806007, "John", 2.50));
        list2.pushBack(new Node(5806008, "Jude", 3.15));
        list2.printStructure();
        list1.merge(list2);
        list1.printStructure();
        
        System.out.println("\n-------TestCast2---------");
        DoublyLinkedList list3 = new DoublyLinkedList("list3");
        node = list3.topFront();
        node.printIDName();
        node = list3.topBack();
        node.printIDName();
        list3.pushBack(new Node(5806001, "Matthew", 3.50));
        list3.pushBack(new Node(5806002, "Mark", 2.75));
        list3.pushBack(new Node(5806003, "Luke", 3.00));
        node = list3.topFront();
        node.printIDName();
        node = list3.topBack();
        node.printIDName();
        
        System.out.println("\n-------TestCast3---------");
        DoublyLinkedList list4 = new DoublyLinkedList("list4");
        list4.printStructure();
        list4.popFront();
        list4.pushBack(new Node(5806001, "Matthew", 3.50));
        list4.pushBack(new Node(5806002, "Mark", 2.75));
        list4.pushBack(new Node(5806003, "Luke", 3.00));
        list4.pushBack(new Node(5806004, "John", 3.75));
        list4.printStructure();
        list4.popFront();
        list4.printStructure();
        list4.popBack();
        list4.printStructure();
        list4.popFront();
        list4.printStructure();
        list4.popBack();
        list4.printStructure();
        list4.popBack();
        
    }
}
