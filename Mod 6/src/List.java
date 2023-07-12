
public class List<T> {
	
	public static <T> int findIn(T[] L_array, T value ) { //Generic method with 2 type parameters
		int i;
		for (i = 0; i < L_array.length; i++ ) { //loop to go through list and return index position
			if(L_array[i].equals(value)) {
		
			return i;
			
		}
    }
		return 0;

	}
}
