public class CustomLinkedList <T> {
    private Node<T> head;

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
    private static class Node<T> {
        T data;
        Node<T> next;
    }
}


