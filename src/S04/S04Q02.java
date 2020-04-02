package S04;

@FunctionalInterface
interface Q02Interface<T> {
	void accept(T t);
}

public class S04Q02 {
	public static void main(String[] args) {
		// 1.抽象メソッドをオーバーライドする方法
		Q02Interface<String> q02i = new Q02Interface<String>() {
			public void accept(String inStr) {
				System.out.println(inStr);
			}
		};
		q02i.accept("方法１");
		
		// 2.ラムダ式にて関数型インターフェースの抽象メソッドをオーバーライドする方法
		Q02Interface<String> cs = inStr -> System.out.println(inStr);
		cs.accept("方法２");
	}
}