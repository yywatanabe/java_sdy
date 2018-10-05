package java_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InputTest3 extends ExtTest implements iInterfaceTest{
	public void input() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("値を入力(日時):");
		while (true) {
			try {
//				System.out.println("connection");
//				System.out.println("SQL文");

				String str = br.readLine();
				DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//				df.setLenient(false);
//				parse メソッドに変換したい文字列を指定することで文字列を日付データに変換
				df.format(df.parse(str));


				System.out.print("strの長さ＝"+str.length());
				System.out.println("\n");
				System.out.println(str);

				if (!str.matches("^[1-2][0-9]{3}/[01]?[0-9]/[0123]?[0-9]$")) {
					System.out.println("if文中のthrowが実行されます⑴");
					throw new ParseException(str, 0);
				}

			} catch (NumberFormatException n) {
				System.out.println("inputメソッドのNumberFormatExceptionが実行されました");
				System.out.print("\n正しい値を入力してください：");
				continue;

			}
			catch (ParseException d) {
				System.out.println("inputメソッドのParseExceptionが実行されました");
				System.out.print("\n正しい値を入力してください：");
				continue;

			}
			System.out.println("break前 result stetement connection clase");
			break;
		}
	}
}
