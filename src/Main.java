public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        System.out.println(myList.size());
        myList.add(5);
        System.out.println(myList.size());
        System.out.println(myList.get(0));
    }
}