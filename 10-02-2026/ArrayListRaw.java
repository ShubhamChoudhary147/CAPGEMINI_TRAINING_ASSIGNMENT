class MyArrayList {
	private int[] data;
	private int size;
	public MyArrayList() {
		data = new int[4];
		size = 0;
	}
	public void add(int val) {
		if(size == data.length) {
			resize();
		}
		data[size++] = val;
	}
	private void resize() {
		int[] newData = new int[2*data.length];
		for(int i = 0;i < data.length; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}
	public void print() {
		for(int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	public int get(int idx) {
		if(idx < 0 || idx > size) {
			throw new IndexOutOfBoundsException();
		}
		return data[idx - 1];
	}
	public void remove(int idx) {
		if(idx < 0 || idx > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i = 0;i < size; i++) {
			data[i] = data[i+1];
		}
		size --;
	}
	public void search(int val) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == val) {
				System.out.println(i);
			}
		}
	}
	public void sort() {
		for(int i = 0; i < data.length-1; i++) {
			for(int j = 0; j < data.length - i - 1; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}

public class ArrayListRaw {

	public static void main(String[] args) {
		MyArrayList arr = new MyArrayList();
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
		arr.search(3);
		arr.sort();
		
	}

}
