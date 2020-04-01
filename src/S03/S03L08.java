package S03;

import java.util.function.Consumer;

/**
 * 関数型インターフェース ～Java APIドキュメントの参照～
 * @author Owner
 *
 */
public class S03L08 {

	public static void main(String[] args) {

		// 構文：abstract void accept(T t)
		Consumer<String> cs1 = new Consumer<String>() {
			public void accept(String inStr) {
				System.out.println("cs1" + inStr);
			}
		};
		// 実行
		cs1.accept("の実行");

		Consumer<String> cs2 = new Consumer<String>() {
			public void accept(String inStr) {
				System.out.println("cs2" + inStr);
			}
		};
		cs2.accept("の実行");
		
		/*
		Consumer<T> の構文説明
		  (全体構文) default Consumer<T> andThen(Consumer<? super T>) after
		  (個別説明)
		    default: (andThen が)デフォルトメソッド
		    Consumer<T>: 戻り値がConsumer<T>
		    andThen: デフォルトメソッド名
		    (Consumer<? super T>) after : afterは Consumer<? super T> オブジェクト
		*/
		
		Consumer<String> cs3 = cs1.andThen(cs2);
		System.out.println("以下 cs3の実行結果");
		cs3.accept("の実行"); // cs1とcs2のオブジェクトが連結実行

	}

}