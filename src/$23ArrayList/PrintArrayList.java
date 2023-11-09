package $23ArrayList;

import java.util.ArrayList;

public class PrintArrayList {
	private static void printArrayList(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		// print the array list
		System.out.println("Array List: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

	}

	private static void reversePrintArrayList(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		// reverse print of array list
		System.out.println("Reverse of array list: ");
		for (int i = list.size()-1; i >=0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		// add element TC->O(1)
		list.add(1);
		list.add(28);
		list.add(73);
		list.add(34);
		printArrayList(list);
		reversePrintArrayList(list);

	}

}
