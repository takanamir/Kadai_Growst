package S03;

/*
 * 関数型インターフェースのサンプル
 */
public interface CheckWonLottery {
	
	// 抽象メソッド
	abstract public String check(Integer inNumber, Integer winNumber);
	
	/*
	[補足事項]
	1.@FunctionalInterface: 関数型インターフェースを意味するアノテーション
	2.abstract: 抽象メソッドを意味する、省略可能
	3.静的メソッド、defaultメソッドの有無にはとらわれない
	
	[関数型インターフェースの特徴]
	CheckWonLottery と check が1対1に対応している
	 */
	
}