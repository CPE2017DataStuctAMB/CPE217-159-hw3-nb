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
        for(int i=0; i<=6;i++){
            testcase(i);
        }
    }
        public static void testcase(int num){
            //this function for test testcase
            System.out.println("\n-------TestCast"+num+"---------");
            if(num == 0){
                Node node;
                SinglyLinkedList list0;
                DoublyLinkedList listd0;
                node = new Node();
                list0 = new SinglyLinkedList("Hello World!");
                listd0 = new DoublyLinkedList("Hello World!");
            }
            else if(num == 1){
                Node node;
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
            }
            else if(num == 2){
                Node node;
                DoublyLinkedList list = new DoublyLinkedList("list3");
                node = list.topFront();
                node.printIDName();
                node = list.topBack();
                node.printIDName();
                list.pushBack(new Node(5806001, "Matthew", 3.50));
                list.pushBack(new Node(5806002, "Mark", 2.75));
                list.pushBack(new Node(5806003, "Luke", 3.00));
                node = list.topFront();
                node.printIDName();
                node = list.topBack();
                node.printIDName();
            }
            
            else if(num == 3){
                DoublyLinkedList list = new DoublyLinkedList("list4");
                list.printStructure();
                list.popFront();
                list.pushBack(new Node(5806001, "Matthew", 3.50));
                list.pushBack(new Node(5806002, "Mark", 2.75));
                list.pushBack(new Node(5806003, "Luke", 3.00));
                list.pushBack(new Node(5806004, "John", 3.75));
                list.printStructure();
                list.popFront();
                list.printStructure();
                list.popBack();
                list.printStructure();
                list.popFront();
                list.printStructure();
                list.popBack();
                list.printStructure();
                list.popBack();
            }
            
            else if(num == 4){
                Node node;
                DoublyLinkedList list = new DoublyLinkedList("list5");
                node = list.whoGotHighestGPA();
                node.printIDName();
                list.pushBack(new Node(5806001, "Matthew", 3.00));
                list.pushBack(new Node(5806002, "Mark", 2.75));
                list.pushBack(new Node(5806003, "Luke", 3.25));
                list.printStructure();
                node = list.whoGotHighestGPA();
                node.printIDName();
                Node newNode = new Node(5806004, "John", 3.30);
                list.addNodeAfter(node, newNode);
                list.printStructure();
                list.addNodeBefore(list.whoGotHighestGPA(), new Node(5806005, "James", 3.30));
                list.printStructure();
                (list.whoGotHighestGPA()).printIDName();
            }
            
            else if(num == 5){
                Node node;
                DoublyLinkedList list = new DoublyLinkedList("list6");
                list.pushBack(new Node(5806001, "Matthew", 3.00));
                list.pushBack(new Node(5806002, "Mark", 2.75));
                list.pushBack(new Node(5806003, "Luke", 3.25));
                list.printStructure();
                node = list.whoGotHighestGPA();
                node.printIDName();
                Node newNode = new Node(5806004, "John", 3.30);
                list.addNodeAfter(node, newNode);
                list.printStructure();
                list.addNodeBefore(list.whoGotHighestGPA(), new Node(5806005, "James", 3.40));
                list.printStructure();
                (list.whoGotHighestGPA()).printIDName();
            }
            
            else if(num == 6){
                DoublyLinkedList list = new DoublyLinkedList("list7");
                (list.findNode(5806001)).printIDName();
                (list.eraseNode(5806001)).printIDName();
                list.pushBack(new Node(5806001, "Matthew", 3.50));
                list.pushBack(new Node(5806002, "Mark", 2.75));
                list.pushBack(new Node(5806003, "Luke", 3.00));
                list.pushBack(new Node(5806004, "John", 3.75));
                list.pushBack(new Node(5806005, "James", 3.25));
                list.pushBack(new Node(5806006, "Peter", 2.85));
                list.printStructure();
                (list.findNode(5806001)).printIDName();
                (list.findNode(5806006)).printIDName();
                (list.findNode(5806007)).printIDName();
                Node node = list.findNode(5806003);
                list.addNodeAfter(node, new Node(5806007, "John", 2.50));
                list.printStructure();
                (list.eraseNode(5806001)).printIDName();
                list.printStructure();
                (list.eraseNode(5806006)).printIDName();
                list.printStructure();
                (list.eraseNode(5806003)).printIDName();
                list.printStructure();
                (list.eraseNode(5806008)).printIDName();
                list.printStructure();
            }
        }
}
