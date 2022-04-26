package LinkedList;

class Node_3 {
    int data;
    Node_3 next;
    Node_3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedList {
    void mergeList(Node_3 head_1, Node_3 head_2) {
        Node_3 temp = new Node_3(0);
        Node_3 temp_2 = temp;

        while(true) {
            if(head_1 == null) {
                temp_2.next = head_2;
                break;
            }

            if(head_2 == null) {
                temp_2.next = head_1;
                break;
            }

            if(head_1.data <= head_2.data) {
                temp_2.next = head_1;
                head_1 = head_1.next;
            }
            else {
                temp_2.next = head_2;
                head_2 = head_2.next;
            }
            temp_2 = temp_2.next;
        }

    }
}
