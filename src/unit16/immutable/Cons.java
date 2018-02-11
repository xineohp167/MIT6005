package unit16.immutable;
		
public class Cons<E> implements ImList<E> {

	private final E e;
    private final ImList<E> rest;
    private int size = 0;
    // rep invariant:
    //   e != null, rest != null, size >= 0
    //   size > 0 implies size == 1+rest.size()

    public Cons(E e, ImList<E> rest) {
        this.e = e;
        this.rest = rest;
    }
    
    public ImList<E> cons(E e) {
        return new Cons<>(e, this);
    }
    
    public E first() {
        return e;
    }
    
    public ImList<E> rest() {
        return rest;
    }

	@Override
	public int size() {
		if (size == 0) size = 1 + rest.size();
        return size;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(E element) {
		// contains(Cons(first: E, rest: ImList), e: E) = (first = e) ∨ contains(rest, e)
		return this.e.equals(element) || rest.contains(element);
	}

	@Override
	public E get(int n) {
		// get(Cons(first: E, rest: ImList), n) = if n=0 then first else get(rest, n-1)
		if(n == 0) {
			return e;
		}else {
			return rest.get(n-1);
		}
		
	}

	@Override
	public ImList<E> append(ImList<E> other) {
		// append(Cons(first: E, rest: ImList), list2: ImList) = cons(first, append(rest, list2))
		return new Cons<>(e, rest.append(other));
	}

	@Override
	public ImList<E> reverse() {
		// reverse(Cons(first: E, rest: ImList)) = append(reverse(rest), cons(first, empty())
		return rest.reverse().append(new Cons<>(e, new Empty<>()));
		
		//For reverse, it turns out that the recursive definition produces a pretty bad implementation in Java, 
		//with performance that’s quadratic in the length of the list you’re reversing. We could rewrite it 
		//using an iterative approach if needed.
	}
	
	/**
     * Compares the specified object with this list for equality.  Returns
     * <tt>true</tt> if the specified object is also a list, and the two lists
     * have the same elements in the same order.
     * 
     * @return all i | e_i.equals(eo_i) where this list = [e_0,...,e_n] and o = [eo_0,...,eo_n]
     */
    @Override
    public boolean equals (Object o) {
        if (o == this) return true;
        if (!(o instanceof ImList)) return false;
        ImList<?> l = (ImList<?>) o;
        if (l.size() != size()) return false;
        return first().equals(l.first()) && rest().equals(l.rest());
    }

    /**
     * Computes hash code
     * @return Returns the hash code value for this list. The hash code of a list is
     * defined to be the sum of the hash codes of the elements in the list,
     * where the hashcode of a <tt>null</tt> element is defined to be zero.
     */
    @Override
    public int hashCode () {
        return rest.hashCode() + (e == null ? 0 : e.hashCode());
    }

    /**
     * Get string representation of this list.
     * @return Returns the string representations of the list's elements, separated by commas,
     *    with the entire list surrounded by brackets.
     */
    @Override
    public String toString () {
        String s = "[";
        ImList<E> l = this;
        while (l.size() != 0) {
            if (l != this) s += ", ";
            s = s + l.first();
            l = l.rest();
        }
        return s + "]";
    }

}
