public class QueueTest {
	public static void main(String[] args) {
		singletonSum();
		adtSum();
		sum();
	}

	public static void singletonSum() {
		ArrayQueueSingleton.getInstance();
		for (int i = 0; i < ArrayQueueSingleton.size; i++) {
			ArrayQueueSingleton.push((int)(Math.random() * 50));
       		}
		int sum = 0;
		for (int i = 0; i < ArrayQueueSingleton.size; i++) {
                	sum = sum + ArrayQueueSingleton.pop();
                }
                if (ArrayQueueSingleton.isEmpty()) {
                	System.out.println("ArrayQueueSingleton is empty");
                }

		System.out.println("Singleton sum is " + sum);
	}

	public static void adtSum() {
		ArrayQueueADT queue = new ArrayQueueADT(10);
                for (int i = 0; i < queue.size; i++) {
                        ArrayQueueADT.push(queue, (int)(Math.random() * 30));
                }
		int sum = 0;
		for (int i = 0; i < queue.size; i++) {
                        sum = sum + ArrayQueueADT.pop(queue);
                }
		if (queue.isEmpty()) {
                        System.out.println("ArrayQueueADT is empty");
                }
		System.out.println("ADT sum is " + sum);
	}	

	public static void sum() {
		ArrayQueue queue = new ArrayQueue(10);
                for (int i = 0; i < queue.size; i++) {
                        queue.push((int)(Math.random() * 20));
                }
		int sum = 0;
                for (int i = 0; i < queue.size; i++) {
                        sum = sum + queue.pop();
                }
                if (queue.isEmpty()) {
                        System.out.println("ArrayQueue is empty");
                }
		System.out.println("ArrayQueue sum is " + sum);

	}

}
