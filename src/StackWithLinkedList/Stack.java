package stackwithlinkedlist;

import java.lang.*;

public class Stack {
	Node head, top;
	int listcount;

	public Stack() {
		head = new Node(null);
		top = head;
		listcount = 0;
	}

	public void push(Object datavalue) {
		Node makenew = new Node(datavalue);
		Node current = makenew;
		makenew.setNext(top);
		makenew.setData(datavalue);
		top = makenew;
		listcount++;
	}

	public Object pop() {
		if (top == head) {
			System.out.println("Stack is empty");
			return null;
		}
		Object ret_value = top.getData();
		top = top.getNext();
		listcount--;
		return ret_value;

	}

	public int stacksize() {
		return listcount;
	}
}
