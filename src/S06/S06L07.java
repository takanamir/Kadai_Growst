package S06;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/*
 * 関数型インターフェースを利用して検索する
 */
public class S06L07 {
	public static void main(String[] args) {
		// 検索処理
		Map<String, String> bloodMap = new HashMap<>();
		bloodMap.put("A", "威風堂々とした人です");
		bloodMap.put("B", "芸術に優れた人です");
		bloodMap.put("O", "責任感の強い人です");
		bloodMap.put("AB", "几帳面な人です");
		
		BiFunction<Map<String, String>, String, String> bif = (m, s) -> m.get(s);
		
		String bloodType = "AB";
		String bloodChar = bif.apply(bloodMap, bloodType);
		System.out.println(bloodType + "型は" + bloodChar);
	}
}