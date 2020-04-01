package S03;

public class S03L04 {

	public static void main(String[] args) {
		// 静的メソッドはnewしなくても実行可能
		SampleInterface.printStatic();

		// 抽象メソッドが未オーバーライドなのでコンパイルエラー
//		SampleInterface si1 = new SampleInterface();
		
		// 無名(匿名)クラスを利用したオブジェクト生成
		SampleInterface si2 = new SampleInterface () {
			@Override
			public void printAbstract(String inStr) {
				System.out.println(inStr);
			}
		};
		
		// defaultメソッドの実行
		si2.printDefault();
		
		// オーバーライドされたメソッドの実行
		si2.printAbstract("オーバーライドされた抽象メソッド1");
		
		// S03L0402オブジェクトにて
		S03L0402 s = new S03L0402();
		s.printAbstract("オーバーライドされた抽象メソッド2");
	}

}

class S03L0402 implements SampleInterface {
	@Override
	public void printAbstract(String inStr) {
		System.out.println(inStr);
	}
}