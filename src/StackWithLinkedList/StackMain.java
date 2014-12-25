package StackWithLinkedList;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack newstk = new Stack();
		Object retvalue;
		newstk.push(1);
		newstk.push(2);
		newstk.push(3);
		System.out.println("Stack Size: "+ newstk.stacksize());
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		System.out.println("Stack Size: "+ newstk.stacksize());
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		System.out.println("Stack Size: "+ newstk.stacksize());
		newstk.push(4);
		newstk.push(5);
		newstk.push(6);
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		System.out.println("Stack Size: "+ newstk.stacksize());
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		System.out.println("Stack Size: "+ newstk.stacksize());
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		System.out.println("Stack Size: "+ newstk.stacksize());
		retvalue = newstk.pop();
		System.out.println("Popped Value: "+ retvalue);
		System.out.println("Stack Size: "+ newstk.stacksize());
		
	}

}
