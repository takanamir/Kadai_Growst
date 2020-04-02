package S05;

public class Student {
	String key;
	String name;
	int mark;
	String result;
	
	public Student(String key, String name, int mark) {
		this.key = key;
		this.name = name;
		this.mark = mark;
		this.result = null;
	}

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

	public String getResult() {
		return result;
	}
	
	void setResult(String result) {
		this.result = result;
	}
	
	void printDetail() {
		String result = "";
		if(getResult() != null) {
			System.out.println(getKey() + 
									" " + getName() + 
									" " + getMark() + 
									" " + result + 
									"\n"
			);
		}
	}
	
}