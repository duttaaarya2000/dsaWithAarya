package $23ArrayList;

import java.util.ArrayList;

public class MaximumInArrayList {
	public static int maxInArrayList(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>max)
			{
				max=list.get(i);
			}
		}
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		// add element TC->O(1)
		list.add(1);
		list.add(28);
		list.add(73);
		list.add(34);
		System.out.println("Maximum element in ArrayList: "+maxInArrayList(list));

	}

}
