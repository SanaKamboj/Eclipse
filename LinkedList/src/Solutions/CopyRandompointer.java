package Solutions;

public class CopyRandompointer {
	
	Node head = null;
	
	
	public Node copyRandomList(Node head) {
		 
		if (head == null)
			return null;
	 
		Node p = head;
	 
		// copy every node and insert to list
		while (p != null) {
			Node copy = new Node(p.value);
			copy.next = p.next;
			p.next = copy;
			p = copy.next;
		}
	 
		// copy random pointer for each new node
		p = head;
		while (p != null) {
			if (p.random != null)
				p.next.random = p.random.next;
			p = p.next.next;
		}
	 
		// break list to two
		p = head;
		Node newHead = head.next;
		while (p != null) {
			Node temp = p.next;
			p.next = temp.next;
			if (temp.next != null)
				temp.next = temp.next.next;
			p = p.next;
		}
	 
		return newHead;
	}

	
	public static void main(String[] args){
		
		CopyRandompointer list = new CopyRandompointer();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.random = list.head.next.next;
		list.head.next.random = list.head;
		list.head.next.next.random = list.head.next.next.next.next;
		list.head.next.next.next.random = list.head.next.next;
		list.head.next.next.next.next.random = list.head.next;
		
		Node curr = list.head;
		while(curr.next != null){
			System.out.println("Node: " + curr.value + ", Next: " + curr.next.value + ", Random: "+ curr.random.value);
			curr = curr.next;
		}
		
		list.head = list.copyRandomList(list.head);
		
		System.out.println();
		System.out.println("Copied List:");
		curr = list.head;
		while(curr.next != null){
			System.out.println("Node: " + curr.value + ", Next: " + curr.next.value + ", Random: "+ curr.random.value);
			curr = curr.next;
		}
		
	}

}
