package S02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Listの土台クラス
 * @author Owner
 *
 */
public class BaseList01<E> {
	
	// コレクション保存領域
	private List<E> e;
	
	//新規作成
	public void createList() {
		this.e = new ArrayList<E>();
	}
	
	// ゲッター
	public List<E> getE(){
		return e;
	}
	
	// 要素の追加
	public void addElement(E element) {
		e.add(element); // boolean add(E e)
	}
	
	// 初期化
	public void setArray(E[] array) {
		this.e = Arrays.asList(array); // static <T> List<T> asList(T... a)
	}

	@Override
	public String toString() {
		return e.toString();
	}
	
}