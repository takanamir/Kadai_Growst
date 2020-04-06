package S07;

import java.util.Comparator;

public class SortRule implements Comparator<Student> {
	// Comparatorインターフェースの実装
	public int compare(Student s1, Student s2) {
		return new Integer(s2.getMark()).compareTo(s1.getMark()); // 降順
	}
}