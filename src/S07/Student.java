package S07;

/*
 * 学生クラス
 */
public class Student {

	String key; // 出席番号(学年2桁、クラス名1桁、番号2桁)
	String name; // 名前
	int mark; // 点数
	String result; // 評価(合格/不合格)

	public Student(String key, String name, int mark) {
		this.key = key;
		this.name = name;
		this.mark = mark;
		this.result = null;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getResult() {
		return result;
	}

	// 合否結果
	public void setResult(String result) {
		this.result = result;
	}

	// 表示用
	public void printDetail() {
		String result_ = "";
		if (getResult() != null) {
			result_ = getResult();
		}
		System.out.println(getKey() +
				" " + getName() +
				" " + getMark() +
				" " + result_ +
				"\n");
	}

}