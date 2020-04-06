package S07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S07Q02 {
	public static void main(String[] args) {
		// List<Student> の生成
		List<Student> student1 = Arrays.asList(
				new Student("01A01", "青木", 50),
				new Student("01A02", "青山", 70),
				new Student("01B01", "伊藤", 40)
				);
		
		List<Student> student2 = Arrays.asList(
				new Student("01B02", "伊林", 90),
				new Student("02A01", "川井", 60),
				new Student("02A02", "川村", 80)
				);
		
		// コレクションの合体
		List<List<Student>> listStudent = Arrays.asList(student1, student2);
		
		// 平坦化
		List<Student> flatStudent = listStudent.stream()
				.flatMap(a -> a.stream())
				.collect(Collectors.toList());
	}
}