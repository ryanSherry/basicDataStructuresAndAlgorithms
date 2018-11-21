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

    void printLinkedList(){

    }

    void addToBeginning() {

    }

    void removeFromBeginning() {

    }

    void addToEnd() {

    }

    void removeFromEnd() {

    }

    void addAtNode() {

    }

//    void addAtIndex(int indexTarget) {
//
//        Node n = head;
//        Node nodeToInsert = new Node(88);
//        int length = listLength();
//
//        if (indexTarget >= length) {
//            throw new IndexOutOfBoundsException("Index outside of the bounds of the linked list");
//        }
//
//        for (int i = 0; i <= indexTarget; i++) {
//
//            // subracting 1 for index and 1 for previous node
//
//            if (i == length - 2) {
//                nodeToInsert.next = n.next.next;
//                n.next = nodeToInsert;
//            }
//
//            if(n.next != null) {
//                n = n.next;
//            }
//        }
//    }

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
