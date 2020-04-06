package S06;

import java.util.function.BinaryOperator;

/*
 * BinaryOperator<T> を引数として利用する
 */
public class S06L06 {
	public static void main(String[] args) {		
		// 2個の数字の加算結果を表示する
		Integer in1 = 80;
		Integer in2 = 20;
		System.out.println("加算結果A = " + (in1 + in2));
		
		// 上と同じ結果を関数型インターフェースを利用して行う
		BinaryOperator<Integer> bio = (b1, b2) -> b1 + b2;
		Integer addAns = bio.apply(80,  20);
		System.out.println("加算結果B = " + addAns); // 100
		
		// 四則演算結果を表示する
		BinaryOperator<Integer> bioAdd = (b1, b2) -> b1 + b2;
		BinaryOperator<Integer> bioSub = (b1, b2) -> b1 - b2;
		BinaryOperator<Integer> bioMul = (b1, b2) -> b1 * b2;
		BinaryOperator<Integer> bioDiv = (b1, b2) -> b1 / b2;
		System.out.println("加算結果 = " + getArith(bioAdd, in1, in2));
		System.out.println("減算結果 = " + getArith(bioSub, in1, in2));
		System.out.println("乗算結果 = " + getArith(bioMul, in1, in2));
		System.out.println("除算結果 = " + getArith(bioDiv, in1, in2));
	}
	
	static Integer getArith(BinaryOperator<Integer> bio, Integer in1, Integer in2) {
		return bio.apply(in1, in2);
	}
}