package unit14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit14 {
	
	// recursive factorial
	public static float factorialRec(int n) {
		// base case
		if(n == 1) {
			return 1;
		}
		return n * factorialRec(n -1);
	}
	
	// iterative factorial
	public static float factorialIter(int n) {
		float result = 1;
		for(int i = 1; i <= n; i++ ) {
			result = result * i;
		}
		return result;
	}
	
    /**
     * Returns a list containing all subsequences of word,
     * where a subsequence is a string of letters found in word 
     * in the same order that they appear in word.
     * @param word consisting only of letters a-z and A-Z
     * @return all subsequences of word
     */
	public static List<String> subsequencesList(String word) {
		List<String> result = new ArrayList<>();
		result = Arrays.asList(subsequencesStr(word).split(","));
		return result;
	}
	
	/** Returns a String containing all subsequences of word, separated by commas,
	 * where a subsequence is a string of letters found in word 
	 * in the same order that they appear in word.
	 * @param word consisting only of letters A-Z or a-z
	 * @return all subsequences of word
	 */
	public static String subsequencesStr(String word) {
		return subseq(word).substring(1);
	}
	
	private static String subseq(String word) {
		if(word.isEmpty()) {
			return ""; // base case
		} else {
			char firstLetter = word.charAt(0);
			String restOfWord = word.substring(1);
			
			String subsequencesRest = subseq(restOfWord);
			
			String result = "";
			for (String subsequence : subsequencesRest.split(",")) {
				result += "," + subsequence;
				//result += subsequence + ",";
				result += "," + firstLetter + subsequence;
				//result += firstLetter + subsequence + ",";
			}
			if (result.startsWith(",")) result = result.substring(1); // remove extra leading comma
			return result;
		}
	}
	
	/**
	 * @param n integer to convert to string
	 * @param base base for the representation. Requires 2<=base<=10.
	 * @return n represented as a string of digits in the specified base, with 
	 *           a minus sign if n<0.  No unnecessary leading zeros are included. 
	 */
	public static String stringValue(int n, int base) {
	    if (n < 0) {
	        return "-" + stringValue(-n, base);
	    }else if (n < base) {
	    	return "" + n; 
	    } else {
	        return stringValue(n/base, base) + "0123456789".charAt(n%base);
	    }
	}
	
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("factorialRec(" + n + ") = " + factorialRec(n));
		System.out.println("factorialIter(" + n + ") = " + factorialIter(n));
		
		System.out.println(subsequencesStr("abc"));
		
		List<String> words = subsequencesList("abc");
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println(stringValue(123456, 10));
		
		
	}

}
