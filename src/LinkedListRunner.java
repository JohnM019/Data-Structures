public class LinkedListRunner {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.addBeg(4);

        list.show();
    }
}
