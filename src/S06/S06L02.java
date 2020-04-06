package S06;

import java.util.function.Consumer;

/*
 * Consumer<T> を引数として利用する
 */
public class S06L02 {
	public static void main(String[] args) {

		// 単文渡し
		Consumer<String> co1 = s -> System.out.println("\n" + s);
		co1.accept("PANDA");
		printConsumer(co1, "PANDA");

		// 複数文渡し
		Consumer<String> co2 = s -> {
			System.out.println();
			System.out.println(s + "その１");
			System.out.println(s + "その２");
		};
		co2.accept("HORSE");
		printConsumer(co2, "HORSE");

		// 戻り値を渡す
		Consumer<String> co3 = getConsumer(); // co3 に getConsumer() が渡る
		co3.accept("MOUSE");
		printConsumer(co3, "MOUSE");

	}

	// Consumer<T> を渡す
	static Consumer<String> getConsumer() {
		Consumer<String> con = s -> {
			System.out.println();
			System.out.println(s + "&DOG");
			System.out.println(s + "&CAT");
			System.out.println(s + "&COW");
			System.out.println(s + "&FOX");
		};
		return con;
	}

	static void printConsumer(Consumer<String> con, String pData) {
		con.accept(pData);
	}
}