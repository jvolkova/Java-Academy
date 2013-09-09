public class ArrayQueueADT {
	
	public int size;
	private static int start;
        private static int end;
	private static Integer[] elements;

	public ArrayQueueADT(int size) {
		elements = new Integer[this.size = size];
	}

	public static void push(ArrayQueueADT queue, Integer value) {
                if (++end == 10) {
                        end = 0;
                }
                elements[end] = value;
        }

        public static Integer pop(ArrayQueueADT queue) {
                if (++start == 10) {
                        start = 0;
                }
                return elements[start];
        }

	public static boolean isEmpty() {
                return start == end;
        }

}
