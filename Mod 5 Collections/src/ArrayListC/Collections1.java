package ArrayListC;

import java.util.*;

/*A Collection/Collection interface is a singular group that holds various objects while 
 * Collections includes several static utility methods that allows us to further manipulate the collection. 
 * The interface is used to generally create abstract methods and it lays the foundation of the class while a class is more specific and expands on creating objects and inheriting other classes. 
 * Citation:
 * GeeksforGeeks. (2020, September 2). Collection vs collections in Java. GeeksforGeeks. https://www.geeksforgeeks.org/collection-vs-collections-in-java-with-example/#    */

public class Collections1 {
	private static String searchN;
	private static String searchN2;

	public static void main(String[] args) {
	       
        List<String> listNames = new ArrayList<String>();
        
        listNames.add("Melyia");
        listNames.add("Tyler");
        listNames.add("Chloe");
        listNames.add("John");
        listNames.add("Karen");
        listNames.add("Jean");
        listNames.add("Andrew");
        listNames.add("Gina");
        
        Collections.sort(listNames);
        System.out.println("Sorted Array: ");
        // Loop to print each string
        for (String arg: listNames) {
            
            System.out.format(" %s ", arg);
        }
        
        Collections.shuffle(listNames);
        System.out.println("\nShuffled Array: ");
        for (String arg: listNames) {
            
            System.out.format(" %s ", arg);
        }
        
        //Name in list
        searchN = "Melyia";
        int index = listNames.indexOf(searchN);
        System.out.println("\n\nName that was searched was " + searchN + " in index #" + index );
        
        searchN2 = "Zoey";
        int index2 = listNames.indexOf(searchN2);
		System.out.println("Name that was not found was " + searchN2 + " in index #" + index2 );
        
        String[] p_array = listNames.toArray(new String[8]);
        for(String p_array1 : p_array) {
        	System.out.print(p_array1 + " ");
        }
        
    }
}
