package S04;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class S04L04 {
	public static void main(String[] args) {
		// 例1.関数型インターフェース：Consumer<T>、抽象メソッド：void accept(T t)、概要：引数の型はT・戻り値なし
		Consumer<String> cs = (String inStr) -> {System.out.println(inStr);};
		
		// 例2.関数型インターフェース：Function<T,R>、抽象メソッド：R apply(T t)、概要：引数の型はT・戻り値の型はR
		Function<String, Integer> fc = (String inStr) -> {return Integer.parseInt(inStr);};
		
		// 例3.関数型インターフェース：BiPredicate<T,U>、抽象メソッド：boolean test(T t, U u)、概要：引数の型はT・戻り値の型はboolean
		BiPredicate<String, Integer> bp = (String inStr, Integer inInt) -> 
			{ int wint;
				wint = Integer.parseInt(inStr);
				if(inInt == wint) {
					return true;
				} else {
					return false;
				}
			};
		
		// 例1の実行
		cs.accept("CAT"); // CAT
		
		// 例2の実行
		System.out.println(fc.apply("123")); // 123
	
		// 例3の実行
		System.out.println(bp.test("100", 100)); // true
	}
}