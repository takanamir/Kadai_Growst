package S04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 引数としての関数型インターフェース
 */
public class S04L10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = Arrays.asList("CAT", "DOG", "COW", "FOX");
		list.forEach(animal -> System.out.println(animal)); // 全要素を表示
		
		System.out.println();
		list.forEach(System.out::println); // 全要素を表示(静的メソッド参照)
	}
}