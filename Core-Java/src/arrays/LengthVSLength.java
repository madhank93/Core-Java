package arrays;

public class LengthVSLength {

	public static void main(String[] args) {
		
		// length - is a final variable it's applicable only for arrays
		// It's used to represent size of array, in case of multidimensional array it represents base size not total size
		int[] a = new int[10];
		System.out.println("Length of an Array: "+a.length); // Output : 10

		
		// length() - is a final method it's applicable only for String
		// It represents number of characters present in the String
		String S = "Multitude";
		System.out.println("Length of a String: "+S.length()); // Output : 9
		
	}

}
