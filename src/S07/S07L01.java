package S07;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * List<Student>を取得する
 */
public class S07L01 {
	public static void main(String[] args) {

		// 画面表示用オブジェクトの生成
		PrintStudent ps = new PrintStudent();

		// 合否メッセージ追加オブジェクトの取得
		Function<Student, Student> fc = getFnc();

		// 合否者判断オブジェクトの取得
		Predicate<Student> pd = getPre();

		// 1.新規List<Student>の生成
		List<Student> lstd1 = (new NewStudents()).getStd();
		ps.printStudentList("1.全員表示", lstd1); // 明細表示、合否未設定

		// 2.合否を持つList<Student>を作成
		List<Student> stds2 = lstd1.stream()
				.collect(Collectors.mapping(fc, Collectors.toList()));
		ps.printStudentList("2.全員表示", stds2); // 明細表示、合格設定

		// 3.合格者のみのList<Student>を作成
		List<Student> stds3 = lstd1.stream()
				.filter(pd).collect(Collectors.mapping(fc, Collectors.toList()));
		ps.printStudentList("3.合格者のみの表示", stds3); // 明細表示

		// 4.合格者の点数降順にList<Student>を作成
		List<Student> stds4 = lstd1.stream()
				.filter(pd).sorted(new SortRule()).collect(Collectors.mapping(fc, Collectors.toList()));
		ps.printStudentList("4.合格者の点数降順表示", stds4); // 明細表示
		
	}

	// Function<Student, Student> オブジェクトの取得
	static Function<Student, Student> getFnc() {
		Function<Student, Student> fnc = s -> {
			String result;
			if (s.getMark() >= 70)
				result = "合格";
			else
				result = "不合格";
			s.setResult(result);
			return s;
		};
		return fnc;
	}

	// Predicate<Student> オブジェクトの取得
	static Predicate<Student> getPre() {
		Predicate<Student> pre = s -> s.getMark() >= 70;
		return pre;
	}

}