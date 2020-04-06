package S06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * 関数型インターフェースをコレクション要素として利用する
 */
public class S06L08 {
	public static void main(String[] args) {
		// 計算用の数字を用意
		Integer in1 = 80;
		Integer in2 = 20;

		// BinaryOperatorオブジェクトの生成
		BinaryOperator<Integer> bioAdd = (b1, b2) -> b1 + b2;
		BinaryOperator<Integer> bioSub = (b1, b2) -> b1 - b2;
		BinaryOperator<Integer> bioMul = (b1, b2) -> b1 * b2;
		BinaryOperator<Integer> bioDiv = (b1, b2) -> b1 / b2;

		// Listを作成し、BinaryOperatorオブジェクトを保存
		List<BinaryOperator<Integer>> listArith = new ArrayList<>();
		listArith.add(bioAdd);
		listArith.add(bioSub);
		listArith.add(bioMul);
		listArith.add(bioDiv);
		
		// 四則演算表示メソッドの実行
		printArith(listArith, in1, in2);
	}
	
	static void printArith(List<BinaryOperator<Integer>> arith, Integer in1, Integer in2) {
		BinaryOperator<Integer> add = arith.get(0);
		BinaryOperator<Integer> sub = arith.get(1);
		BinaryOperator<Integer> mul = arith.get(2);
		BinaryOperator<Integer> div = arith.get(3);
		System.out.println("加算結果 = " + add.apply(in1, in2));
		System.out.println("減算結果 = " + sub.apply(in1, in2));
		System.out.println("乗算結果 = " + mul.apply(in1, in2));
		System.out.println("除算結果 = " + div.apply(in1, in2));
	}
}