# Queue

<a href="../index.md"> Home </a>

## Queue - First, Last & Next

```java
	public class Queue {
	
	static class Node {
		int value;
		Node next;
	
		public Node(int value) {
			this.value = value;
		}
	}
	// note that there are two nodes
	private Node first = null;
	private Node last = null;

	public void enqueue(Node node) {
		if(last == null) {
			first = last = node;
		} else {
			last.next = node; //add to queue
			// new last is most recent node
			// req for subsequent loop
			last = node; // moving last pointer
		}
	}
	
	public void dequeue() {
		first = first.next;
		if(first == null)
			last = null;
	}

	public void print() {
		Node node = first;
		while(node != null) {
			System.out.print(node.value+" ");
			node = node.next;
		}
	}
		
	public static void main(String[] args) {
		Queue q = new Queue();
	
		q.enqueue(new Node(1));
		q.enqueue(new Node(2));
		q.enqueue(new Node(4));
		q.enqueue(new Node(8));
		
		q.print();

	}
}

```
