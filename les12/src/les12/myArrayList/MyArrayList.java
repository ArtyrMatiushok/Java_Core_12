package les12.myArrayList;

public class MyArrayList<T> {
	private final int INIT_SIZE = 16;
	private final int CUT_RATE = 4;
	private Object[] arr = new Object[INIT_SIZE];
	private int pointer = 0;
	
	public void add(T item) {
		if (pointer == arr.length - 1)
			resize(arr.length*2);
		arr[pointer++] = item;
	}
	
	public void remove(int index) {
		for (int i = index; i < pointer; i++) {
			arr[i] = arr[i+1];
		}
		arr[pointer] = null;
		pointer--;
		if (arr.length > INIT_SIZE && pointer < arr.length/CUT_RATE)
			resize(arr.length/2);
	}
	
	public int size() {
		return pointer;
	}
	
	public T get(int index) {
		return (T)arr[index];
	}
	
	private void resize(int newLength) {
		Object[] newArr = new Object[newLength];
		System.arraycopy(arr, 0, newArr, 0, pointer);
		arr = newArr;
	}
}
