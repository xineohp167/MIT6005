package unit16.immutable;

public class TestImList {

	public static void main(String[] args) {
		ImList<Integer> nil = ImList.empty();
		System.out.println(nil); //[]
		ImList<Integer> x = nil.cons(2).cons(1).cons(0);
		System.out.println(x); // [0,1,2]
		ImList<Integer> y = x.rest().cons(4);
		System.out.println(y); // [4,1,2]
		ImList<Integer> z = x.reverse();
		System.out.println(z); // [2,1,0]
	}

}
