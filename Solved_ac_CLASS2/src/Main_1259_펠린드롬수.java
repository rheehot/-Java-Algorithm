import java.io.*;
import java.util.*;

public class Main_1259_Æç¸°µå·Ò¼ö {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1259.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int loopCount = Integer.parseInt(br.readLine());
		
		for(int i=0; i<loopCount; i++) {
			String arr[] = br.readLine().split(" ");
			int loopCount2 = Integer.parseInt(arr[0]);
			int strLength = arr[1].length();
			String str = arr[1];
			String temp = "";
			
			for(int j=0; j<strLength; j++) {
				for(int k=0; k<loopCount2; k++) {
					temp += str.charAt(i);
				}
				
			}
			System.out.print(temp);
			System.out.println(" ");
		}
		
		br.close();
	}
}
