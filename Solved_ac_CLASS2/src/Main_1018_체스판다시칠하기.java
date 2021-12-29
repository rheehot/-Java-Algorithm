import java.io.*;

public class Main_1018_ü���Ǵٽ�ĥ�ϱ� {
	// ���� ü���� ����
	final static String wStart[][] = {{"W","B","W","B","W","B","W","B"},
									  {"B","W","B","W","B","W","B","W"},
									  {"W","B","W","B","W","B","W","B"},
									  {"B","W","B","W","B","W","B","W"},
									  {"W","B","W","B","W","B","W","B"},
								      {"B","W","B","W","B","W","B","W"},
									  {"W","B","W","B","W","B","W","B"},
									  {"B","W","B","W","B","W","B","W"}};
	
	final static String bStart[][] = {{"B","W","B","W","B","W","B","W"},
								      {"W","B","W","B","W","B","W","B"},
								      {"B","W","B","W","B","W","B","W"},
								      {"W","B","W","B","W","B","W","B"},
								      {"B","W","B","W","B","W","B","W"},
								      {"W","B","W","B","W","B","W","B"},
								      {"B","W","B","W","B","W","B","W"},
								      {"W","B","W","B","W","B","W","B"}};
	
	// �ּڰ��� ����ϴ� �޼ҵ�
	public static int find(String[][] temp) {
		int count1 = 0;
		int count2 = 0;
		int result = 0;
		int i=0;
		int j=0;
		
		char first = temp[0][0].charAt(0);

			while(i<8) {
				j = 0;
				while(j<8) {
					if(temp[i][j].charAt(0) != bStart[i][j].charAt(0)) {
						count1 ++;
					}
					
					if(temp[i][j].charAt(0) != wStart[i][j].charAt(0)) {
						count2 ++;
					}
					
					j++;
				}
				i++;
			}

		result = Math.min(count1, count2);
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1018.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int min = Integer.MAX_VALUE;
		int num = 0;
		
		String arr[] = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
	
		String chess[][] = new String[N][M];
		
		// �Է¹��� ü���� ����
		for(int i=0; i<chess.length; i++) {
			String arr2[] = br.readLine().split("");
			for(int j=0; j<arr2.length; j++) {
				chess[i][j] = arr2[j];
			}
		}
		
		// 1. ���θ� �������� ������ �о�鼭 ü������ �����ϰ�
		// 2. ���θ� �������� ���̻� �о ������ ���ٸ� ������ ��ĭ �������� �� ������ �ٽ� �ݺ�
		for(int x=0; x<=N-8; x++) {
			String temp[][] = new String[8][8];

			for(int y=0; y<=M-8; y++) {
				int g = 0;
				
				for(int i=x; i<=x+7; i++) {
					int s = 0;
					
					for(int j=y; j<=y+7; j++) {
						temp[g][s] = chess[i][j];
						
						if(g == 7 && s == 7) {
							num = find(temp);

							
							// ���� ���ο� �� num�� ���ݱ����� �ּڰ� min���� �۴ٸ�
							// �Ǵ� ���ݱ����� �ּڰ� min ���� ���ο� �� num�� ũ�ٸ� 
							// min�ּڰ��� num������ �����Ѵ�.
							// �̷��� �ؼ� ���������� ���� ���� �ּڰ��� ã�Ƴ���.
							min = Math.min(num, min);
						}
						
						s++;
					}
					g++;
				}
			}
		}

		System.out.println(min);

	}
}
