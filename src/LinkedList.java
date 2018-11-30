public class LinkedList {

    //head of list
    Node head;

    //inner class made static so main can access it.
    static class Node {
        int item;
        Node next;
        Node previous;

        // inner class constructor
        Node(int item) {
            this.item = item;
            this.next = null;
            this.previous = null;
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

    //inserts new node at beginning of list

    public void appendNodeBeginning(int value) {

        //1. create new node
        Node new_node = new Node(value);
        //2. set new node's reference to current head and previous as null
        new_node.next = head;
        new_node.previous = null;
        //3. change previous of head node to the new node
        if (head != null) head.previous = new_node;
        //4. set new node as the new head reference
        head = new_node;
    }

    public void removeNodeBeginning() {
        head = head.next;
    }

    public void appendNodeEnd(int value) {
        //1. Create new node with data

        Node newTail = new Node(value);

        //2. If list is empty, make new node the head

        if (head == null) {
            newTail.previous = null;
            head = new Node(value);
            return;
        }

        //3. Otherwise, traverse list till last node

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        //4. Change the next of last current node to the new node
        last.next = newTail;
        //5. Make the current node the previous of the new node
        newTail.previous = last;
        return;
    }

    public void removeNodeAtKey(int key) {
        //1. Store head node
        Node temp = head, prev = null;

        //2. If head has Node with matching key, then we make the next node the new head
        if(temp != null && temp.item == key) {
            head = temp.next;
            return;
        }

        //3. Search for Node with key to be deleted. We need to keep track of the previous node
        while (temp != null && temp.item != key) {
            prev = temp;
            temp = temp.next;
        }

        //4. If key is not present in list, return
        if (temp == null) {
            return;
        }

        //5. Unlink the node from the Linked List
        prev.next = temp.next;
    }

    public void removeNodeEnd() {
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

//    public void addAtNode(int targetValue, int newValue) {
//        Node n = head;
//        Node nodeToAdd = new Node(newValue);
//        while (n.item != targetValue) {
//
//            if (n.next.item == targetValue) {
//                nodeToAdd.next = n.next.next;
//                n.next = nodeToAdd;
//                break;
//            }
//            n = n.next;
//        }
//    }

    void insertNodeAfter(Node target_node, int newData) {

        //1. Check if target node is null
        if (target_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        //2. Create node with data

        Node new_node = new Node(newData);

        //3. Link new_node to nodes after the target_node

        new_node.next = target_node.next;

        //4. Link target_node to new_node

        target_node.next = new_node;

        //5. Link new node to the previous node which is the target node

        new_node.previous = target_node;

        //6. I don't understand this part???

        if (new_node.next != null) new_node.next.previous = new_node;

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

            linkedList.appendNodeBeginning(0);

            linkedList.appendNodeBeginning(99);

            // remove from beginning of list

            linkedList.removeNodeBeginning();

            //add to end of list

            linkedList.appendNodeEnd(4);

            linkedList.appendNodeEnd(5);

            //remove from end of list

            linkedList.removeNodeEnd();

            //add node at value

            linkedList.insertNodeAfter(second, 99);

            //add node at index

            linkedList.insertNodeAfter(third, 88);

            //traverse list

            linkedList.printLinkedList();


        }
}
