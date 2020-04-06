package S06;

import java.util.function.Predicate;

/*
 * Predicate<T> を引数として利用する
 */
public class S06L05 {
	public static void main(String[] args) {
		// 単文渡し
		Predicate<String> pr1 = s -> true;
		boolean b1 = printPredicate(pr1, "PANDA");
		System.out.println(b1);

		// 複数文渡し
		Predicate<String> pr2 = s -> {
			System.out.println(s);
			if (s.equals("HORSE"))
				return true;
			else
				return false;
		};
		boolean b2 = printPredicate(pr2, "TIGER");
		System.out.println(b2);

		// 結果を受け取る
		boolean b3 = printPredicate(getPredicate(), "MOUSE");
		System.out.println(b3);

	}

	static boolean printPredicate(Predicate<String> pre, String s) {
		System.out.println();
		return pre.test(s);
	}

	static Predicate<String> getPredicate() {
		Predicate<String> pre = s -> {
			System.out.println("DOG");
			System.out.println("CAT");
			System.out.println("COW");
			System.out.println("FOX");
			if (s.equals("MOUSE"))
				return true;
			else
				return false;
		};
		return pre; // メソッドへのリターン
	}
}