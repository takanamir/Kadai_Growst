package S02;

/**
 * 型パラメータを持つコレクションのオブジェクト生成
 * @author Owner
 *
 */
public class S02L08 {

	public static void main(String[] args) {
		
		// 1.Stringのみを保存するArrayListオブジェクトの生成
		BaseList01<String> list01 = new BaseList01<>();
		list01.createList(); // ArrayListオブジェクトの生成
		list01.addElement("DOG");
		list01.addElement("CAT");
		list01.addElement("COW");
		list01.addElement("FOX");
		System.out.println(list01); // [DOG, CAT, COW, FOX]
		
		// 2.Super01 および Super01を継承するオブジェクトをArrayListの生成
		BaseList01<Super01> list02 = new BaseList01<>();
		list02.createList();
		list02.addElement(new Super01());
		list02.addElement(new Sub0101());
		list02.addElement(new Sub0102());
		System.out.println(list02); // [Super01, Sub0101, Sub0102]

	}

}