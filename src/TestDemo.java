import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Samer
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello world from Samer");
		
		Set<String> set = new TreeSet<String>();
		set.add("sam");
		set.add("adam");
		set.add("Zak");
		set.add(" amani"); //sapce first, UpperCase second, lowercase third
		
		for(String s: set)
			System.out.print(s+ " ");

	}

}


