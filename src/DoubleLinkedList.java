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

    void insertNodeFirst() {

    }

    void removeNodeFirst() {

    }

    void insertNodeLast() {

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
