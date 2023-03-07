import java.util.Deque;
import java.util.LinkedList;
//task 1 Reversed Link List
public class sem4 {
    public static void main(String[] args) {
       /* Node n1 = new Node(22);
        Node n2 = new Node(52);
        Node n3 = new Node(13);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printLinkedList(n1);
        System.out.println();
        Node newHead = reverse(n1);
        printLinkedList(newHead);
    }
    static class Node {
        int data;
        Node next;
        Node(int tmp) {
            data = tmp;
        }
    }
    static Node reverse(Node node)  {
        Node prev = null;
        Node curr = node;
        Node next = null;

        while(curr != null)  {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void printLinkedList (Node head) {
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    */
    //task 2 dequeue() - возвращает первый элемент из очереди и удаляет его, 
    //first() - возвращает первый элемент из очереди, не удаляя.
    
        Deque<Product> Products = new LinkedList<Product>();
        Product p1 = new Product(1, " Mazda ");
        Product p2 = new Product(2, " Toyota  ");
        Product p3 = new Product(3, "Nissan");
        Product p4 = new Product(4, "BMW ");

        Products.addFirst(p4);
        Products.addFirst(p2);
        Products.addLast(p3);
        Products.addLast(p1);
        System.out.println(Products);

        Product Head = Products.getFirst();
        System.out.println("Head is : " +Head);
        
        Products.removeFirst();
        System.out.println(Products);

        


        
    }    
}
