package LinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNum {

    private Node start;
    
    void addition(Node first, Node second) {
        int sum = 0;
        int carry = 0;
        int remainder = 0;
        Node result = null, temp = null;
        while(first != null || second != null) {
            sum = carry + ((first != null ? first.data : 0) + 
            (second != null ? second.data : 0));
            remainder = sum % 10;
            carry = sum / 10;

            if(temp == null) {
                temp = new Node(remainder);
                result = temp;
            }
            else {
                temp.next = new Node(remainder);
                temp = temp.next;
            }

            if(first != null) {
                first = first.next;
            }
            if(second != null) {
                second = second.next;
            }
        }

        // checking if any carry is left
        if(carry > 0) {
            temp.next = new Node(remainder);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        
    }    
}
