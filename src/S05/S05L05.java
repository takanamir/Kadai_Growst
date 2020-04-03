package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ストリームとラムダ式の関係
 */
public class S05L05 {
	public static void main(String[] args) {
		
		// 文字列要素を保存するコレクションを生成
		List<String> animal = new ArrayList<>();
		
		animal = Arrays.asList("CAT", "DOG", "FOX", "PIG");
		
		// ストリームオブジェクトを4個生成
		Stream<String> stream1 = animal.stream();
		Stream<String> stream2 = animal.stream();
		Stream<String> stream3 = animal.stream();
		Stream<String> stream4 = animal.stream();
		
		// 1.要素の先頭文字のみ取得 mapの構文：(Function<? super T, ? extends mapper>)
		// a.charAt(0) の戻り値はchar型 => Character 結論：TはString, RはCharacter
		System.out.print("\n1: ");
		stream1.map(a -> a.charAt(0)).forEach(a -> System.out.print(a + " "));
		
		// 2.1へのreturnを追加(returnはあってもなくてもうまくいく)
		System.out.print("\n2: ");
		stream2.map(a -> { return a.charAt(0); }).forEach(a -> System.out.print(a + " "));
		
		// 3.2を複数文にする
		// return文は省略不可になる
		System.out.print("\n3: ");
		stream3.map(a -> { String str = "先頭の文字"; return str + a.charAt(0); })
				.forEach(a -> System.out.print(a + " "));
		
		// 4.1文字目の取得をsubstringで行う
		// a.substring(0,1) の戻り値はString型
		// 結論：TはString, RもString TとRは同型でも良い
		System.out.print("\n4: ");
		stream4.map(a -> a.substring(0,1)).forEach(a -> System.out.print(a + " "));

	}
}