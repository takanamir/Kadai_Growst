package S04;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
 * コンストラクタ参照
 */
public class S04L08 {
	public static void main(String[] args) {
		// 1.従来のプログラム
		String str = new String();
		ArrayList<String> al = new ArrayList<>();
		
		// 2-1.コンストラクタ参照プログラム Supplier<T>：引数なし、戻り値T
		Supplier<String> sp21 = String::new;
		String str21 = sp21.get();
		System.out.println("str21 = " + str21); // 中身なし
	
		// 2-2.コンストラクタ参照プログラム
		Supplier<ArrayList<String>> sp22 = ArrayList<String>::new;
		ArrayList<String> al22 = sp22.get();
		System.out.println("al22.size() = " + al22.size()); // 要素数は0
		
		// 3.引数が存在するStringの場合のコンストラクタ参照プログラム
		// 引数の型Tと戻り値の型は同じになる => UnaryOperator<T> を利用
		UnaryOperator<String> uo = String::new;
		String str3 = uo.apply("CAT"); // String str3 = new String("CAT") と同じ
		System.out.println("str3 = " + str3);
	}
}