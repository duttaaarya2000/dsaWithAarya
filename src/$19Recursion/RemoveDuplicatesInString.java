package $19Recursion;

public class RemoveDuplicatesInString {
	public static void removeDuplicates(String originalstr, int idx, String newstr, boolean map[]) {
		//base
		if(idx==originalstr.length())
		{
			System.out.println(newstr);
			return;
		}
		
		//kaam
		char currChar=originalstr.charAt(idx);
		if(map[currChar-'a']==true)
		{
			//duplicate
			removeDuplicates(originalstr, idx+1, newstr, map);
		}
		
		else
		{
			map[currChar-'a']=true;
			removeDuplicates(originalstr, idx+1, newstr+currChar, map);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicates("abbvvfgg", 0, new String(""), new boolean[26]);

	}

}
