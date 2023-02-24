//task 1
import java.util.LinkedList;

public class sem4 {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
          
    /* Function for reversing the linked list */
    Node reverse_linkedlist(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        node = prev;
        return node;
    }
          
    // prints the double linked_list
    void print_LinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
          
            // Driver Code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
          
        System.out.println("Given Linked List");
        list.print_LinkedList(head);
        head = list.reverse_linkedlist(head);
        System.out.println("");
        System.out.println("Reversed Linked List ");
        list.print_LinkedList(head);
    }
}
    

