package S02;

// 型パラメータサンプルプログラム
public class S02L03 {
	
	/*
	1.型パラメータを表す文字の種類 => 処理対象
	  E: Element => 要素オブジェクト
	  K: Key => キーオブジェクト
	  V: Value => 値を表すオブジェクト
	  T: Type => 一般的なクラスのオブジェクト
	  ? 型を処理せず => 全オブジェクト
	2.プログラミング不可例
	  new T();
	  List<> list = new ArrayList<>();
	 */

	public static void main(String[] args) {
		Base01<String> b01 = new Base01<>("Base01 String");
		System.out.println(b01.getT()); // Base01 String
		Base01<Integer> b02 = new Base01<>(100);
		System.out.println(b02.getT()); // 100
		Base02<Super01> b03 = new Base02<>(new Super01());
		System.out.println(b03.getT()); // Super01
		
		System.out.println(b01); // Base01
		System.out.println(b02); // Base01
		System.out.println(b03); // Base02
	}

}