package S06;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * ラムダ式を引数として利用する
 */
public class S06L01 {
	public static void main(String[] args) {
		
		printConsumer(a -> System.out.println(a));
		
		printSupplier(() -> { return "DOG"; });
		
		printPredicate(a -> { if(a.equals("FOX"))
									return true;
								else {
									return false;
								}
							}
						);
		
		/*
		 CAT
		 DOG
		 true
		*/
	}
	
	// Consumer<T> : 引数T、戻り値なし
	static void printConsumer(Consumer<String> con) {
		con.accept("CAT"); // CAT
	}
	
	// Supplier<T> : 引数なし、戻り値T
	static void printSupplier(Supplier<String> sup) {
		System.out.println(sup.get()); // DOG
	}
	
	// Predicate<T> : 引数T、戻り値boolean
	static void printPredicate(Predicate<String> pre) {
		System.out.println(pre.test("FOX"));
	}
	
}