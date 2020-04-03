package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ストリームの終端操作(真偽を取得)
 */
public class S05L06 {
	public static void main(String[] args) {
		
		// 文字列要素を保存するコレクションを生成
		List<String> animal = new ArrayList<>();
		
		animal = Arrays.asList("CAT", "DOG", "FOX", "PIG");
		
		// 1.1個以上の要素との一致確認
		Stream<String> stream = animal.stream(); // 新規ストリーム
		boolean exist1 = stream.allMatch(a -> a.equals("DOG"));
		System.out.println("1: 1個以上の要素との一致確認 = " + exist1); // false
		
		// 2.いずれかの要素との一致確認
		stream = animal.stream(); // 新規ストリーム
		boolean exist2 = stream.anyMatch(a -> a.equals("DOG"));
		System.out.println("2: いずれかの要素との一致確認 = " + exist2); // true
		
		// 3.全要素との不一致確認
		stream = animal.stream(); // 新規ストリーム
		boolean exist3 = stream.noneMatch(a -> a.equals("DOG"));
		System.out.println("3: 全要素との不一致確認 = " + exist3); // false
		
	}
}