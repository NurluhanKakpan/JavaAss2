public class MyArrayList<T> implements MyList{

    int size = 0;
    private T[] arr;


    @Override
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
        if(arr.length < size){

        }
        size++;
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
}
