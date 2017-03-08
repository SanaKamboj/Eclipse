package Solutions;

import java.util.Comparator;

public class ComparatorEg implements Comparator<Example1>{
	
	int type;
	
	public ComparatorEg(int type){
		this.type = type;
	}
	
	@Override
	public int compare(Example1 fruit1, Example1 fruit2){
		switch(type){
		case 1:
			String name1 = fruit1.getFruitName();
			String name2 = fruit2.getFruitName();
			
			int i1 = fruit1.getQuantity();
			int i2 = fruit2.getQuantity();
			
			int value = name1.compareTo(name2);
			if(value == 0){
				return Integer.compare(i1, i2);
			}
			return value;
			
		case 2:
			int q1 = fruit1.getQuantity();
			int q2 = fruit2.getQuantity();
			
			return Integer.compare(q1, q2);
		default:
			return -1;
		}
	}

}
