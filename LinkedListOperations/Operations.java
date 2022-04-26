package LinkedListOperations;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Operations<T> {
    private Node<T> start;
    void insertAtEnd(Node<T> node) {
        if(start == null) {
            start = node;
            return;
        }
        Node<T> current = start;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    void deleteAtAnyPos(int pos) {
        Node<T> temp = null;
        if(start == null) {
            System.out.println("Linked List in Empty...");
            return;
        }

        if(pos == 0) {
            temp = start.next;
            start = temp;
            return;
        }

        temp = start;
        int i = 1;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    void reverserIterate() {
        if(start == null) {
            System.err.println("List is Empty...");
        }
        // we have only one node is list
        if(start.next ==  null) {
            System.out.println("Only one node is available in list...");
            return;
        }

        Node<T> currentNode = start;
        Node<T> previousNode = null;

        while(currentNode != null) {
            Node<T> next = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = next;
        }
        start = previousNode;
    }

    void findMidPoint() {
        Node<T> slow, fast;
        if(start != null) {
            fast = slow = start;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            System.out.println("Mid Point is :: " + slow.data);
        }
    }

    void detectLoop() {
        Node<T> slow = start, fast = start;
        if(start != null) {
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    System.out.println("Loop is present...");
                    return;
                }
            }
            System.out.println("No Loop is present...");
        }
    }

    void removeNthFromEnd(int n) {

        Node<T> first, second;
        first = second = start;
        for(int i = 0; i <= n - 1; i++) {
            first = first.next;
        }

        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
    }

    void print()  {
        Node<T> temp = start;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Operations<Integer> obj = new Operations<>();
        obj.insertAtEnd(new Node<>(10));
        obj.insertAtEnd(new Node<>(11));
        obj.insertAtEnd(new Node<>(14));
        obj.insertAtEnd(new Node<>(19));
        obj.insertAtEnd(new Node<>(5));

        obj.print();

        // Node<Integer> n1 = new Node<>(10);
        // Node<Integer> n2 = new Node<>(12);
        // Node<Integer> n3 = new Node<>(14);
        // Node<Integer> n4 = new Node<>(11);
        // Node<Integer> n5 = new Node<>(19);

        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;

        // Node<Integer> start = n1;
        // while(start != null) {
        //     System.out.println(start.data);
        //     start = start.next;
        // }

    }
}
