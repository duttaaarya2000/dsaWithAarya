package $23ArrayList;

import java.util.ArrayList;
//2 pointer approach
//optimised
//TC ->O(N)
public class ContainerWithMostWater2 {
	public static int storeWater(ArrayList<Integer> height) {
		int maxWater=0;
		int lp=0;
		int rp=height.size()-1;
		while(lp<rp)
		{
			//calculate water area
			int ht=Math.min(height.get(lp),height.get(rp));
			int width=rp-lp;
			int currWater=ht*width;
			maxWater=Math.max(maxWater, currWater);
			//update pointer
			if(height.get(lp)<rp)
			{
				lp++;
			}
			else
			{
				rp--;
			}
		}
		return maxWater;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> height = new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		System.out.println("Volume of container with most water=" + storeWater(height));

	}

}
