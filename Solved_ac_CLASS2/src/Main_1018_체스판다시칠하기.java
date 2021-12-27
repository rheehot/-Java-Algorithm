import java.io.*;
import java.util.*;

public class Main_1018_체스판다시칠하기 {
	// 비교할 체스판 생성
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
	
	// 최솟값을 계산하는 메소드
	public static void find(int x, int y) {
		// x를 증가시키며 탐색하는 반복문
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
		
		// 입력받은 체스판 생성
		for(int i=0; i<chess.length; i++) {
			String temp[] = br.readLine().split("");
			for(int j=0; j<temp.length; j++) {
				chess[i][j] = temp[j];
			}
		}
			
		// 세로축 반복
		for(int y=0; y<M-8; y++) {
			System.out.println("세로축 반복 횟수 : " + y);
			// 가로축 반복
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
