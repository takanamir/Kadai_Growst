package S03;

/*
 * SE8インターフェースのサンプル
 */
public interface SampleInterface {

	// 静的メソッド
	static void printStatic() {
		System.out.println("静的メソッド");
	}
	
	// defaultメソッド
	default void printDefault() {
		System.out.println("Defaultメソッド");
	}
	
	// 抽象メソッド
	abstract void printAbstract(String inStr);
	
	// 実装されているメソッド  => コンパイルエラー
//	void printMethod() {
//		System.out.println("実装されているメソッド");
//	}
	
}