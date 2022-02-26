public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    //constructor


    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // method

    boolean isEmpty() {
        return head == null;
    }

    // adds elements to the last position in the linkedlist
    void add(int data) {
        //create a new node with data value
        Node node = new Node(data);
        //check if list empty
        if (isEmpty()) {
            head = tail = node;
        } else {// add element to the last position
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.value + "+> null");
            else System.out.print(current.value + "=>");
            current = current.next;
        }
    }

    ;

    void deleteNode(int value) {
        if ((isEmpty())) System.out.println("empty value sent");
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {  // first one
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) { // deleting last one
                    tail = prev;
                    prev.next = null;
                } else { // middle one
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }

public int getKthElementFromLast(int k){
        Node ptr1=head;
        Node ptr2=head;
    for (int i = 0; i < k-1; i++) {ptr2=ptr2.next;
    if(ptr2==null) return -1;
    }
    while(ptr2.next!=null){
        ptr1=ptr1.next;
        ptr2=ptr2.next;
    }
    return ptr1.value;
}

    int indexOf(int value) {
        int pos = 0;
        Node current = head;
        if (isEmpty()) return -1;
        while (current != null) {
            if (current.value == value) return pos;
            pos++;
        current=current.next;
        }
        return 1;
        }

}
