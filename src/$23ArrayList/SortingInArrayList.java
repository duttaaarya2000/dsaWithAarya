package $23ArrayList;

import java.util.ArrayList;
import java.util.Collections;
//Collections is a class
//Collection is a Interface
public class SortingInArrayList {
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(28);
		list.add(73);
		list.add(34);
		list.add(56);
		//Before sorting
		System.out.println("Before Sorting");
		System.out.println(list);
		//ascending order
		System.out.println("Ascending order");
		Collections.sort(list);;
		System.out.println(list);
		//descending order
		System.out.println("Descending order");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		
	}

}
