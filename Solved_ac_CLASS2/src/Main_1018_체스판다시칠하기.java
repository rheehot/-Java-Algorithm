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
	public static void find(int x, int y) {
		// x�� ������Ű�� Ž���ϴ� �ݺ���
		for(int j=0; j<x+8; j++) {
			for(int k=0; k<y+8; k++) {
				
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1018.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
	
		String chess[][] = new String[N][M];
		
		// �Է¹��� ü���� ����
		for(int i=0; i<chess.length; i++) {
			String temp[] = br.readLine().split("");
			for(int j=0; j<temp.length; j++) {
				chess[i][j] = temp[j];
			}
		}
			
		// ������ �ݺ�
		for(int y=0; y<M-8; y++) {
			System.out.println("������ �ݺ� Ƚ�� : " + y);
			// ������ �ݺ�
			int temp = y;
			for(int i=0; i<N-8; i++) {

				for(int j=i; j<i+8; j++) {
					System.out.print(chess[j][temp]);
					temp ++;
				}
				temp = 0;
				System.out.println("");
			}
		}

	}
}
