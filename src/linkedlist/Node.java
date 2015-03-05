package linkedlist;

public class Node {

	Node next;

	Object data;

	public Node(Object datavalue) {
		next = null;
		data = datavalue;
	}

	public Node(Node nextptr, Object datavalue) {

		next = nextptr;
		data = datavalue;
	}

	public Object getData() {

		return data;
	}

	public void setData(Object datavalue) {

		data = datavalue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node nextptr) {
		next = nextptr;
	}
}
