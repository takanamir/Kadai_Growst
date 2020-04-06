package S07;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * ListからMapを取得する
 */
public class S07L04 {
	public static void main(String[] args) {

		// 新規List<Student>の生成
		List<Student> lstd = (new NewStudents()).getStd();
		// 画面表示用オブジェクトの生成
		PrintStudent ps = new PrintStudent();
		// 合否メッセージ追加オブジェクトの取得
		Function<Student, Student> fc = getFnc();
		// 合否者判断オブジェクトの取得
		Predicate<Student> pd = getPre();
		
		// 1.合否を持つMap<String, Student>を作成
		Map<String, Student> maps1 = lstd.stream()
				.collect(Collectors.mapping(fc, Collectors.toMap(s -> s.getKey(), s -> s)));
		ps.printStudentMap("1.全員表示", maps1);
		
		// 2.合格者のみのMap<String, Student>を作成		
		Map<String, Student> maps2 = lstd.stream()
				.filter(pd)
				.collect(Collectors.mapping(fc, Collectors.toMap(s -> s.getKey(), s -> s)));
		ps.printStudentMap("2.合格者のみ表示", maps2);
		
		// 3.合格者の点数降順表示
		System.out.println("\n" + "3.合格者の点数降順表示\n");
		maps2.entrySet().stream()
				.sorted((s1, s2) -> s2.getValue().getMark() - s1.getValue().getMark())
				.forEach(s -> s.getValue().printDetail());
		
		// 4.学生をクラスごとのMap<クラス名, Student>として取得
		Map<String, List<Student>> maps4 = lstd.stream()
				.collect(Collectors.groupingBy(s -> s.getKey().substring(0, 2), Collectors.toList()));
		ps.printStudentMap2("4.学生をクラスごとに表示", maps4);

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