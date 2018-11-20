import org.junit.jupiter.api.Test;

public class LinkedListTest {
    LinkedList testLinkedList = new LinkedList();

    @Test
    void beforeInitializationTest() {
        assert testLinkedList.head == null;
    }

    @Test
    void initilizeHeadTest() {
        testLinkedList.head = new LinkedList.Node(1);
        testLinkedList.head.next = new LinkedList.Node(2);

        assert testLinkedList.head.next != null;

    }
}