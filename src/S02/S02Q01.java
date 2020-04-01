package S02;

class Q01String {
	String variable;

	String get() {
		return variable;
	}

	void set(String v) {
		this.variable = v;
	}
}

class Q01Integer {
	Integer variable;

	Integer get() {
		return variable;
	}

	void set(Integer v) {
		this.variable = v;
	}
}

// 型パラメータが指定された同処理
class S02Q01T<T> {
	T t;

	T get() {
		return t;
	}

	void set(T t) {
		this.t = t;
	}
}

class S02Q01 {
	public static void main(String[] args) {
		// Stringサンプル
		Q01String q01s = new Q01String();
		q01s.set("サンプルString");
		System.out.println(q01s.get());

		// Integerサンプル
		Q01Integer q01i = new Q01Integer();
		q01s.set("サンプルInteger");
		System.out.println(q01i.get());

		// String型パラメータサンプル
		S02Q01T<String> q01as = new S02Q01T<>();
		q01as.set("解答String");
		System.out.println(q01as.get());

		// Integer型パラメータサンプル
		S02Q01T<Integer> q01ai = new S02Q01T<>();
		q01ai.set(200);
		System.out.println(q01ai.get());
	}
}