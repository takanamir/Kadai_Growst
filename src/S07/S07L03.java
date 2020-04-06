package S07;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * ListからSetを取得する
 */
public class S07L03 {
	public static void main(String[] args) {

		// 新規List<Student>の生成
		List<Student> lstd = (new NewStudents()).getStd();
		// 画面表示用オブジェクトの生成
		PrintStudent ps = new PrintStudent();
		// 合否メッセージ追加オブジェクトの取得
		Function<Student, Student> fc = getFnc();
		// 合否者判断オブジェクトの取得
		Predicate<Student> pd = getPre();

		// 合否を持つList<Student>を作成
		List<Student> lstd1 = lstd.stream()
				.collect(Collectors.mapping(fc, Collectors.toList()));

		// List<Student>をSet<Student>に作り直す
		Set<Student> stds1 = lstd.stream()
				.collect(Collectors.toSet());

		// 1.Set<Student>の明細表示
		ps.printStudentSet("1.全員表示", stds1);

		// 2.List<List<Student>>から合格者のみのSet<Student>を取得
		Set<Student> stds2 = lstd1.stream()
				.filter(pd)
				.collect(Collectors.toSet());
		ps.printStudentSet("2.合格者のみの表示", stds2);

		// 3.2のを合格者のみ点数の降順に表示
		System.out.println("\n3.合格者の点数降順表示");
		stds2.stream()
				.filter(pd)
				.sorted(new SortRule())
				.forEach(s -> s.printDetail());
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