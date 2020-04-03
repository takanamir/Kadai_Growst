package S05;

import java.util.Arrays;
import java.util.List;

public class S05Q02 {

	// 動物名取得メソッド
	static String getJAnimal(String eAnimal, String[][] name) {
		for (int i = 0; i < name.length; ++i) {
			if (eAnimal.equals(name[i][0])) {
				return name[i][1];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// 処理対象コレクション
		List<String> allAnimal = Arrays.asList("CAT", "COW", "DOG", "FOX");

		// 2次元配列動物名称配列
		String[][] animalName = { { "CAT", "猫" }, { "COW", "牛" }, { "DOG", "犬" }, { "FOX", "狐" } };

		// 1.ラムダ式を使わない方法(従来のプログラム)
		System.out.println("1: ラムダ式を使わない方法");
		for (String animal : allAnimal) {
			String eAnimal = animal.substring(0, 3);
			String jAnimal = getJAnimal(eAnimal, animalName);
			System.out.println(eAnimal + "は" + jAnimal + "です");
		}

		// 2.forEachのみを使う方法
		System.out.println("\n2: forEachのみを使う方法");
		allAnimal.forEach(animal -> {
			String eAnimal = animal.substring(0, 3);
			String jAnimal = getJAnimal(eAnimal, animalName);
			System.out.println(eAnimal + "は" + jAnimal + "です");
		});

		// 3.mapとforEachを使う方法
		System.out.println("\n3: mapとforEachを使う方法");
		allAnimal.stream()
		.map(a -> a.substring(0, 3) + "は" + getJAnimal(a.substring(0, 3), animalName) + "です")
		.forEach(a -> System.out.println(a));
	}
}