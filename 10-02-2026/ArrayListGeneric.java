class MyArrayList1<T extends Comparable<T>> {

    private Object[] data;
    private int size;

    public MyArrayList1() {
        data = new Object[4];
        size = 0;
    }

    public void add(T val) {
        if (size == data.length) {
            resize();
        }
        data[size++] = val;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public T get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[idx];
    }

    public void remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = idx; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public int search(T val) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }
    
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                T a = (T) data[j];
                T b = (T) data[j + 1];

                if (a.compareTo(b) > 0) {
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}

public class ArrayListGeneric {

    public static void main(String[] args) {

        MyArrayList1<Integer> arr = new MyArrayList1<>();

        arr.add(1);
        arr.add(22);
        arr.add(39);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(5);

        arr.print();

        System.out.println(arr.get(4));
        System.out.println(arr.get(1));

        arr.remove(1);
        arr.print();

        System.out.println("Index of 5: " + arr.search(5));

        arr.sort();
        arr.print();
    }
}
