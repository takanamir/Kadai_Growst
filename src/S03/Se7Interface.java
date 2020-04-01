package S03;

public interface Se7Interface {

	// 定数
	public static int fromHeiseiYear = 1989; // 昭和64年

	// 抽象メソッド(abstractは修飾子省略可能)
	abstract String getStringData(String inData);
	abstract Integer getInteger(Integer inInteger); 
	
}