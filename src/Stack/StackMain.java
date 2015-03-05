package stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack newstk = new Stack(100);
		boolean track;
		int value;
		track = newstk.push(1);
		track = newstk.push(2);
		track = newstk.push(3);
		track = newstk.push(4);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		track = newstk.push(5);
		track = newstk.push(6);
		System.out.println("Stack Size:" + newstk.stacksize());
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);
		value = newstk.pop();
		System.out.println("Poped Value:" + value);

	}

}
