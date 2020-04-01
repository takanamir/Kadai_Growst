package S02;

// 境界型パラメータを利用したオブジェクト生成
public class S02L05 {

	/*
	1.型パラメータ
	<E>   => Eのみ
	<K,V> => KとV
	2.境界型パラメータ
	<E super Sub0102> => Object, Super01, Sub0101, Sub0102
	<E extends Super01> => Super01, Sub0101, Sub0102
	3.2の継承関係
	class Super01{}                 <= スーパークラス
	class Sub0101 extends Super01{} <= サブクラス
	class Sub0102 extends Sub0101{} <= サブクラス
	 */
	
	public static void main(String[] args) {
		Base02<Super01> b01 = new Base02<>(new Super01());
		Base02<Sub0101> b02 = new Base02<>(new Sub0101());
		Base02<Sub0102> b03 = new Base02<>(new Sub0102());
		
		System.out.println(b01.getT()); // Super01
		System.out.println(b02.getT()); // Sub0101
		System.out.println(b03.getT()); // Sub0102

	}

}
