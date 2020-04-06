package S06;

import java.util.function.Function;

/*
 * Function<T,R> を引数として利用する
 */
public class S06L04 {
	public static void main(String[] args) {

		// 単文渡し
		Function<String, Integer> fn1 = s -> 111;
		Integer i1 = printFunction(fn1, "222");
		System.out.println(i1);

		// 複数文渡し
		Function<String, Integer> fn2 = s -> {
			System.out.println(s);
			return Integer.parseInt(s); // 333
		};
		Integer i2 = printFunction(fn2, "333");
		System.out.println(i2); // 333

		// 戻り値を渡す
		Integer i3 = printFunction(getFunction(), "444"); // DOG CAT COW FOX
		System.out.println(i3); // 444

	}

	static Integer printFunction(Function<String, Integer> fnc, String s) {
		System.out.println();
		return fnc.apply(s);
	}
	
	static Function<String, Integer> getFunction() {
		Function<String, Integer> fnc = s -> {
			System.out.println("DOG");
			System.out.println("CAT");
			System.out.println("COW");
			System.out.println("FOX");
			return Integer.parseInt(s); // Functionへのリターン
		};
		return fnc; // メソッドへのリターン
	}

}