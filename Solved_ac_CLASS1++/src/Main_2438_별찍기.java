import java.io.*;

public class Main_2438_º°Âï±â {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_2438.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=count; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
