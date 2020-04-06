package S07;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class PrintStudent {

	// List<Student> の明細表示
	void printStudentList(String title, List<Student> lists) {
		System.out.println("\n" + title);
		for (Student s : lists) {
			s.printDetail();
		}
	}

	// Set<Student> の明細表示
	void printStudentSet(String title, Set<Student> sets) {
		System.out.println("\n" + title);
		for (Student s : sets) {
			s.printDetail();
		}
	}

	// Map<String, Student> の明細表示
	void printStudentMap(String title, Map<String, Student> maps) {
		System.out.println("\n" + title);
		for (String key : maps.keySet()) {
			Student s = maps.get(key);
			s.printDetail();
		}
	}

	// Map<String, List<Student>> の明細表示
	void printStudentMap2(String title, Map<String, List<Student>> maps) {
		System.out.println("\n" + title);
		for (String key : maps.keySet()) {
			System.out.println("[クラス名]: " + key + "]");
			List<Student> students = maps.get(key);
			for (int i = 0; i < students.size(); i++) {
				Student s = students.get(i);
				s.printDetail();
			}
		}
	}

	// Map<String, Long> の合計表示
	void printStudentMap3(String title, Map<String, Long> maps) {
		System.out.println("\n" + title);
		for (String key : maps.keySet()) {
			Long total = maps.get(key);
			System.out.println(key + " 合計" + total + "点");
		}
	}

	// Map<String, Optional<Student>> の最高点表示
	void printStudentMap4(String title, Map<String, Optional<Student>> maps) {
		System.out.println("\n" + title);
		for (String key : maps.keySet()) {
			Optional<Student> maxStudent = maps.get(key);
			if (maxStudent.isPresent()) {
				Student s = maxStudent.get();
				System.out.println(key + " 最高" + s.getMark() + "点");
			}
		}
	}

	// Map<String, Double> の平均点表示
	void printStudentMap5(String title, Map<String, Double> maps) {
		System.out.println("\n" + title);
		for (String key : maps.keySet()) {
			Double ave = maps.get(key);
			System.out.println(key + " 平均" + ave + "点");
		}
	}

	// Map<Boolean, List<Student>> の明細表示
	void printStudentBoMap(String title, Map<Boolean, List<Student>> maps) {
		System.out.println("\n" + title);
		List<Student> listTrue = maps.get(true);
		if(listTrue.size() != 0) {
			System.out.println("\n" + "[合格者]");
		}
		for(Student s: listTrue) {
			s.printDetail();
		}
		List<Student> listFalse = maps.get(false);
		if(listFalse.size() != 0) {
			System.out.println("\n" + "[不合格者]");
		}
		for(Student s: listFalse) {
			s.printDetail();
		}
	}

}