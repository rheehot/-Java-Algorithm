import java.io.*;
import java.util.*;

public class Main_10871_X���������� {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_10871.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �������� ������ ����
		// ���⸦ �������� ���ڿ� �迭�� ����
		String temp[] = br.readLine().split(" ");
		int length = Integer.parseInt(temp[0]);
		int range = Integer.parseInt(temp[1]);
		
		List<String> list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		System.out.println(st.countTokens());
		
		for(int i=0; i<st.countTokens(); i++) {
			list.add(st.nextToken());
		}
		
		System.out.println(list);
	}

}
