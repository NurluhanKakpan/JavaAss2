public class Main {
    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList();
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(10);
        myList.add(2);
        myList.add(1);
        myList.printList();
        myList.sort();
        System.out.println();
        myList.printList();

    }
}