package S07;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Listから1個の結果を取得する
 */
public class S07L02 {
	public static void main(String[] args) {

		// 1.新規List<Student>オブジェクトの取得
		List<Student> lstd = (new NewStudents()).getStd();
		// 画面表示用オブジェクトの取得
		PrintStudent ps = new PrintStudent();

		ps.printStudentList("1.全員表示", lstd); // 明細表示

		// 2.合計点の取得
		int total = lstd.stream().collect(Collectors.summingInt(s -> s.getMark()));
		System.out.println("2.合計点 = " + total); // 合計表示

		// 3.平均点の取得
		double average = lstd.stream().collect(Collectors.averagingDouble(s -> s.getMark()));
		System.out.println("3.平均点 = " + average); // 平均点表示

		// 4.最低点の取得
		int minMark = 0;
		Optional<Student> minStudent = lstd.stream().collect(Collectors.minBy((s1, s2) -> s1.getMark()));
		if (minStudent.isPresent()) {
			minMark = minStudent.get().getMark();
		}
		System.out.println("4.最低点 = " + minMark); // 最低点表示

		// 5.最高点の取得
		int maxMark = 0;
		Optional<Student> maxStudent = lstd.stream().collect(Collectors.maxBy((s1, s2) -> s1.getMark()));
		if (maxStudent.isPresent()) {
			maxMark = maxStudent.get().getMark();
		}
		System.out.println("5.最高点 = " + maxMark); // 最高点表示

		// 6.生徒の名前を区切り文字でつないで連結表示
		String allName = lstd.stream().map(s -> s.getName()).collect(Collectors.joining("&"));
		System.out.println("6.名前 = " + allName); // 名前表示
		
	}

}