package Stack;

public class Stack {

	public int a[];
	int top;
	int size;

	Stack(int size_src) {
		size = size_src;
		a = new int[size];
		top = -1;
	}

	public boolean push(int value) {
		if (top >= size) {
			return false;
		}
		a[++top] = value;
		return true;
	}

	public int pop() {
		if (top < 0) {
			return -1;
		}
		return a[top--];
	}

	public int stacksize() {
		return (top + 1);
	}
}
