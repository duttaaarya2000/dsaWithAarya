package $13ARRAYS;
//Time Complexity
public class LinearSearch {

	public static int linearSearch(int num[], int key) {
		for(int i=0;i<num.length;i++)
		{
			if(key==num[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,8,10,12,14,16};
		int key=10;
		int index=linearSearch(num,key);
		if(index==-1)
		{
		System.out.println("Element no present");
		}
		else
		{
			System.out.println("Element is present in index: "+ index);
		}
	}

}
