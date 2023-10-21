public class Palindrome {
	public String meth1(String word) {
		for (int i=0, j =word.length()-1; i<=word.length()-1;i++,j--) {
			if(word.charAt(i) == (word.charAt(j))) 
				return "it is a palindrome";
		}
			
		
		return "it is not a palindrome";

public static void main(String[] args) {
		Palindrome a = new Palindrome();
	String s = a.meth1("abba");
		System.out.println(s);
	
		
	}
	

}