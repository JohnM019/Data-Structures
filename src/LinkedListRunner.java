public class LinkedListRunner {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.addBeg(4);

        System.out.println("The size of the list is: " + list.ListSize());
        list.show();

        System.out.println("deletion....");
        list.clear();
        System.out.println("\n\nInsertion...");
        System.out.println("The size of the list is: " + list.ListSize());
        list.add(1);
        list.add(2);
        list.add(3);
        list.addBeg(0);

        System.out.println("The size of the list is: " + list.ListSize());


        list.show();
    }
}
