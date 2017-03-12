import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String one = new String("one");
		String two = new String("one");
		String three = new String("two");
		String four = new String("three");
		String five = new String("four");
		String six = new String("five");
		String seven = new String("six");
		
		ArrayList<String> array = new ArrayList<>();
		array.add(one);
		array.add(two);
		array.add(three);
		array.add(four);
		array.add(five);
		array.add(six);
		array.add(seven);		
		// printing the collection containing duplicates
		
		System.out.println("Collection with duplicate");
		for (int i =0; i<array.size();i++){
			System.out.println(array.get(i));
			
		}
		
		System.out.println("*********************************");
		
		HashSet<String> set = new HashSet<String>();
		
		set.add(one);
		set.add(two);
		set.add(three);
		set.add(four);
		set.add(five);
		set.add(six);
		set.add(seven);
		
		Iterator<String> iterator= set.iterator();
		System.out.println("Collection without duplicate");
		while(iterator.hasNext()){
			String str = iterator.next();
			
			System.out.println(str);
		}
		
		
	}

}
