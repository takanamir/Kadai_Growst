package S02;

// 型パラメータサンプルプログラム
public class S02L03 {

	public static void main(String[] args) {
		Base01<String> b01 = new Base01<>("Base01 String");
		System.out.println(b01.getT()); // Base01 String
		Base01<Integer> b02 = new Base01<>(100);
		System.out.println(b02.getT()); // 100
		Base02<Super01> b03 = new Base02<>(new Super01());
		System.out.println(b03.getT()); // Super01
		
		System.out.println(b01); // Base01
		System.out.println(b02); // Base01
		System.out.println(b03); // Base02
	}

}