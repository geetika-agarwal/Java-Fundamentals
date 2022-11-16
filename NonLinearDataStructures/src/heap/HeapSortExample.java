package heap;

public class HeapSortExample {
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(9);
		heap.insert(8);
		heap.insert(6);
		heap.insert(5);
		heap.insert(2);
		heap.insert(1);
		heap.insert(3);
		heap.delete(6);

		heap.heapSort();
	}
}
