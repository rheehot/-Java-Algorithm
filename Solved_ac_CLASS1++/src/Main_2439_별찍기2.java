import java.io.*;

public class Main_2439_별찍기2 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_2439.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		// count 만큼의 자릿수는 계속 나와야 됨
		for(int i=count; i>0; i--) {
			// 공백넣는 반복문
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<(count - i) + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
