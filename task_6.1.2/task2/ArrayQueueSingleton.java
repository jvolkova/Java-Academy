public class ArrayQueueSingleton {

	private static ArrayQueueSingleton instance;
	
	public static final int size = 10;
	private static Integer[] elements = new Integer[size];
        private static int start;
        private static int end;

	private ArrayQueueSingleton() {
	}

	public static synchronized ArrayQueueSingleton getInstance() {
		if (instance == null) {
			instance = new ArrayQueueSingleton();
		}
		return instance;
	}

        public static void push(Integer value) {
		if (++end == size) {
                        end = 0;
                }
                elements[end] = value;
        }

        public static Integer pop() {
                if (++start == size) {
                        start = 0;
                }
                return elements[start];
        }

	public static boolean isEmpty() {
                return start == end;
        }

}
