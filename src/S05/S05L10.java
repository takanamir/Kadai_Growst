package S05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * ストリームの中間操作(平坦化)
 * 平坦化：大きな要素から、宰相範囲となる複数要素へ型変換すること
 * 実務ではよくある
 */
public class S05L10 {
	public static void main(String[] args) {
		
		List<String> zoo1 = Arrays.asList("CAT", "DOG", "FOX");
		List<String> zoo2 = Arrays.asList("COW", "PIG", "BAT");
		
		List<List<String>> allZoo = Arrays.asList(zoo1, zoo2);
		
		// 平坦化して実行結果を保存する
		List<String> detailAnimal = allZoo.stream()
											.flatMap(a -> a.stream()).collect(Collectors.toList());
		
		// 実行結果を表示
		detailAnimal.stream().forEach(a -> System.out.print(a + " ")); // CAT DOG FOX COW PIG BAT 
		
	}
}