public class MyLinkedList <E> implements MyList{

    private int size = 0;

    private class Node<E>{

        E data;
        Node<E> next;
        Node<E> previous;
        public Node(E data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object item) { // adding the element in the end of the linked list
        Node newNode = new Node<>((E)item);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    public void printList(){ // Printing the Linked list in order
        Node currentNode = this.head; // the temporary node to access all the nodes
        while(currentNode != null){ // looping through all the values
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
