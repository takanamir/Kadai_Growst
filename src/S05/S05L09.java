package S05;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/*
 * ストリームの中間操作(文字列操作)
 */
public class S05L09 {
	public static void main(String[] args) {
		
		List<String> zoo = Arrays.asList("CaT", "D8G", "F8x", "C8W", "Li8N", "W8LF");
		
		// 1.全動物の名称を大文字に変換して表示
		System.out.print("\n1: ");
		zoo.stream().map(a -> a.toUpperCase())
				.forEach(a -> System.out.print(a + " "));
		
		// 2.全動物の名称に含まれる'8'を'O'に変換して表示
		System.out.print("\n2: ");
		zoo.stream().map(a -> a.replace('8', 'O'))
				.forEach(a -> System.out.print(a + " "));
		
		// 3.全動物の名称の先頭に昇順の番号を追加して表示
		AtomicInteger cnt = new AtomicInteger(1); // 1から始まるカウンター
		System.out.print("\n3: ");
		zoo.stream().map(a -> cnt.getAndIncrement() + "." + a)
				.forEach(a -> System.out.print(a + " "));
		
		// 4.1～3を連続処理して表示(結果は保存されていない)
		System.out.print("\n4: ");
		cnt.set(1); // カウンターを1へ
		zoo.stream()
				.map(a -> a.toUpperCase())
				.map(a -> a.replace('8', 'O'))
				.map(a -> cnt.getAndIncrement() + "." + a)
				.forEach(a -> System.out.print(a + " "));
		
		// 5.4の処理結果を保存する(表示しっぱなしのケースは少ない)
		cnt.set(1);
		List<String> lastAnimal = zoo.stream().map(a -> a.toUpperCase())
												.map(a -> a.replace('8', 'O'))
												.map(a -> cnt.getAndIncrement() + "." + a)
												.collect(Collectors.toList()); // List<String> へ保存(終端操作)
		
		System.out.print("\n5: ");
		lastAnimal.stream().forEach(a -> System.out.print(a + " "));
		
	}
}