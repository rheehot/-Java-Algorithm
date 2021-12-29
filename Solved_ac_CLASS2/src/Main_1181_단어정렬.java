import java.io.*;
import java.util.*;

public class Main_1181_�ܾ����� {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1181.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hashmap = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		int loop = Integer.parseInt(br.readLine());
		
		for(int i=0; i<loop; i++) {
			String temp = br.readLine();
			int length = temp.length();
			
			hashmap.put(temp, hashmap.getOrDefault(temp, length));
		}
		
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashmap.entrySet());
	
		//iterator.hasNext()�� ���� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ�
		entryList.sort(Map.Entry.comparingByKey());
		entryList.sort(Map.Entry.comparingByValue());
		
		for(Map.Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey());
		}
		
		
	}
}
