package les12.myArrayList;

public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> arrOfInteger = new MyArrayList<Integer>();
		arrOfInteger.add(1);
		arrOfInteger.add(2);
		arrOfInteger.add(3);
		arrOfInteger.add(4);
		arrOfInteger.add(5);
		System.out.println("Before remove:");
		for (int i = 0; i < arrOfInteger.size(); i++) {
			System.out.print(arrOfInteger.get(i) + ", ");
		}
		System.out.println();
		arrOfInteger.remove(3);
		arrOfInteger.remove(4);
		System.out.println("After remove:");
		for (int i = 0; i < arrOfInteger.size(); i++) {
			System.out.print(arrOfInteger.get(i) + ", ");
		}
	}

}
