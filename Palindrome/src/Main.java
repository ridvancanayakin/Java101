import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String word) {
    	boolean result = true;
    	for(int i=0 ;i < word.length()/2 ; i++) {
    		if(word.charAt(i)!= word.charAt(word.length()-1-i) ){
    			result=false;
    			break;
    		}
    	}
    	return result;
    }

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	while (true) {
    		System.out.print("Bir kelime girin :");
    		String word = s.nextLine();
    		String result = isPalindrome(word)?"":"deðil";
    		System.out.println(word + " kelimesi palindrome " + result);
    	}
       
    }
}