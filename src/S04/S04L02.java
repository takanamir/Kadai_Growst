package S04;

import java.util.function.Consumer; // Consumer：戻り値なし、引数1個、抽象メソッド名はaccept

public class S04L02 {
	public static void main(String[] args) {
		// 1.省略が多いラムダ式
		Consumer<String> cs1 = inStr -> System.out.println(inStr);
		
		// 2.省略している部分の復活
		Consumer<String> cs2 = (String inStr) -> {System.out.println(inStr);};
		
		// 3.SE7までの場合
		Consumer1<String> cs3 = new Consumer1<>();
		
		cs1.accept("1.省略が多いラムダ式");
		cs2.accept("2.省略している部分の復活");
		cs3.accept("3.SE7までの場合");
	}
}

class Consumer1<T> {
	void accept(T t) {
		System.out.println(t);
	}
}