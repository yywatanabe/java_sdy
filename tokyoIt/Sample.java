package java_std01;

public class Sample4 {
	public static void main(String[] args) {
		//アドレス空間
		int[] address = {1,2,3};
		System.out.println("配列変数を出力＝" + address);
		System.out.println("address[1]を出力＝" + address[1]);

		//配列の長さを調べる
		int[][] test3 = {{1,2},{3,4,5},{6,7,8,9}};
		int[][] test2 = {{1,2},{3,4,5}};
		System.out.println("test3.lengthを出力＝" + test3.length);
		System.out.println("同上test2＝" + test2.length);
		System.out.println("test3[2].lengthを出力＝" + test3[2].length);
		System.out.println("同上test2＝" + test2[1].length);
	}
}
