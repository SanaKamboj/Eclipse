package Solutions;


public class StackFromArray<E> {
	private E[] arr = null;
	private int CAP;
	private int size = 0;
	private int top = -1;
	
	public StackFromArray(int cap){
		this.CAP = cap;
		this.arr = (E[]) new Object[cap];
	}
	
	public E pop(){
		if(this.size == 0){
			return null;
		}
		this.size--;
		E e = this.arr[top];
		this.arr[top] = null;
		this.top--;
		return e;
	}
	
	public void push(E e){
		if(isFull()){
			return;
		}
		this.size++;
		this.top++;
		this.arr[top] = e;	
	}
	
	public boolean isFull(){
		if(this.size == this.CAP){
			return true;
		}
		return false;
	}
	
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
	
	public static void main(String[] args){
		StackFromArray<String> stack = new StackFromArray<String>(11);
		stack.push("hello");
		stack.push("world");
		
		System.out.println(stack);
		 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
	}
}
