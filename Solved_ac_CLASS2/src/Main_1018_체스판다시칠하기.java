import java.io.*;
import java.util.*;

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
		int count = 0;
		int i=0;
		int j=0;
		
		char first = temp[0][0].charAt(0);
		System.out.println("first : " + first);
		
		if(first == 'B') {
			while(i<8) {
				j = 0;
				while(j<8) {
			
					if(temp[i][j].charAt(0) != bStart[i][j].charAt(0)) {
						count ++;
					}
					j++;
				}
				i++;
			}
		}
		else if(first == 'W') {
			while(i<8) {
				j = 0;
				while(j<8) {
					if(temp[i][j].charAt(0) != wStart[i][j].charAt(0)) {
						count ++;
					}
					j++;
				}
				i++;
			}
		}
		
		System.out.println(" count : " + count);
		
		return count;
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
		for(int x=0; x<N-8; x++) {
			String temp[][] = new String[8][8];

			for(int y=0; y<M-8; y++) {
				int g = 0;
				for(int i=x; i<x+8; i++) {
					int s = 0;
					for(int j=y; j<y+8; j++) {
						System.out.println(chess[i][j]);
						//System.out.println(" g: " + g + " s: " + s);
						temp[g][s] = chess[i][j];
						
						if(g == 7 && s == 7) {
							num = find(temp);
							System.out.println(" num : " + num);
							
							if(num < min) {
								min = num;
							}
						}
						
						s++;
					}
					g++;
					System.out.println(" ");
				}
				System.out.println(" ");
			}
		}

		System.out.println("min : " + min);
		
	}
}
