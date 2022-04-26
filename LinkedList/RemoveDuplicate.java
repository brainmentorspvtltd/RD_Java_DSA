package LinkedList;

class Node_2 {
    int data;
    Node_2 next;
    Node_2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicate {
    private Node_2 head;
    void removeDuplicate() {
        Node_2 curr = head;
        while(curr != null) {
            Node_2 temp = curr;
            /*
            Here we are comparing current node with next node
            and if current node matches the next node then keep on deleting
            the current node data
            */
            while(temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        
    }
}
