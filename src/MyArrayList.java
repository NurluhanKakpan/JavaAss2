public class MyArrayList<T> implements MyList{

    private int size = 0; // this variable must be private by security means.
    private T[] arr;

    public MyArrayList(){ // adding constructor
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }


    @Override// It returns the size of the array
    public int size() {
        return size;
    }

    @Override// It checks if a certain object is in the arrayList
    public boolean contains(Object o) {

        for(int i = 0; i < size; i++){
            if(o.equals(arr[i])){
                return true;
            }
        }
        return false;
    }

    @Override // adding new item
    public void add(Object item) {
        if(arr.length == size){
            increaseBuffer();
        }
        arr[size++] = (T)item;
    }

    private void increaseBuffer(){ // It is a function that increases our array
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        for(int i = 0; i < size; i++){
            if(arr[i].equals(item)){
                remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override// this method shifts all the elements by one and the element to delete is overwritten
    public Object remove(int index) {
        T temp = arr[index];
        for(int i = index; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return temp;
    }

    @Override
    public void clear() { // the method to clear entire List
        T[] newArr = (T[]) new Object[arr.length*2];
        arr = newArr;
        size = 0;
    }

    @Override
    public Object get(int index) { // returning element at the specified index
        return arr[index];
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
}
