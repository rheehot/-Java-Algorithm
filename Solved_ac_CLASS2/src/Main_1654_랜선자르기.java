import java.io.*;
import java.util.*;

public class Main_1654_랜선자르기 {
	
	private static int find(List<Integer> list, int half) {
		int count = 0;

		for(int num : list) {
			count += num / half;
		}
		
		System.out.println(" count : " + count);
		
		return count;
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1654.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int max = 0;
		int min = 0;
		int num = 0;
		List<Integer> list = new ArrayList<>();
		
		
		for(int i=0; i<K; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		int half = Collections.min(list)/2;
		int testCounting = 0;
		for(;;) {
			System.out.println(" min : " + min + " max : " + max);
			num = find(list, half);
			
			if(num < N) {
				half = half/2;
				max = half*2;
				min = half;
			}
			// half값을 이전 값으로 다시 수정
			else if(num > N) {
				half = (min + max) / 2;
				min = half;
				//max = 
			}
			
			System.out.println("half : " + half);
			if(testCounting == 3) {
				break;
			}
			
			testCounting++;
			System.out.println(" ");
		}
		
	}

}
