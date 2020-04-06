package S06;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class S06Q02 {
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
		System.out.println(pre.test("FOX")); // true
	}

	public static void main(String[] args) {

		Consumer<String> con = a -> System.out.println(a);

		Supplier<String> sup = () -> {
			return "DOG";
		};

		Predicate<String> pre = a -> {
			if (a.equals("FOX"))
				return true;
			else
				return false;
		};
		
//		printConsumer(？？？);  // (A)
//		printSupplier(？？？);  // (B)
//		printPredicate(？？？); // (C)
		
		// 解答 (A)con (B)sup (C)pre
	}
}