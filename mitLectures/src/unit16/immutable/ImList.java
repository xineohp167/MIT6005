package unit16.immutable;

/**
 * Immutable List Interface
 * @author fabien
 *
 * @param <E>
 */
public interface ImList<E> {
	
	// static factory method 
	public static <E> ImList<E> empty(){
		return new Empty<>();
	}
	
	/**
	 * Returns the reversed list
	 * @return reversed list
	 */
	public ImList<E> reverse();
	
	/**
	 * Appends all of the elements in the specified collection to the end of this list
	 * @param other the other list
	 * @return list containing this.list + other list
	 */
	public ImList<E> append(ImList<E> other);
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param n index of the element to return
	 * @return the element at the specified position in this list
	 */
	public E get(int n);
	
	/**
	 * Returns true iff list contains element e
	 * @param e
	 * @return true iff list contains element e
	 */
	public boolean contains(E e);
	
	/**
	 * Returns true if this list contains no elements
	 * @return true if this list contains no elements
	 */
	public boolean isEmpty();
	
	/**
	 * Return the size of the list
	 * @return size of the list
	 */
	public int size();
	
	/**
	 * Returns the first element of the list
	 * @requires e != null
	 * @return the first element
	 */
	public E first();
	
	
	/**
	 * Returns the list without the first element
	 * @requires list is nonempty
	 * @return the list without the first element
	 */
	public ImList<E> rest();
	
	/**
	 * Add the element to the head of the list
	 * @param e the new element who is the head of the list
	 * @return the list with head pointing to e
	 */
	public ImList<E> cons(E e);
	

}
