package S02;

import java.util.ArrayList;
import java.util.List;

public class S02L06 {

	public static void main(String[] args) {
		List<Super01> list01 = new ArrayList<>();
		list01.add(new Super01());
		list01.add(new Sub0101());
		list01.add(new Sub0102());
		
		System.out.println(list01.get(0)); // Super01
		System.out.println(list01.get(1)); // Sub0101
		System.out.println(list01.get(2)); // Sub0102
		System.out.println(list01); // [Super01, Sub0101, Sub0102]
		
		// 取り出すとき
		Super01 s01 = list01.get(2); // 取得時の左辺はスーパークラス
	}

}