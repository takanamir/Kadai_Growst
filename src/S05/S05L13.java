package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ストリームのパイプライン実行順序
 * 中間操作メソッドの実行順番は結果が正しければ順不同というわけではなく、処理に要する時間が短くなる順番に心がけるべきである
 * (1)取捨選択(filter) (2)変換(map) (3)分類(sort) (4)処理件数制限(limit)
 */
public class S05L13 {
	public static void main(String[] args) {
		
		// 1.コレクションからストリームオブジェクトを生成
		List<String> list1 = new ArrayList<>();
		list1 = Arrays.asList("CAT", "FOX", "PIG", "DOG", "COW", "BAT");
		Stream<String> zoo11 = list1.stream();
		
		// 2.先頭文字が'C'である動物
		zoo11
			.filter(a -> a.charAt(0) == 'C')
			.map(a -> a + "&" + a.toLowerCase())
			.sorted()
			.limit(5)
			.forEach(a -> System.out.print(a + " "));
		
	}
}