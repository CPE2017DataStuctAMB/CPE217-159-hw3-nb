การบ้านนี้ให้นักศึกษา implement “Linked List ADT” โดยใช้ Java โดยให้มีคุณสมบัติดังต่อไปนี้
1. ให้สร้าง class ชื่อว่า DoublyLinkedList โดย class นี้ มีคุณสมบัติของ “Doubly-linked list with tail” ตามที่ได้เรียนในห้องเรียน
2. ให้ object ของ DoublyLinkedList ทำหน้าที่บรรจุ objects ของ class Node โดย class Node นี้ มีสมาชิกที่เป็นตัวแปรอย่างน้อยสามตัว 
คือ student_id (ชนิด int), name (ชนิด String) และ gpa (ชนิด double)
* ในการ implement Doubly-linked list with tail คุณสามารถใช้ references head และ tail ได้อย่างเต็มที่
แต่ถ้าจะทำการ implement Singly-linked list without tail (ตามข้อ 6) คุณสามารถใช้ reference head
ได้แต่เพียงอย่างเดียว
3.ให้ class Node มี 2 Constructors (Overloading functions) ดังนี้
* Node(int id, String name, double gpa)
* ทำหน้าที่ กำหนดค่าเริ่มต้นของทั้งสามตัวแปรตามที่ผู้ใช้กำหนด
* Node(String error_msg)
* Constructor ชนิดนี้จะถูกใช้เพื่อสร้าง dummy Node เพื่อ return ให้กับ caller ในกรณีเกิด ERROR ขึ้น
..* โดย Error Message ที่เกิดขึ้นให้เซตไปที่ค่าของตัวแปร name ส่วนค่าเริ่มต้นสำหรับตัวแปรที่
เหลือ ให้ใช้ค่า default ของ Java
* ใน starter code ผมได้เติม constructor Node() ไว้อีกอันนึง เพื่อไม่ให้ dummy code ของผมมันฟ้อง error
คุณไม่ต้องสนใจฟังก์ชันอันนี้นะครับ ให้สนใจเฉพาะสองฟังก์ชันข้างบนก็พอ
4. ให้ class Node มีฟังก์ชัน public public void printIDName()
* ฟังก์ชันนี้ทำหน้าที่ พิมพ์ค่าของ student_id และ name ของออกทาง console
* ใน starter code มีให้ละครับ
5. ให้ class DoublyLinkedList มี public functions ดังต่อไปนี้
* public LinkedList1(String name)
..* ฟังก์ชันนี้ทำหน้าที่เป็น Constructor ของ List โดยกำหนดชื่อของ List คือค่าของตัวแปร name
* public void pushFront(Node node)
..* ฟังก์ชันนี้ทำหน้าที่นำ node มาเติมข้างหน้าสุดของ list (referenced by head)
* public Node topFront()
..* ฟังก์ชันนี้ทำหน้าที่ return node ที่อยู่ข้างหน้าสุดของ list (referenced by head)
..* ถ้า List ว่าง ให้ print ออกทาง console ก่อนเลยว่า ERROR แล้ว ให้ return ด้วย Node ที่ถูก
