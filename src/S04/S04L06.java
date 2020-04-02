package S04;

import java.util.function.Function;

/*
 * 静的メソッド参照
 */
public class S04L06 {
	public static void main(String[] args) {
		// 1.従来のプログラム
		String str = String.valueOf(123);
		
		// 2.静的メソッド参照
		Function<Integer, String> fc2 = String::valueOf;
	
		// 3.同処理をラムダ式で記述
		Function<Integer, String> fc3 = inInt -> { return String.valueOf(inInt); };
	
		// 2の実行
		String funcAns2 = fc2.apply(123);
		System.out.println("2: funcAns2 = " + funcAns2);
		
		// 3.の実行
		String funcAns3 = fc3.apply(456);
		System.out.println("3: funcAns3 = " + funcAns3);
	}
}