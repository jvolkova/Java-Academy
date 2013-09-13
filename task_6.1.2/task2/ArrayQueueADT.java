public class ArrayQueueADT {
	
	public int maxSize;
	private int start = -1;
        private int end = -1;
	private Integer[] elements;

	public ArrayQueueADT(int size) {
		elements = new Integer[this.maxSize = size];
	}

	public static void push(ArrayQueueADT queue, Integer value) {
                if (++queue.end == queue.maxSize) {
                        queue.end = 0;
                }
                if (queue.elements[queue.maxSize - 1] != null){
                        queue.start++;
                }
                queue.elements[queue.end] = value;
        }

	public static Integer pop(ArrayQueueADT queue) {
                Integer returnedElement = null;
                if (++queue.start == queue.maxSize) {
                        queue.start = 0;
                }
                if (queue.elements[queue.start] != null) {
                        returnedElement = queue.elements[queue.start];
                        queue.elements[queue.start] = null;
                } else {
                        System.out.println("Array is empty!");
                }
                return returnedElement;
        }

        public static boolean isEmpty(ArrayQueueADT queue) {
                return queue.start == queue.end;
        }

	public static void printQueue(ArrayQueueADT queue) {
                for ( int i = 0; i < queue.maxSize; i++){
                        System.out.print(queue.elements[i] + " ");
                }
                System.out.println();
        }

        public static int size(ArrayQueueADT queue) {
                return queue.maxSize;
        }
}
