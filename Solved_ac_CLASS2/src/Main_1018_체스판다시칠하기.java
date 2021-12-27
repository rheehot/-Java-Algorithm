import java.io.*;
import java.util.*;

public class Main_1018_체스판다시칠하기 {
	static String wStart[][] = {{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"}};
	
	static String bStart[][] = {{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"},
								{"B","W","B","W","B","W","B","W"},
								{"W","B","W","B","W","B","W","B"}};
	
	// 최솟값을 계산하는 메소드
	public static void find(int x, int y) {
		
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
		
		int loopX = N-8;
		int loopY = M-8;
		
		for(int i=0; i<=loopX; i++) {

			
			for(int j=0; j<=loopY; j++) {
				chess[i][j];
			}
		}
		
	}
}
