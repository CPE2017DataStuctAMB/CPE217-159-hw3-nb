การบ้านนี้ให้นักศึกษา implement “Linked List ADT” โดยใช้ Java โดยให้มีคุณสมบัติดังต่อไปนี้
### ให้สร้าง class ชื่อว่า DoublyLinkedList โดย class นี้ มีคุณสมบัติของ “Doubly-linked list with tail” ตามที่ได้เรียน
ในห้องเรียน
### ให้ object ของ DoublyLinkedList ทำหน้าที่บรรจุ objects ของ class Node โดย class Node นี้ มีสมาชิกที่เป็นตัว
แปรอย่างน้อยสามตัว คือ student_id (ชนิด int), name (ชนิด String) และ gpa (ชนิด double)
* ในการ implement Doubly-linked list with tail คุณสามารถใช้ references head และ tail ได้อย่างเต็มที่
แต่ถ้าจะทำการ implement Singly-linked list without tail (ตามข้อ 6) คุณสามารถใช้ reference head
ได้แต่เพียงอย่างเดียว
### ให้ class Node มี 2 Constructors (Overloading functions) ดังนี้
* Node(int id, String name, double gpa)
 ทำหน้าที่ กำหนดค่าเริ่มต้นของทั้งสามตัวแปรตามที่ผู้ใช้กำหนด
* Node(String error_msg)
 Constructor ชนิดนี้จะถูกใช้เพื่อสร้าง dummy Node เพื่อ return ให้กับ caller ในกรณีเกิด
ERROR ขึ้น
** โดย Error Message ที่เกิดขึ้นให้เซตไปที่ค่าของตัวแปร name ส่วนค่าเริ่มต้นสำหรับตัวแปรที่
เหลือ ให้ใช้ค่า default ของ Java
* ใน starter code ผมได้เติม constructor Node() ไว้อีกอันนึง เพื่อไม่ให้ dummy code ของผมมันฟ้อง error
คุณไม่ต้องสนใจฟังก์ชันอันนี้นะครับ ให้สนใจเฉพาะสองฟังก์ชันข้างบนก็พอ
4. ให้ class Node มีฟังก์ชัน public public void printIDName()
 ฟังก์ชันนี้ทำหน้าที่ พิมพ์ค่าของ student_id และ name ของออกทาง console
 ใน starter code มีให้ละครับ
5. ให้ class DoublyLinkedList มี public functions ดังต่อไปนี้
a. public LinkedList1(String name)
 ฟังก์ชันนี้ทำหน้าที่เป็น Constructor ของ List โดยกำหนดชื่อของ List คือค่าของตัวแปร name
b. public void pushFront(Node node)
 ฟังก์ชันนี้ทำหน้าที่นำ node มาเติมข้างหน้าสุดของ list (referenced by head)
c. public Node topFront()
 ฟังก์ชันนี้ทำหน้าที่ return node ที่อยู่ข้างหน้าสุดของ list (referenced by head)
 ถ้า List ว่าง ให้ print ออกทาง console ก่อนเลยว่า ERROR แล้ว ให้ return ด้วย Node ที่ถูก
สร้างด้วย Constructor แบบที่สอง โดยให้มี Error Message ว่า “Empty List!”
d. public void popFront()
 ฟังก์ชันนี้ทำหน้าที่ ลบ node ที่อยู่ข้างหน้าสุดของ list (referenced by head) ออกไป
 ถ้า List ว่าง ให้ print ออกทาง console ว่า ERRORe. public void pushback(Node node)
 ฟังก์ชันนี้ทำหน้าที่นำ node ไปต่อท้าย node ที่อยู่หลังสุด
f. public Node topBack()
 ฟังก์ชันนี้ทำหน้าที่ return node ที่อยู่ข้างหลังสุดของ list
 ถ้า List ว่าง ให้ print ออกทาง console ก่อนเลยว่า ERROR แล้ว ให้ return ด้วย Node ที่ถูก
สร้างด้วย Constructor แบบที่สอง โดยให้มี Error Message ว่า “Empty List!”
g. public void popBack()
 ฟังก์ชันนี้ทำหน้าที่ ลบ node ที่อยู่ข้างหลังสุดของ list ออกไป
 ถ้า List ว่าง ให้ print ออกทาง console ว่า ERROR
