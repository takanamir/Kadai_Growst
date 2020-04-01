package S02;

/**
 * 型パラメータ(?)を持つコレクションのオブジェクト生成
 * @author Owner
 *
 */
public class S02L09 {

	public static void main(String[] args) {

		String[] data01 = { "DOG", "CAT", "COW2", "FOX" };
		BaseList01<String> list01 = new BaseList01<>();
		list01.createList(); // ArrayListオブジェクトの生成
		list01.setArray(data01); // 初期化
		printList(list01); // [DOG, CAT, COW, FOX]

		Super01[] data02 = {new Super01(), new Sub0101(), new Sub0102()};
		BaseList01<Super01> list02 = new BaseList01<>();
		list02.createList();
		list02.setArray(data02);
		printList(list02); // [Super01, Sub0101, Sub0102]

	}

	// 表示用共通メソッド
	public static void printList(BaseList01<?> pData) {
		System.out.println(pData);
	}
	
}