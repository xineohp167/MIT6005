package unit16.immutable;

public class Empty<E> implements ImList<E> {

	public Empty() {
    }
	
    public ImList<E> cons(E e) {
        return new Cons<>(e, this);
    }
    
    public E first() {
        throw new UnsupportedOperationException();
    }
    
    public ImList<E> rest() {
        throw new UnsupportedOperationException();
    }

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public boolean contains(E e) {
		return false;
	}

	@Override
	public E get(int n) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ImList<E> append(ImList<E> other) {
		return other;
	}

	@Override
	public ImList<E> reverse() {
		return new Empty<>();
	}
	
	@Override
    public boolean equals(Object o) {
        return o instanceof Empty;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "[]";
    }

}
