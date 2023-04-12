public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(5);
        System.out.println(myList.get(0));
        myList.remove(0);
        System.out.println(myList.get(0));

    }
}