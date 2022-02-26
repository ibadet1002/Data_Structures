public class LinkedListApp {
    public static void main(String[] args) {
            MySinglyLinkedList list1 = new MySinglyLinkedList();
        for(int i=0; i <7; i++) list1.add(i);
        list1.printNodes();
        System.out.println("========");
        System.out.println(list1.indexOf(4));
        System.out.println(list1.size);
        list1.deleteNode(5);
        System.out.println("after deleting");
        list1.printNodes();

        System.out.println("finding kth element from last");
        System.out.println(list1.getKthElementFromLast(4));
    }
}
