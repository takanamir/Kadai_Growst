package S04;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class S04L05 {
	public static void main(String[] args) {
		// 1.処理結果として戻り値を返す場合 => return文が必要(とするのが基本)
		Supplier<String> my511 = () -> { return "CAT"; };
		
		// 2.ラムダ式の文数が1文のみの場合、戻り値を返したと判断される時がある
		Supplier<String> my512 = () -> "DOG";
		
		// 3.戻り値を返さない処理が行われた場合 => return文が不要
		Consumer<String> my521 = s -> System.out.println(s);
		
		// 4.3の参考(コンパイルが通るだけだが)
		Consumer<String> my522 = s -> { String a = s; };
		
		// 実行
		System.out.println(my511.get()); // CAT
		System.out.println(my512.get()); // DOG
		my521.accept("FOX"); // FOX
		my522.accept("COW"); // 何も示されず
	}
}