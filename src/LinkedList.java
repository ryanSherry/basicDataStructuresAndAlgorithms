public class LinkedList {

    //head of list
    Node head;

    //inner class made static so main can access it.
    static class Node {
        int item;
        Node next;

        // inner class constructor
        Node(int item) {
            this.item = item;
            this.next = null;
        }

    }

    // function to print contents of linkedList

    public void printLinkedList() {

        // Get reference to head of list
        Node n = head;

        while (n != null) {
            System.out.print(n.item + " ");
            n = n.next;
        }
    }

    public void addToBeginning(int value) {
        Node oldHead = head;
        head = new Node(value);
        head.next = oldHead;
    }

    public void removeFromBeginning() {
        head = head.next;
    }

    public void addToEnd(int value) {
        Node n = head;
        Node newTail = new Node(value);
        while (n != null) {

            if (n.next == null) {
                n.next = newTail;
                break;
            }
            n = n.next;
        }
    }

    public void removeFromEnd() {
        Node n = head;
        Node secondToLast;

         while (n.next != null) {
             if (n.next.next == null) {
                 n.next = null;
                 break;
             }
             n = n.next;
         }
    }

    public void addAtNode(int targetValue, int newValue) {
        Node n = head;
        Node nodeToAdd = new Node(newValue);
        while (n.item != targetValue) {

            if (n.next.item == targetValue) {
                nodeToAdd.next = n.next.next;
                n.next = nodeToAdd;
                break;
            }
            n = n.next;
        }
    }

        public static void main(String[] args) {

            //start with empty list
            LinkedList linkedList = new LinkedList();

            //create the head of list and a couple other nodes
            linkedList.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            //link nodes to the list
            linkedList.head.next = second;
            second.next = third;

            // add to beginning of list

            linkedList.addToBeginning(0);

            linkedList.addToBeginning(99);

            // remove from beginning of list

            linkedList.removeFromBeginning();

            //add to end of list

            linkedList.addToEnd(4);

            linkedList.addToEnd(5);

            //remove from end of list

            linkedList.removeFromEnd();

            //add node at value

            linkedList.addAtNode(3, 99);

            //traverse list

            linkedList.printLinkedList();


        }
}
