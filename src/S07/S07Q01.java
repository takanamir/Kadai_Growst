package S07;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class S07Q01 {
	public static void main(String[] args) {
		// 新規List<Student>の生成
		List<Student> lstd = (new NewStudents()).getStd();
		// 画面表示用オブジェクトの生成
		PrintStudent ps = new PrintStudent();
		
		// 1.明細表示
		ps.printStudentList("1.明細表示", lstd);
		
		// 2.クラスごとの点数の最大値を取得
		Map<String, Optional<Student>> mapd1 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 3),
						Collectors.maxBy((s1, s2) -> s1.getMark() - s2.getMark())));
		ps.printStudentMap4("2.クラスごとの最高点", mapd1);
		
		// 3.クラスごとの点数の合計点を取得
		Map<String, Long> mapd2 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 3),
						Collectors.summingLong(s -> s.getMark())));
		ps.printStudentMap3("3.クラスごとの合計点", mapd2);
		
		// 4.クラスごとの平均点を取得
		Map<String, Double> mapd3 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 3),
						Collectors.averagingInt(s -> s.getMark())));
		ps.printStudentMap5("4.クラスごとの平均点", mapd3);
	}
}