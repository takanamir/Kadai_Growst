package S04;

class S04L01Class implements MyInterface1<String> {
	@Override
	public void accept(String inStr) {
		System.out.println(inStr);
	}
}

@FunctionalInterface
interface MyInterface1<T> {
	void accept(T t); // 抽象メソッド：戻り値なし、引数はT1個
}

public class S04L01 {
	public static void main(String[] args) {
		// 1.interfaceを利用してinterfaceの抽象メソッドをオーバーライドする方法
		S04L01Class s0401 = new S04L01Class();
		s0401.accept("オーバーライドの方法１");
		
		// 2.匿名クラスにて抽象メソッドをオーバーライドする方法
		MyInterface1<String> si = new MyInterface1<String>() {
			@Override
			public void accept(String inStr) {
				System.out.println(inStr);
			}
		};
		si.accept("オーバーライドの方法２");
		
		// 3.ラムダ式にて関数型インターフェースの抽象メソッドをオーバーライドする方法
		// ラムダ式といえば、関数型インターフェース！
		MyInterface1<String> cs = (String inStr) -> {System.out.println(inStr);};
		cs.accept("オーバーライドの方法３");
	}
}