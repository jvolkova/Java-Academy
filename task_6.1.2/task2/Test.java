public class Test {
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(10);
		for (int i = 0; i < 19; i++) {
			queue.push(i);
		}
		queue.printQueue();
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.printQueue();
	}
}
