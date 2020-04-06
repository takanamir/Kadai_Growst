package S06;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class S06Q01 {
	
	// Consumer<T> : 引数T、戻り値なし
	static void printConsumer(Consumer<String> con) {
		con.accept("CAT");
	}
	
	// Supplier<T> : 引数なし、戻り値T
	static void printSupplier(Supplier<String> sup) {
		System.out.println(sup.get());
	}
	
	// Predicate<T> : 引数T、戻り値boolean
	static void printPredicate(Predicate<String> pre) {
		System.out.println(pre.test("FOX"));
	}
	
	public static void main(String[] args) {
		// (A)
//		printConsumer(a -> System.out.println(a));                 // ア
//		printConsumer((a1,a2) -> { int a3 = a1 + a2; return a3; }) // イ
//		printConsumer(() -> { return "DOG"; });                    // ウ
//		printConsumer(a -> { if(a.equals("FOX"))                   // エ
//								return true;
//							  else
//								return false;
//					});
		
		// (B)
//		printSupplier(a -> System.out.println(a));                 // ア
//		printSupplier((a1,a2) -> { int a3 = a1 + a2; return a3; }) // イ
//		printSupplier(() -> { return "DOG"; });                    // ウ
//		printSupplier(a -> { if(a.equals("FOX"))                   // エ
//								return true;
//							  else
//								return false;
//					});
		
		// (C)
//		printPredicate(a -> System.out.println(a));                 // ア
//		printPredicate((a1,a2) -> { int a3 = a1 + a2; return a3; }) // イ
//		printPredicate(() -> { return "DOG"; });                    // ウ
//		printPredicate(a -> { if(a.equals("FOX"))                   // エ
//								return true;
//							  else
//								return false;
//					});
		
		// 解答：(A)ア (B)ウ (C)エ
	}
}