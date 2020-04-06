package S07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Listから真偽ごとのMapを取得する
 */
public class S07L06 {
	public static void main(String[] args) {
		// 新規List<Student>の生成
		List<Student> lstd = (new NewStudents()).getStd();
		// 画面表示用オブジェクトの生成
		PrintStudent ps = new PrintStudent();
		
		// 1.List<Student> -> Map<Boolean, List<Student>>
		Map<Boolean, List<Student>> mapd1 = lstd.stream()
				.collect(Collectors.partitioningBy(s -> s.getMark() >= 70));
		ps.printStudentBoMap("真偽による表示", mapd1);
	}
}