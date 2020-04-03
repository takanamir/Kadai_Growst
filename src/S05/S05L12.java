package S05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ストリームのパイプラインを分割する
 * 実務でのプログラミングでは必ずパイプラインを使う
 */
public class S05L12 {
	public static void main(String[] args) {
		
		List<String> animal1, animal2 = new ArrayList<>();
		
		animal1 = Arrays.asList("CAT", "DOG", "FOX", "COW", "PIG");
		animal2 = Arrays.asList("CAT", "DOG", "FOX", "COW", "PIG");
		
		// 1.パイプラインにて処理を行う
		long cnt = animal1.stream().filter(a -> a.charAt(0) == 'C').count();
		
		// 2.同じ処理のパイプラインを分割して行う(わざと意図的に)
		Stream<String> stream21 = animal2.stream();
		Stream<String> stream22 = stream21.filter(a -> a.charAt(0) == 'C');
		long cnt2 = stream22.count();
		
		// 実行結果を確認
		System.out.println("1: cnt = " + cnt); // 1: cnt = 2
		System.out.println("2: cnt2 = " + cnt2); // 2: cnt2 = 2
		
	}
}