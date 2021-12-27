import java.io.*;

public class Main_1018_체스판다시칠하기 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1018.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		String chess[][] = new String[N][M];
		
		for(int i=0; i<chess.length; i++) {
			String temp[] = br.readLine().split("");
			for(int j=0; j<temp.length; j++) {
				System.out.print(temp[j]);
			}
			System.out.println(" ");
		}
	}
}
