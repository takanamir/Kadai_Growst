package S02;
/**
 * コンテナ(土台)クラス
 * @author Owner
 *
 */
public class Base01<T> {
	private T t;
	
	// コンストラクタ
	public Base01(T t) {
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
		return "Base01";
	}
}