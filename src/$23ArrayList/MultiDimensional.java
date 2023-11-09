package $23ArrayList;

import java.util.ArrayList;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		ArrayList<Integer> list3=new ArrayList<>();
		for(int i=1;i<=5;i++)
		{
			list1.add(i*1);
			list2.add(i*2);
			list3.add(i*3);
		}
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);
		System.out.println(mainList);
		System.out.println("****Nested loops****");
		for(int i=0;i<mainList.size();i++)
		{
			ArrayList<Integer> temp=mainList.get(i);
			for(int j=0;j<temp.size();j++)
			{
				System.out.print(temp.get(j)+" ");
			}
			System.out.println();
		}

	}

}
