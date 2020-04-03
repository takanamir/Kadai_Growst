package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ストリームの中間操作(デバッグ)
 */
public class S05L11 {
	public static void main(String[] args) {

		// 文字列要素を保存するコレクションを生成
		List<String> animal = new ArrayList<>();
		animal = Arrays.asList("CAT", "DOG", "FOX");

		// 1.集約処理：順次、文字列を連結
		String result1 = animal.stream()
				.peek(a -> System.out.print("animal:" + a + " ")) // 予期している要素が渡っているかどうか表示して確認
				.reduce("", (total, part) -> total + part + " "); // "" は初期値、BinaryOperator
		System.out.println("1: 集約処理 = " + result1); // CAT DOG FOX PIG 

		// 数値要素の処理対象コレクションを生成
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(10, 20, 30, 40);

		// 2.集約処理：順次、数値を加算する
		int result2 = list.stream().reduce(0, (total, part) -> 
										{ 
											System.out.print("total:" + total + " ");
											return total + part; 
										}
									); // 0 は初期値
		System.out.println("2: 集約処理 = " + result2); // 100

	}
}