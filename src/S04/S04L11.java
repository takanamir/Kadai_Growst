package S04;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * ラムダ式による文字列操作
 */
public class S04L11 {
	public static void main(String[] args) {

		String baseChar = " CAT dog FOX cow";

		// 1.スペースサブレス結果の取得
		String result71 = baseChar.trim(); // SE7
		UnaryOperator<String> uo1 = s -> s.trim(); // SE8
		String result81 = uo1.apply(baseChar);
		System.out.println("1: スペースサブレス結果の取得 = " + result81);

		// 2.文字列長の取得
		Integer result72 = baseChar.length(); // SE7
		Function<String, Integer> fn2 = s -> s.length(); // SE8
		Integer result82 = fn2.apply(baseChar);
		System.out.println("2: 文字列長の取得 = " + result82);

		// 3.指定位置文字の取得
		Character result73 = baseChar.charAt(1); // SE7
		Function<String, Character> fn3 = s -> s.charAt(1); // SE8
		Character result83 = fn3.apply(baseChar);
		System.out.println("3: 指定位置文字の取得 = " + result83);

		// 4.指定位置文字の取得(3と同処理)
		int in1 = 1;
		Character result74 = baseChar.charAt(in1); // SE7
		BiFunction<String, Integer, Character> bf4 = (s, i) -> s.charAt(i); // SE8
		Character result84 = bf4.apply(baseChar, in1);
		System.out.println("4: 指定位置文字の取得 = " + result84);

		// 5.検索対象文字列の存在確認その１
		boolean result75 = baseChar.contains("FOX"); // SE7
		Function<String, Boolean> fn5 = s -> s.contains("FOX"); // SE8
		Boolean result85 = fn5.apply(baseChar);
		System.out.println("5: 検索対象文字列の存在確認その１ = " + result85);

		// 6.検索対象文字列の存在確認その２(5と同処理)
		String search = "FOX";
		boolean result76 = baseChar.contains(search); // SE7
		BiFunction<String, String, Boolean> bf6 = (s, i) -> s.contains(i); // SE8
		Boolean result86 = bf6.apply(baseChar, search);
		System.out.println("6: 検索対象文字列の存在確認その２ = " + result86);
		
		// 7.1と6を連続して行う(その１)
		Boolean result87 = bf6.apply(uo1.apply(baseChar), search);
		System.out.println("7: 1と6を連続して行う(その１) = " + result87);

		// 8.1と6を連続して行う(その２)
		BiFunction<String, String, Boolean> bf8 = (s, i) -> s.trim().contains(i);
		Boolean result88 = bf6.apply(baseChar, search);
		System.out.println("8: 1と6を連続して行う(その２) = " + result88);
		
	}
}