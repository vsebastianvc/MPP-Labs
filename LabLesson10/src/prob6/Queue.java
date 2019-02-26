package prob6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;

	}

	private Node head;
	private Node tail;

	public void add(Object newValue) {
		Node n = new Node();
		if (head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
		tail.value = newValue;
	}

	synchronized public void addThreadSafe(Object newValue) {
		Node n = new Node();
		if (head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
		tail.value = newValue;
	}

	public Object remove() {
		if (head == null)
			return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	synchronized public Object removeThreadSafe() {
		if (head == null)
			return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	public int getSize() {
		int i = 0;
		Node temp = head;
		while (temp.next != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}

	public static void multipleThreadNotSafe(Queue q) {

		for (int i = 0; i <= 100; i++) {

			Runnable task3 = () -> {
				try {
					q.add((int) Math.random() * 10);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.printf("We have an exception on on handle  \n ", e.getMessage());
				}

				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
			new Thread(task3).start();
		}

	}

	public static void multipleThreadSafe(Queue q) {

		for (int m = 0; m < 10; m++) {
			Runnable r = () -> {
				for (int i = 0; i <= 100; i++)
					q.addThreadSafe(i);
			};

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			new Thread(r).start();

		}

	}

	public static void main(String[] args) {
		Queue queue1 = new Queue();

		multipleThreadNotSafe(queue1);

		System.out.println(queue1.getSize());

		Queue queue2 = new Queue();
		multipleThreadSafe(queue2);

		System.out.println(queue2.getSize());
	}
}