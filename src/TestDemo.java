import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

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
		
		//CopyOnWriteArrayList
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator it = list.iterator();
		while(it.hasNext()){
			list.add("1");
			System.out.println(it.next()+" ");
		}
		System.out.println(list.size());
		
	
		

	}

}


