package $16Strings;

class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbcccd";
		//String str="abcd";
		System.out.println("Compress string:" + compressstring(str));

	}

	private static String compressstring(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			Integer count = 1;
			while ( i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if (count > 1) {
				sb.append(count);
			}
		}
		return sb.toString();
	}

}
