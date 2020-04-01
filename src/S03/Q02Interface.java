package S03;

@FunctionalInterface
public interface Q02Interface {

	default void printString() {
		System.out.println("TEST10");
	}
	
	default void printIntger() {
		System.out.println(100);
	}
	
	static String getString() {
		return "TEST20";
	}
	
	static Integer getInteger() {
		return 200;
	}
	
//	void printLong() {
//		System.out.println(300L);
//	}
//	
//	void printShort() {}
	
	String getObject(String s1);
	
//	String getObject2(Integer i1); // 関数型インターフェースでは、抽象メソッドは1つしかとれない
	
}