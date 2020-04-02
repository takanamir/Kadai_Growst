package S04;

//import java.util.function.*;

public class S04Q01 {
	public static void main(String[] args) {
		// コンパイルエラーにならないものは？
		
		// 問題0101
//		Consumer<String> con1 = System.out.println(s);                  // (A)
//		Consumer<String> con2 = s -> System.out.println(s);             // (B)
//		Consumer<String> con3 = s -> return (s + "AB");                 // (C)
//		
		// 問題0102
//		Supplier<String> sup1 = return s + "AB";                        // (A)
//		Supplier<String> sup2 = s -> return s + "AB";                   // (B)
//		Supplier<String> sup3 = () -> { return "AB"; };                 // (C)
//		
		// 問題0103
//		Function<String, Integer> fun1 = return 100;                    // (A)
//		Function<String, Integer> fun2 = s -> 100;                      // (B)
//		Function<String, Integer> fun3 = s -> { rerurn 100 };           // (C)
//		
		// 問題0104
//		Predicate<String> pre1 = s -> { s = s + "AB"; return false; };  // (A)
//		Predicate<String> pre2 = s -> { false };                        // (B)
//		Predicate<String> pre3 = s -> rerurn false;                     // (C)
		
		/*
		 * 解答
		 * 問題0101:(B)
		 * 問題0102:(C)
		 * 問題0103:(B)
		 * 問題0104:(A)
		 */		
	}
}