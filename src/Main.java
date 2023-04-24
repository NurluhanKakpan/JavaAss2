import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer[] integers = new Integer[]{1,2,3,4,5};
        myArrayList.addAll(integers);
    }
}