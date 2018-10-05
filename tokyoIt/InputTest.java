//参考://hiyokko-se.com/java_datevalidity
//				System.out.println("strのクラス型＝" + str.getClass());
//				printf関数
//				if (str.length() == 0) {
//					System.out.println("入力0文字でした");
//				}

package java_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputTest extends ExtTest implements iInterfaceTest{
	public void input() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("値を入力:");
		while (true) {
			try {
//				System.out.println("connection");
//				System.out.println("SQL文");

				String str = br.readLine();
				System.out.printf("strの値＝%-18s",str);
				System.out.println("\n");
				int num = Integer.parseInt(str);
				System.out.println("numの値=" + num);
				if (!(num >= 1 && num <= 5)) {
					System.out.println("if文中のthrowが実行されます⑴");
					throw new NumberFormatException();
				}

			} catch (NumberFormatException n) {
				System.out.println("inputメソッドのNumberFormatExceptionが実行されました");
				System.out.print("\n正しい値を入力してください：");
				continue;

			}
			System.out.println("break前 result stetement connection clase");
			break;
		}
	}
}
