public class LinkedList {

    //head of list
    Node head;

    //Node innerclass
    static class Node {
        int item;
        Node next;

        //Node constructor
        Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    //Print list
    void printList(){
        Node node = head;
        while(node != null) {
            System.out.println(node.item + " ");
            node = node.next;
        }
    }

    //Insert Node as head
    void insertNodeFirst(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    //Remove current head
    void removeNodeFirst() {

        if (head == null) {
            System.out.println("No Node to remove");
            return;
        }

        head = head.next;
    }

    //Insert Node as tail
    void insertNodeLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node node = head;

        while(node.next != null) {
            node = node.next;
        }

        node.next = new Node(value);
    }

    //Remove current tail
    void removeNodeLast() {
        if (head.next == null) {
            head = null;
            return;
        }

        Node node = head;

        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                break;
            }

            node = node.next;
        }

    }

    void insertNodeBefore(Node target, int value) {
        if (target == null) {
            System.out.println("target node is null");
            return;
        }

        Node nodeToInsert = new Node(value);
        nodeToInsert.next = target.next;
        target.next = nodeToInsert;
    }

    void removeNodeSpecified(Node target) {
        if (target == null) {
            System.out.println("target node is null");
            return;
        }

        if (target == head) {
            System.out.println("target is head, can't perform this operation. Use removeNodeFirst instead");
            return;
        }

        Node node = head;
        Node previous = head;
        while(node.next != null) {
            if (node == target) {
                previous.next = previous.next.next;
                return;
            }
            previous = node;
            node = node.next;
        }
    }


    void insertNodeAfter(Node target, int value) {
        if (target == null) {
            System.out.println("target node is null");
            return;
        }

        Node nodeToInsert = new Node(value);

        nodeToInsert.next = target.next;
        target.next = nodeToInsert;
    }

    void removeNodeAfter(Node target) {
        if (target == null) {
            System.out.println("target node is null");
            return;
        }

        Node node = head;
        while(node.next != null) {
            if (node.next == target) {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
    }

    int listLength() {
        Node node = head;
        int count = 0;
        while(node != null) {
            node = node.next;
            count++;
        }
        System.out.println("The length of the list is " + count);
        return count;
    }

    void findMidPoint() {
        double listLength = listLength();
        double midPoint = Math.ceil(listLength/2);
        Node node = head;

        for (int i = 0; i < midPoint - 1; i++) {
            node = node.next;
        }

        if (listLength > 1 && listLength % 2 == 0) {
            System.out.println("The mid point value is between " + node.item + " and " + node.next.item);

        } else {
            System.out.println("The mid point value is " + node.item);
            getNthNode((int)midPoint);
        }
    }

    Node getNthNode(int n) {
        Node node = head;

        if (node == null) {
            System.out.println("node is null");
            return null;
        }

        for (int i = 0; i < n - 1; i++) {
            node = node.next;
        }

        System.out.println("Node has a value of " + node.item);
        return node;
    }

    void reverseList(Node node) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        Node hello = linkedList.head.next;

        linkedList.insertNodeAfter(hello, 99);
        linkedList.removeNodeSpecified(linkedList.head.next.next);
        linkedList.insertNodeLast(5);
        linkedList.insertNodeLast(6);

        linkedList.printList();
        linkedList.listLength();
        linkedList.findMidPoint();
        linkedList.reverseList(linkedList.head);
        linkedList.printList();
    }

}
