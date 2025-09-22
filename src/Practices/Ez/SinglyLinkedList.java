package Practices.Ez;

public class SinglyLinkedList {

    // Singly Node
    public static class Node {

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        int data;
        Node next;
    }

    public static class SinglyLinkedListDemo {

        public SinglyLinkedListDemo() {}

        Node head;

        public void add(int data) {

            Node newNode = new Node(data);

            // Head will be the Node if the LinkedList is not once init
            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            // Move the current node to the tail
            while (current.next != null) {
                current = current.next;
            }

            // Assign the new Node as the tail
            current.next = newNode;
        }

        public void printAllElementsOut() {

            System.out.println();

            Node current = head;

            // Traverse through the LinkedList to the tail + print the current value of the current node
            while (current.next != null) {

                System.out.print(current.data + " => ");
                current = current.next;
            }

            // The current Node is the tail, so we just print out the tail as the last Node
            System.out.print(current.data);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        SinglyLinkedListDemo singlyLL = new SinglyLinkedListDemo();

        singlyLL.add(10);
        singlyLL.add(20);
        singlyLL.add(30);
        singlyLL.add(40);
        singlyLL.add(50);

        singlyLL.printAllElementsOut();
    }
}
