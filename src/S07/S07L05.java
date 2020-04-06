package S07;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Listからキーごとの要素を持つMapを取得する
 */
public class S07L05 {
	public static void main(String[] args) {

		// 新規List<Student>オブジェクトの取得
		List<Student> lstd = (new NewStudents()).getStd();
		// 画面表示用オブジェクトの取得
		PrintStudent ps = new PrintStudent();

		// 1.学年ごとの最高点を取得
		Map<String, Optional<Student>> mapd1 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 2),
						Collectors.maxBy((s1, s2) -> s1.getMark() - s2.getMark())));
		ps.printStudentMap4("1.学年ごとの最高点", mapd1);

		// 2.学年ごとの合計点
		Map<String, Long> mapd2 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 2),
						Collectors.summingLong(s -> s.getMark())));
		ps.printStudentMap3("2.学年ごとの合計点", mapd2);

		// 3.学年ごとの平均点を取得
		Map<String, Double> mapd3 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 2),
						Collectors.averagingInt(s -> s.getMark())));
		ps.printStudentMap5("3.学年ごとの平均点", mapd3);

	}

}