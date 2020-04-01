package S02;
/**
 * コンテナ(土台)クラス
 * @author Owner
 *
 */
public class Base02<T extends Super01> { // 境界型パラメータ
	private T t;
	
	// コンストラクタ
	public Base02(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}


	@Override
	public String toString() {
		return "Base02";
	}
}