package linkedlist;

public class list {

	Node head;
	int listcount;

	public list() {
		head = new Node(null);
		listcount = 0;
	}

	public void add(Object datavalue) {
		Node makenew = new Node(datavalue);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(makenew);
		listcount++;
	}

	public boolean add(Object datavalue, int index) {
		if (index <= 0) {
			return false;
		}

		Node current = head;
		for (int j = 1; j < index; j++) {
			current = current.getNext();
			if (current.getNext() == null) {
				return false;
			}
		}

		current = current.getNext();
		Node temp = current;
		current = new Node(datavalue);
		current.setNext(temp);
		listcount++;
		return true;
	}

	public Object getValue(int index) {
		if (index <= 0) {
			return null;
		}

		Node current = head;
		for (int j = 1; j < index; j++) {
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		current = current.getNext();
		return (current.getData());
	}

	public boolean removeNode(int index) {

		if (index <= 0) {
			return false;
		}

		Node current = head.getNext();
		for (int j = 1; j < index; j++) {
			if (current.getNext() == null) {
				return false;
			}
		}

		Node nextptr = current.getNext();
		nextptr = nextptr.getNext();
		current.setNext(nextptr);
		listcount--;
		return true;
	}

	public int size() {
		return listcount;
	}
}
