package S02;

import java.util.ArrayList;
import java.util.List;

class Q02A {
	
}

class Q02B extends Q02A {
	
}

class Q02C extends Q02B {
	
}

class S02Q02 {

	public static void main(String[] args) {
		List<Q02B> q02List = new ArrayList<>();
		// q02List.add(new Q02A());         // => コンパイルエラー
		// q02List.add(new Q02B());         // => コンパイル正常
		// q02List.add(new Q02C());         // => コンパイル正常ー
		// q02List.add(new String("TEST")); // => コンパイルエラー
		// q02List.add(new Object());       // => コンパイルエラー
	}

}