package S04;

import java.util.function.UnaryOperator;

/*
 * インスタンスメソッド参照
 */
public class S04L07 {
	public static void main(String[] args) {
		// 1.従来のプログラム
		String word = "cat";
		String upperWord = word.toUpperCase();
		System.out.println("1: " + upperWord); // CAT
		
		// 2.インスタンスメソッド参照型プログラム
		UnaryOperator<String> uo = String::toUpperCase;
		String word2 = "dog";
		String upperWord2 = uo.apply(word2);
		System.out.println("2: " + upperWord2); // DOG
	}
}