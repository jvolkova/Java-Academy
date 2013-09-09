public class ArrayQueue implements Queue {
	private int start;
	private int end;
	public int size;
	private Integer[] elements;

	ArrayQueue(int size) {
		elements = new Integer[this.size = size];
	} 

	public void push(Integer value) {
		if (++end == size) {
			end = 0;
		}
		elements[end] = value;
	}

	public Integer pop() {
		if (++start == size) {
			start = 0;
		}
		return elements[start];
	}

	public boolean isEmpty() {
		return start == end;
	}
}
