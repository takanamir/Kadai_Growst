package S04;

import java.util.function.Consumer;

public class S04L03 {
	public static void main(String[] args) {
		// 1.閲覧頻度の高いラムダ式(学ぶ分にはいいが、現実的ではない)
		Consumer<String> cs = s -> System.out.println(s);
		cs.accept("CAT"); // CAT
		
		// 2.複数文を記述したラムダ式(可能)
		Consumer<String> cs2 = s -> {System.out.print("DOG");
										System.out.print('&');
										System.out.print(s);};
		cs2.accept("CAT"); // DOG&CAT
	}
}