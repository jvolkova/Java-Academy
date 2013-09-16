public class ArrayQueueSingleton {
	
	protected static final int MAX_SIZE = 10;
	private static Integer[] elements = new Integer[MAX_SIZE];
        private static int start = -1;
        private static int end = -1;

	public static void push(Integer value) {
                if (++end == MAX_SIZE) {
                        end = 0;
                }
                if (elements[MAX_SIZE - 1] != null){
                        start++;
                }
                elements[end] = value;
        }

	public static Integer pop() {
                Integer returnedElement = null;
                if (++start == MAX_SIZE) {
                        start = 0;
                }
                if (elements[start] != null) {
                        returnedElement = elements[start];
                        elements[start] = null;
                } else {
                        System.out.println("Array is empty!");
                }
                return returnedElement;
        }

        public static boolean isEmpty() {
                return start == end;
        }

	public static void printQueue() {
                for ( int i = 0; i < MAX_SIZE; i++){
                        System.out.print(elements[i] + " ");
                }
                System.out.println();
        }

        public static int size() {
                int length = 0;
                if (end >= start) {
                        length =  end - start;
                }
                else {
                        length = MAX_SIZE - start + end;
                }
                return length;
        }

}
