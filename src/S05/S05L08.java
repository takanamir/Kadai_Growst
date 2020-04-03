package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * ストリームの中間操作(汎用性の高いメソッド(filter, distinct, limit, sort))
 */
public class S05L08 {
	public static void main(String[] args) {

		// 文字列要素の処理対象コレクションを生成
		List<String> animal = new ArrayList<>();
		animal = Arrays.asList("CAT", "DOG", "FOX", "COW", "PIG", "DOG"); // DOGが2件存在
		
		// 1.distinct(重複削除)
		Stream<String> stream = animal.stream();
		stream = stream.distinct();
		System.out.print("\n1: distinct = ");
		stream.forEach(a -> System.out.print(" " + a)); // CAT DOG FOX COW PIG
		
		// 2.filter(false要素の削除)
		stream = animal.stream();
		stream = stream.filter(a -> a.charAt(0) == ('C')); // 先頭文字がC
		System.out.print("\n2: filter = ");
		stream.forEach(a -> System.out.print(" " + a)); // CAT COW
		
		// 3.sorted(整列)
		stream = animal.stream();
		stream = stream.sorted(); // 昇順
		System.out.print("\n3: sorted = ");
		stream.forEach(a -> System.out.print(" " + a)); // CAT COW DOG DOG FOX PIG
		
		// 4.limit(要素個数の制限)
		stream = animal.stream();
		stream = stream.limit(3);
		System.out.print("\n4: limit = ");
		stream.forEach(a -> System.out.print(" " + a)); // CAT DOG FOX
		
		// 5.map(文字列変換)
		stream = animal.stream();
		stream = stream.map(a -> '(' + a + ')');
		System.out.print("\n5: map = ");
		stream.forEach(a -> System.out.print(" " + a)); // (CAT) (DOG) (FOX) (COW) (PIG) (DOG)
		
		// 6.1～5を全て適用(実行結果を画面表示できるが保存できていない)
		stream = animal.stream();
		System.out.print("\n6: 1～5を全て適用 =");
		stream.distinct()
				.filter(a -> a.charAt(0) == ('C'))
				.sorted()
				.limit(3)
				.map(a -> '(' + a + ')')
				.forEach(a -> System.out.print(" " + a));
		
		// 7.1～5を全て適用(結果をList<String>に取得)
		stream = animal.stream();
		System.out.print("\n7: 1～5を全て適用 =");
		List<String> lastResult = stream.distinct()
										.filter(a -> a.charAt(0) == ('C'))
										.sorted(Comparator.naturalOrder())
										.limit(3)
										.map(a -> '(' + a + ')')
										.collect(Collectors.toList()); // List<String> へ保存(終端操作)
		
		for(String s: lastResult) {
			System.out.print(" " + s); // (CAT) (COW)
		}
		
	}
}