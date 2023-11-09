package $23ArrayList;

import java.util.ArrayList;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		// add element TC->O(1)
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(28);
		list.add(73);
		list.add(34);
		// add element on a index TC->O(n)
		list.add(1, 9);
		System.out.println(list);
		// get element from Index TC->O(1)
		int ele3 = list.get(2);
		System.out.println(ele3);
		// remove element from Index TC->O(N)
		list.remove(2);
		System.out.println(list);
		// The add() method in Java ArrayList adds a new element to the list at the
		// specified position,
		// shifting all elements towards the right position.
		// The set() method replaces the element at the specified position with the new
		// element.
		//set element at index TC->O(n)
		list.set(1, 88);
		System.out.println(list);
		//check whether element is contain in AL
		boolean check1=list.contains(1);
		boolean check2=list.contains(11);
		System.out.println(check1);
		System.out.println(check2);
		//size of AL
		System.out.println(list.size());
	}

}
