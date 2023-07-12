
public class GreaterThan {

	public static <T extends ReturnValueInterface> T greaterThan(T object1, T object2) {
	    if (object1.returnValue() > object2.returnValue()) {
	       return object1;
	  } else {
	       return object2;
	        }
	    }
	}
