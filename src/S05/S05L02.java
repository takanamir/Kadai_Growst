package S05;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
 * ストリームの種類とパイプライン
 */
public class S05L02 {
	public static void main(String[] args) {
		
		// 1.ストリームの種類
		
		// Stream<T>
		Stream<String> stream111 = Stream.of("CAT", "FOX", "PIG");
		Stream<Student> stream112 = Stream.of
				(new Student("01A01", "青木", 50),
					new Student("01A02", "青山", 70),
					new Student("01B02", "伊藤", 40)
				);
		
		// IntStream
		IntStream stream12 = IntStream.of(100, 200, 300);
		
		// LongStream
		LongStream stream13 = LongStream.of(100, 200, 300);
		
		// DoubleStream
		DoubleStream stream14 = DoubleStream.of(100.0, 200.0, 300.0);
		
		// 2.パイプラインの種類
		Stream<String> stream21 = Stream.of
				("CAT", "FOX", "PIG", "COW", "BAT", "DOG");
		stream21.sorted().limit(4)
				.forEach(a -> System.out.print(a + " ")); // BAT CAT COW DOG
	
	}
}