package java_test;

public class Main {
	public static void main(String[] args) {

		try {
		InputTest3 test = new InputTest3();
		test.input();
		}catch (Exception e) {
			System.out.println("mainメソッドのExceptionが実行されました");
		}
	}
}
