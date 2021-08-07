package java0715;

public class _1119SingleLinkedList<E> {

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}
	
	Node<E> head = null;
	int size = 0;
	Node<E> tail = null;
	
	private void addFirst(E input) {
		Node<E> newNode = new Node<E>(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}
	
	private void addLast(E input) {
		Node<E> newNode = new Node<E>(input);
		if (size == 0 ) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(E input) {
		addLast(input);
	}

	@Override
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node<E> temp = head;
		String str = "[";
		while(temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
	
	public void add(int index, E input) {
		if (index == 0) {
			addFirst(input);
		} else if (index == size) {
			addLast(input);
		} else if (index > size || index < 0) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		} else {
			Node<E> prev =head;
			for (int i =0; i<index-1; i++) {
				prev = prev.next;
			}
			Node<E> newNode = new Node<E>(input);
			newNode.next = prev.next;
			prev.next = newNode;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public E removeFirst() {
		Node<E> temp = head;
		head = temp.next;
		E data = temp.data;
		temp = null;
		size--;
		return data;
	}
	
	public E remove(int index) {
		if (index == 0) {
			removeFirst();
		} else if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		Node<E> prev = head;
		for (int i = 0; i < index-1; i++) {
			prev = prev.next;
		}
		
		Node<E> todoDeleted = prev.next;
		prev.next = prev.next.next;
		
		E returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = prev;
		}
		
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		Node<E> temp = head;
		for (int i = 0; i <index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(E data) {
		Node<E> temp = head;
		int index = 0;
		
		while ((temp.data != data) && (!temp.data.equals(data))) {
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	
	public Object[] toArray() {
		Object[] listArray = new Object[size];
		for(int i = 0; i < size; i++) {
			listArray[i] = get(i);
		}
		return listArray;
	}
	
	public E[] toArray(E[] e) {
		E[] listArray = e;
		for (int i = 0; i < size; i++) {
			listArray[i] = get(i);
		}
		return listArray;
	}
}
