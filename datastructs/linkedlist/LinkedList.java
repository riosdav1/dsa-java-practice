package datastructs.linkedlist;

public class LinkedList<E> {

    private E data;
    private LinkedList<E> _next;

    public LinkedList(E data) {
        this.data = data;
    }

    public LinkedList(E data, LinkedList<E> next) {
        this.data = data;
        this._next = next;
    }

	public void add(E e) {
		this.add(new LinkedList<E>(e));
	}

	public void add(LinkedList<E> node) {
		LinkedList<E> head = this;
		while (head._next != null) {
			head = head._next;
		}
		head._next = node;
	}
	
	public boolean remove(int index) {
		LinkedList<E> head = this;
		LinkedList<E> prev = this;
		for (int i = 0; i < index; i++) {
			prev = head;
			head = head._next;
			if (head == null) {
				throw new IndexOutOfBoundsException();
			}
		}
		prev._next = head._next;
		return true;
	}

	public LinkedList<E> get(int index) {
		LinkedList<E> head = this;
		for (int i = 0; i < index; i++) {
			head = head._next;
			if (head == null) {
				throw new IndexOutOfBoundsException();
			}
		}
		return head;
	}

	public E getData() {
		return this.data;
	}
	
	public void setData(E data) {
		this.data = data;
	}

	public LinkedList<E> next() {
		return this._next;
	}

	public void next(LinkedList<E> next) {
		this._next = next;
	}
}
