package solutions.datastructures.stack;

public class AStack {
	
	//KEY - NODE, NEXT, FIRST

	static class Node {
		public int value;
		public Node next;

		Node(int v) {
			this.value = v;
		}
	}

	Node first = null;

	public void push(Node node) {
		node.next = first;
		first = node;

	}

	public void pop() {
		System.out.println("Popped: "+first.value);
		first = first.next;
	}
	
	public static void main(String[] args) {

		AStack stack = new AStack();
		stack.push(new Node(4));
		stack.push(new Node(6));
		stack.push(new Node(8));
		stack.push(new Node(3));
		stack.push(new Node(1));
		stack.push(new Node(4));
		
		while (stack.first!=null)
			stack.pop();

	}

}
