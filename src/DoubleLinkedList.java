public class DoubleLinkedList {

    Node head;

   static class Node {
       int item;
       Node next;
       Node previous;

        Node(int item) {
            this.item = item;
            this.next = null;
            this.previous = null;
        }
    }

    void printList(){
        Node node = head;

        if (node == null) {
            System.out.println("List is empty, nothing to print");
            return;
        }

        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }

    void insertNodeFirst(int data) {
        Node nodeToInsert = new Node(data);
        nodeToInsert.next = head;
        nodeToInsert.previous = null;

        if (head != null) {
            head.previous = nodeToInsert;
            head = nodeToInsert;
        }
    }

    void removeNodeFirst() {
        head = head.next;
        head.previous = null;
    }

    void insertNodeLast(int data) {

       if(head == null) {
           head = new Node(data);
           head.previous = null;
           return;
       }

        Node node = head;
        while(node != null) {
            node = node.next;
        }
        node.next = new Node(data);
        node.next.previous = node;
    }

    void removeNodeLast() {

    }

    void insertNodeBefore() {

    }

    void insertNodeAfter() {

    }

    int listLength() {
        Node n = head;
        int i = 0;

        while (n != null) {
            n = n.next;
            i++;
        }

        return i + 1;
    }

    public static void main(String[] args) {

    }
}
