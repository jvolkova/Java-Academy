public class ArrayQueue implements Queue {
	private int start = -1;
	private int end = -1;
	protected int maxSize;
	private Integer[] elements;

	ArrayQueue(int size) {
		elements = new Integer[this.maxSize = size];
	} 

	public void push(Integer value) {
		if (++end == maxSize) {
			end = 0;
		}
		if (elements[maxSize - 1] != null){
			start++;
		}
		elements[end] = value;
	}

	public Integer pop() {
		Integer returnedElement = null;
		if (++start == maxSize) {
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

	public boolean isEmpty() {
		return start == end;
	}

	public void printQueue() {
		for ( int i = 0; i < maxSize; i++){
			System.out.print(elements[i] + " ");
		}
		System.out.println();
	}

	public int size() {
		int length = 0;
		if (end >= start) {
			length =  end - start;
		}
		else {
			length = maxSize - start + end;
		}
		return length;
	}
}
