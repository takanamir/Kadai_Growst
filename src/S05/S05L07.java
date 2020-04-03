package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ストリームの終端操作(集約結果を取得)
 * 終端メソッドは1つしか書けない
 */
public class S05L07 {
	public static void main(String[] args) {

		// 文字列要素の処理対象コレクションを生成
		List<String> animal = new ArrayList<>();
		animal = Arrays.asList("CAT", "DOG", "FOX", "PIG");

		// 1.集約処理：順次、文字列を連結
		String result1 = animal.stream().reduce("", (total, part) -> total + part + " "); // "" は初期値、BinaryOperator
		System.out.println("1: 集約処理 = " + result1); // CAT DOG FOX PIG 
		
		// 数値要素の処理対象コレクションを生成
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(10,20,30,40);
		
		// 2.集約処理：順次、数値を加算する
		int result2 = list.stream().reduce(0, (total, part) -> total + part); // 0 は初期値
		System.out.println("2: 集約処理 = " + result2); // 100
		
	}
}