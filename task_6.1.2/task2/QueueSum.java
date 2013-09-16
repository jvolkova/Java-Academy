public class QueueSum {
	public static void main(String[] args) {
		singletonSum();
		adtSum();
		sum();
	}

	public static void singletonSum() {
		for (int i = 0; i < ArrayQueueSingleton.MAX_SIZE; i++) {
			ArrayQueueSingleton.push((int)(Math.random() * 50));
       		}
		int sum = 0;
		for (int i = 0; !ArrayQueueSingleton.isEmpty(); i++) {
                	sum = sum + ArrayQueueSingleton.pop();
                }
		System.out.println("Singleton sum is " + sum);
	}

	public static void adtSum() {
		ArrayQueueADT queue = new ArrayQueueADT(10);
                for (int i = 0; i < queue.maxSize; i++) {
                        ArrayQueueADT.push(queue, (int)(Math.random() * 30));
                }
		int sum = 0;
		for (int i = 0; !ArrayQueueADT.isEmpty(queue); i++) {
                        sum = sum + ArrayQueueADT.pop(queue);
               	}
		System.out.println("ADT sum is " + sum);
	}	

	public static void sum() {
		ArrayQueue queue = new ArrayQueue(10);
                for (int i = 0; i < queue.maxSize; i++) {
                        queue.push((int)(Math.random() * 20));
                }
		int sum = 0;
                for (int i = 0; !queue.isEmpty(); i++) {
                        sum = sum + queue.pop();
                }
		System.out.println("ArrayQueue sum is " + sum);

	}

}
