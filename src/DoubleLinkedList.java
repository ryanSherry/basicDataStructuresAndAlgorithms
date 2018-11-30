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

    void insertNodeBefore(Node next_node, int data) {

       //check if given node is null
        if (next_node == null) {
            System.out.println("Provided node is null");
            return;
        }

        //create new node
        Node new_node = new Node(data);
        //link new node forward
        new_node.next = next_node;
        //link new node backwards
        new_node.previous = next_node.previous;
        //link node that comes before the new node forwards
        next_node.previous.next = new_node;
        //link next node backwards
        next_node.previous = new_node;

    }

    void insertNodeAfter(Node prev_node, int data) {

       //check if given node is null
        if(prev_node == null) {
            System.out.println("Provided node is null");
            return;
        }

       //create new node
        Node new_node = new Node(data);
        //point new node back at provided node
        new_node.previous = prev_node;
        //point new node to next node
        new_node.next = prev_node.next;
        //point provided node to new node
        prev_node.next = new_node;
        //if new_node.next is not null, link its next node back to it
        if (new_node.next != null) {
            new_node.next.previous = new_node;
        }
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
