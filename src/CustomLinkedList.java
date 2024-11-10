public class CustomLinkedList <T> {
    private Node<T> head;
    private int size = 0;

    public void add(T item) {
        //adds the item at the end of the list
        Node<T> node = new Node<>();
        node.data = item;
        node.next = null;
        if (head == null) head = node;
        else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void addBeg(T item) {
        Node<T> node = new Node<>();
        node.data = item;
        node.next = null;

        if (head == null) head = node;
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + " -> ");
            }
            else System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int ListSize(){
        //returns the length of the linked list
        return size;
    }
    public void clear() {
        //clears the list
        head = null;
        size = 0;
    }
    private static class Node<T> {
        T data;
        Node<T> next;
    }
}


