package $23ArrayList;

import java.util.ArrayList;

public class Swap2Numbers {
	private static void swap2numbers(ArrayList<Integer> list, int idx1, int idx2) {
		// TODO Auto-generated method stub
		int temp=list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		// add element TC->O(1)
		list.add(1);
		list.add(28);
		list.add(73);
		list.add(34);
		int idx1=1;
		int idx2=3;
		System.out.println("Before swapping");
		System.out.println(list);
		swap2numbers(list,idx1,idx2);
		System.out.println("After swapping");
		System.out.println(list);

	}

}
