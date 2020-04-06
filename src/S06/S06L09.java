package S06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ストリームを引数や戻り値として利用する
 */
public class S06L09 {
	public static void main(String[] args) {
		Stream<String> animal1 = Stream.of("CAT", "DOG", "FOX");
		printStream(animal1); // Streamを引数として "CAT", "DOG", "FOX" を表示
		
		List<String> list = Arrays.asList("PANDA", "LION", "MOUSE");
		Stream<String> animal2 = getStream(list);
		printStream(animal2); // Streamを引数として "PANDA", "LION", "MOUSE" を表示
	}
	
	// Stream<String> を画面表示
	static void printStream(Stream<String> sm) {
		System.out.println();
		sm.forEach(animal -> System.out.println(animal));
	}
	
	// Stream<String> を戻り値とする
	static Stream<String> getStream(List<String> list) {
		Stream<String> animal = list.stream();
		return animal;
	}
}