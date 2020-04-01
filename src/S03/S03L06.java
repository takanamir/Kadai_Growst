package S03;

/**
 * 関数型インターフェースのオブジェクト生成と利用方法
 * @author Owner
 *
 */
public class S03L06 {

	public static void main(String[] args) {

		CheckWonLottery cw = new CheckWonLottery() {
			public String check(Integer n1, Integer n2) {
				if (n1.equals(n2)) {
					return "的中";
				} else {
					return "はずれ";
				}
			}
		};

		// 宝くじ番号: 105555, 当選番号:105559
		String result1 = cw.check(105555, 105559);
		System.out.println(result1); // はずれ

		// 宝くじ番号: 105559, 当選番号:105559
		String result2 = cw.check(105559, 105559);
		System.out.println(result2); // 的中
	}

}