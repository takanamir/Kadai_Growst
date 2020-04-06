package S06;

import java.util.function.Supplier;

/*
 * Supplier<T> を引数として利用する
 */
public class S06L03 {
	public static void main(String[] args) {

		// 単文渡し
		Supplier<String> sp1 = () -> "HORSE";
		String s1 = printSupplier(sp1);
		System.out.println(s1);

		// 複数文渡し
		Supplier<String> sp2 = () -> {
			System.out.println("PANDA");
			return "FOX";
		};
		String s2 = printSupplier(sp2);
		System.out.println(s2);
		
		// 戻り値を渡す
		Supplier<String> sp3 = getSupplier();
		String s3 = printSupplier(sp3);
		System.out.println(s3);

	}
	
	static String printSupplier(Supplier<String> sup) {
		System.out.println();
		return sup.get();
	}
	
	// Supplier<T> を戻す
	static Supplier<String> getSupplier() {
		Supplier<String> sup = () -> {
			System.out.println("DOG");
			System.out.println("CAT");
			System.out.println("COW");
			System.out.println("FOX");
			return "PANDA"; // Supplierへのリターン
		};
		return sup; // メソッドへのリターン
	}
	
}