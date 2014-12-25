package queue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray que = new QueueArray(10);
		que.insertElement(1);
		que.insertElement(2);
		que.insertElement(3);
		que.insertElement(4);
		que.insertElement(5);
		que.insertElement(6);
		que.insertElement(7);
		que.insertElement(8);
		System.out.println("Queue get element: " + que.getElement());
		System.out.println("Queue Size: " + que.queuesize());
		System.out.println("Queue get element: " + que.getElement());
		System.out.println("Queue get element: " + que.getElement());
		System.out.println("Queue get element: " + que.getElement());
		que.insertElement(9);
		System.out.println("Queue get element: " + que.getElement());
		que.insertElement(10);
		System.out.println("Queue get element: " + que.getElement());
		que.insertElement(11);
		System.out.println("Queue get element: " + que.getElement());
		que.insertElement(12);
		System.out.println("Queue get element: " + que.getElement());
		System.out.println("Queue get element: " + que.getElement());
		System.out.println("Queue get element: " + que.getElement());
		System.out.println("Queue get element: " + que.getElement());
	}

}
