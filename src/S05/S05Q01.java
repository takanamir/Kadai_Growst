package S05;

import java.util.Arrays;
import java.util.List;

public class S05Q01 {
	public static void main(String[] args) {
		List<String> allAnimal = Arrays.asList("[CAT:猫]", "[COW:牛]", "[DOG:犬]", "[FOX:狐]");
		
		// 1.ラムダ式を使わない方法(従来のプログラム)
		System.out.println("1: ラムダ式を使わない方法");
		for(String animal: allAnimal) {
			String eAnimal = animal.substring(1,4);
			String jAnimal = animal.substring(5,6);
			System.out.println(eAnimal + "は" + jAnimal + "です");
		}
		
		// 2.forEachのみを使う方法
		System.out.println("\n2: forEachのみを使う方法");
		allAnimal.forEach(animal -> 
					{
						String eAnimal = animal.substring(1,4);
						String jAnimal = animal.substring(5,6);
						System.out.println(eAnimal + "は" + jAnimal + "です");
					}
				);
		
		// 3.mapとforEachを使う方法
		System.out.println("\n3: ストリームにラムダ式を使う方法");
		allAnimal.stream()
				.map(a -> a.substring(1, 4) + "は" + a.substring(5,6) + "です")
				.forEach(a -> System.out.println(a));

	}
}