h. public Node findNode(int id)
 ฟังก์ชันนี้ทำหน้าที่ return Node ที่มีค่า student_id เท่ากับ id
 ถ้า List ว่าง ให้ return ด้วย Node ที่ถูกสร้างด้วย Constructor แบบที่สอง โดยให้มี Error
Message ว่า “Empty List!” (ไม่ต้องแจ้งว่า ERROR)
 ถ้า List ไม่ว่างแต่หา node นั้นไม่เจอให้ return ด้วย Node ที่ถูกสร้างด้วย Constructor แบบที่
สอง โดยให้มี Error Message ว่า “Student Not Found!”
i. public Node eraseNode(int id)
 ฟังก์ชันนี้ทำหน้าที่หา Node ที่มีค่า student_id เท่ากับ id ใน List เมื่อเจอแล้วให้ลบ Node นั้น
ออกจาก List นอกจากนี้ ให้ return Node ที่ลบนั้นออกไปให้ caller อีกด้วย
 ถ้า List ว่าง ให้ print ออกทาง console ก่อนเลยว่า ERROR แล้ว ให้ return ด้วย Node ที่ถูก
สร้างด้วย Constructor แบบที่สอง โดยให้มี Error Message ว่า “Empty List!”
 ถ้าหา node นั้นไม่เจอให้ return ด้วย Node ที่ถูกสร้างด้วย Constructor แบบที่สอง โดยให้มี
Error Message ว่า “Student Not Found!”
j. public boolean isEmpty()
 ฟังก์ชันนี้ทำหน้าที่ return ว่า Data structure นี้ว่างหรือไม่
k. public void addNodeAfter(Node node1, Node node2)
 ฟังก์ชันนี้ทำหน้าที่นำ node2 (ซึ่งเป็น Node เดี่ยวๆ) ไปแทรกใน list โดยนำไปแทรกด้านหลังของ
node1 (ซึ่งมีอยู่ใน list อยู่แล้ว)
l. public void addNodeBefore(Node node1, Node node2)
 ฟังก์ชันนี้ทำหน้าที่นำ node2 (ซึ่งเป็น Node เดี่ยวๆ) ไปแทรกใน list โดยนำไปแทรกด้านหน้าของ
node1 (ซึ่งมีอยู่ใน list อยู่แล้ว)
m. public Node whoGotHighestGPA()
 ฟังก์ชันนี้ทำหน้าที่หาว่า Node ไหนมีนักเรียนที่ได้ GPA สูงที่สุด ถ้า List ว่าง ให้ return ด้วย Node ที่ถูกสร้างด้วย Constructor แบบที่สอง โดยให้มี Error
Message ว่า “Empty List!” (ไม่ต้องแจ้งว่า ERROR)
 ถ้าคนที่ได้ GPA สูงที่สุดมีมากกว่าหนึ่งคน ให้ return คนที่อยู่ไกล head (ใกล้ tail) มากที่สุด
n. public void merge(List list)
 ฟังก์ชันนี้ทำหน้าที่รวม List สองตัวเข้าด้วยกัน โดยนำ List (list) ที่นำเข้า เข้าต่อด้านหลังสุดของ
List (this) ปัจจุบัน
o. public void printStructure()
 ให้ print สถานะข้อมูลของ Data structure ออกทาง console ด้วย pattern ดังต่อไปนี้
 หาก SinglyLinkedList ชื่อ list1 มีข้อมูลคือ {{58061, “Mathew”, 3.0}, {58062, “Mark”, 2.0},
{58063, “Luke”, 2.5}, {58064, “John”, 3.25}} ให้แสดงว่า
 list1: head -> {58061} -> {58062} -> {58063} -> {58064} -> null
 หาก DoubleLinkedList ชื่อ list2 มีข้อมูลคือ {{58064, “John”, 3.25}, {58062, “Mark”, 2.0}}
ให้แสดงว่า
 list2: head <-> {58064} <-> {58062} <-> tail
6. ให้สร้าง class ชื่อว่า SinglyLinkedList โดย class นี้ มีคุณสมบัติของ “Singly-linked list without tail” (ไม่มีหาง)
ตามที่ได้เรียนในห้องเรียน โดยกำหนดให้คลาสนี้สามารถดำเนินการได้ตามข้อ 5a. – 5o. เหมือนกับที่คุณทำ
มาแล้วได้ทั้งหม
