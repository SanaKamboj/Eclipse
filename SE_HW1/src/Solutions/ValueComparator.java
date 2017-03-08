package Solutions;
import java.util.*;

public class ValueComparator<K,V extends Comparable<V>> implements Comparator<K> {
	TreeMap<K,V> map = new TreeMap<K,V>();
	
	public ValueComparator(TreeMap<K,V> map){
		this.map = map;
	}
	
	@Override
	public int compare(K keyA, K keyB){
		return -map.get(keyA).compareTo(map.get(keyB));
	}
}
