package queue;

public class QueueArray {

	int front, back, queuesize;
	int queue_array[];

	public QueueArray(int size) {

		queuesize = size;
		queue_array = new int[size];
		front = -1;
		back = -1;
	}

	public void insertElement(int element) {

		back++;

		if (back >= queuesize) {
			System.out.println("Queue overflow!");
			back--;
			return;
		}

		queue_array[back] = element;
	}

	public int getElement() {

		front++;

		if (front == back) {
			System.out.println("Queue empty!");
			front--;
			return -1;
		}

		return queue_array[front];

	}

	public int queuesize() {

		return (back - front + 1);
	}
}
