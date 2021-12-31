import java.util.*;

public class Test1 {

	    public int solution(String[][] schedule) {
	    	// 苞格 府胶飘 积己
	    	List<String> sub1 = new ArrayList<>();
	    	List<String> sub2 = new ArrayList<>();
	    	List<String> sub3 = new ArrayList<>();
	    	List<String> sub4 = new ArrayList<>();
	    	
	    	int count = 0;
	 
	        for(int i=0; i<4; i++) {
	        	sub1.add(schedule[0][i]);
	        	sub2.add(schedule[1][i]);
	        	sub3.add(schedule[2][i]);
	        	sub4.add(schedule[3][i]);
	        }
	        
	        for(int i=0; i<4; i++) {
	        	
	        }
	        
	        
	        int answer = 0;
	        return answer;
	    }
	    
	    public static void main(String[] args) {
	        Test1 s = new Test1();

	        String arr[][] = {{"MO 12:00 WE 14:30", "MO 12:00", "MO 15:00", "MO 18:00"}, 
	        {"TU 09:00", "TU 10:00", "TU 15:00", "TU 18:00"},
	         {"WE 09:00", "WE 12:00", "WE 15:00", "WE 18:00"},
	          {"TH 09:30", "TH 11:30", "TH 15:00", "TH 18:00"}, 
	          {"FR 15:00", "FR 15:00", "FR 15:00", "FR 15:00"}};

	        System.out.println(s.solution(arr));
	    }
	}



