import java.io.*;

public class Main_1085_���簢������Ż�� {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1085.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		
		// x, y, w, h�� ����
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		// (x, y)�� ������ �ִ� ��ġ
		
		int w = Integer.parseInt(arr[2]);
		int h = Integer.parseInt(arr[3]);
		// (w,h)�� w�� ���簢���� ���α���, h�� ���簢���� ���α���
		
		int row1 = Math.abs(w - x);
		int row2 = Math.abs(0 - x);
		
		int col1 = Math.abs(h - y);
		int col2 = Math.abs(0 - y);
		
		int rowMin = Math.min(row1, row2);
		int colMin = Math.min(col1, col2);
		
		System.out.println(Math.min(rowMin, colMin));
		br.close();
	}
}
