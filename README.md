# MyList Implementation

This is an implementation of the List data structure in Java, which includes the `MyArrayList` and `MyLinkedList` classes.
## MyArrayList
`MyArrayList` is an implementation of the List interface using an array as the underlying data structure. The class uses a generic type `T` , which extends the `Comparable` interface to ensure that elements in the list are comparable. The `MyArrayList` class implements the following methods:

`size()`: Returns the number of elements in the list.

`contains(Object o)`: Returns true if the list contains the specified element.

`add(Object item)`: Adds the specified element to the end of the list.

`add(Object item, int index)`: Adds the specified element at the specified index in the list.

`remove(Object item)`: Removes the first occurrence of the specified element from the list.

`remove(int index)`: Removes the element at the specified index from the list.

`clear()`: Removes all elements from the list.

`get(int index)`: Returns the element at the specified index in the list.

`indexOf(Object o)`: Returns the index of the first occurrence of the specified element in the list.

`lastIndexOf(Object o)`: Returns the index of the last occurrence of the specified element in the list.

`sort()`: Sorts the elements in the list in ascending order.

## MyLinkedList
`MyLinkedList` is an implementation of the List interface using a linked list as the underlying data structure. The class uses a generic type `E`, which extends the `Comparable` interface to ensure that elements in the list are comparable. The `MyLinkedList` class implements the following methods:

`size()`: Returns the number of elements in the list.

`contains(Object o)`: Returns true if the list contains the specified element.

`add(Object item)`: Adds the specified element to the end of the list.

`add(Object item, int index)`: Adds the specified element at the specified index in the list.

`remove(Object item)`: Removes the first occurrence of the specified element from the list.

`remove(int index)`: Removes the element at the specified index from the list.

`clear()`: Removes all elements from the list.

`get(int index)`: Returns the element at the specified index in the list.

`indexOf(Object o)`: Returns the index of the first occurrence of the specified element in the list.

`lastIndexOf(Object o)`: Returns the index of the last occurrence of the specified element in the list.

`sort()`: Sorts the elements in the list in ascending order.

Both classes implement the MyList interface, which defines the common methods that both classes share.

# How to Use

To use the `MyArrayList` and `MyLinkedList` classes in your Java code, you can create a new instance of the class and call its methods to manipulate the list. For example:

```
MyArrayList<String> myList = new MyArrayList<>();
myList.add("foo");
myList.add("bar");
myList.add("baz");
myList.remove("bar");
System.out.println(myList.size()); // Output: 2
```


```
MyLinkedList<Integer> myList = new MyLinkedList<>();
myList.add(1);
myList.add(2);
myList.add(3);
myList.remove(1);
System.out.println(myList.size()); // Output: 2```

