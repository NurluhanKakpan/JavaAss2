public class Main {
    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.printList();
        myList.add(10, 6);
        System.out.println();
        myList.printList();

    }
}